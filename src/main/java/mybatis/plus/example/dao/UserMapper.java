package mybatis.plus.example.dao;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javafx.scene.control.Pagination;
import mybatis.plus.example.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import mybatis.plus.example.entity.UserQuestionVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

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

    @Select( "SELECT user.*,question.`title` FROM question,user WHERE user.id=question.creator")
    List<UserQuestionVo> getUserQuestion(Page<UserQuestionVo> page);
}
