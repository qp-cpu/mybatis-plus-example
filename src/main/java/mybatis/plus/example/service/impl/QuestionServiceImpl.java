package mybatis.plus.example.service.impl;

import mybatis.plus.example.entity.Question;
import mybatis.plus.example.dao.QuestionMapper;
import mybatis.plus.example.service.QuestionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author qp
 * @since 2020-01-15
 */
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question> implements QuestionService {

}
