package mybatis.plus.example.controller;


import mybatis.plus.example.entity.User;
import mybatis.plus.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

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
    
}
