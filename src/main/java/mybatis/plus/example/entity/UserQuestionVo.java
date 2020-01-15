package mybatis.plus.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserQuestionVo implements Serializable {
    @ApiModelProperty(value = "用户主键id")
    @TableId(value = "id" ,type = IdType.AUTO)
    private Integer id;

    private String accountId;

    private String name;

    private String token;

    private Long gmtCreate;

    private Long gmtModified;

    private String bio;

    private String avatarUrl;

    @TableField("question_title")
    private String title;

}
