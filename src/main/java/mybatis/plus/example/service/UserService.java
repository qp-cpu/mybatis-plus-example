package mybatis.plus.example.service;

import mybatis.plus.example.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author qp
 * @since 2020-01-06
 */
public interface UserService extends IService<User> {

    User selectByid(Integer id);

    Object findUserList(Integer pageNo, Integer pageSize);
}
