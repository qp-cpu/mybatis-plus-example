package mybatis.plus.example.dao;

import mybatis.plus.example.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author qp
 * @since 2020-01-06
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
