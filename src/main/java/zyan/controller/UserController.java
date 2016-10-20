package zyan.controller;

/**
 * Created by zouye on 2016/10/19.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import zyan.pojo.User;
import zyan.service.UserService;

@Controller
@EnableConfigurationProperties
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/user/{id}")
    @ResponseBody
    public User getUserById(@PathVariable Long id){
        return userService.findUserById(id);
    }

    @RequestMapping(value="/user/name/{name}")
    @ResponseBody
    public User findUserByName(@PathVariable String name){
        return userService.findUserByName(name);
    }
}
