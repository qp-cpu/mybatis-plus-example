package mybatis.plus.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import mybatis.plus.example.entity.User;
import mybatis.plus.example.dao.UserMapper;
import mybatis.plus.example.entity.UserQuestionVo;
import mybatis.plus.example.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author qp
 * @since 2020-01-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public User selectByid(Integer id) {
        return baseMapper.selectById(id);
    }

    @Override
    public Object findUserList(Integer pageNo, Integer pageSize) {
        IPage<User> page = new Page<>(pageNo, pageSize);
        QueryWrapper<User> wrapper=new QueryWrapper<>();
        wrapper.orderByAsc("gmt_create");
        IPage<User> userIPage =baseMapper.selectPage(page,wrapper);
        return userIPage;
    }

    @Override
    public Page<UserQuestionVo> getQuestionStudent(Page<UserQuestionVo> page) {
        return page.setRecords( baseMapper.getUserQuestion( page ) );
    }
}
