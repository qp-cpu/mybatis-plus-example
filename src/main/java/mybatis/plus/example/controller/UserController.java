package mybatis.plus.example.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import mybatis.plus.example.entity.User;
import mybatis.plus.example.entity.UserQuestionVo;
import mybatis.plus.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author qp
 * @since 2020-01-06
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/select/{id}")
    public User selectByid(@PathVariable("id") Integer id)
    {
      return  userService.selectByid(id);
    }

    @GetMapping("/pagelist")
    public Object findUserList(@RequestParam("pageNo") Integer pageNo, @RequestParam("pageSize") Integer pageSize)
    {
        return  userService.findUserList(pageNo,pageSize);
    }

    /**
     * 添加多表关联查询接口
     * @param page
     * @param size
     * @return
     */

    @GetMapping("/getAllQuestionWithStudentByPage/{page}/{size}")
    public Map<String, Object> getAllQuestionWithStudentByPage(@PathVariable Integer page, @PathVariable Integer size) {
        Map<String, Object>  map             = new HashMap<>();
        Page<UserQuestionVo> questionStudent = userService.getQuestionStudent(new Page<>(page, size));
        if (questionStudent.getRecords().size() == 0) {
            map.put("code", 400);
        } else {
            map.put("code", 200);
            map.put("data", questionStudent);
        }
        return map;
    }


    
}
