package cloud.makeronbean.chos1npm.user.controller;

import cloud.makeronbean.chos1npm.common.result.Result;
import cloud.makeronbean.chos1npm.model.pojo.UserInfo;
import cloud.makeronbean.chos1npm.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author makeronbean
 * @createTime 2022-11-05  19:53
 * @description TODO
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 根据用户名查询用户信息
     * /user/showUserByUserId
     */
    @GetMapping("/showUserByUserId/{userId}")
    public Result showUserByUserId(@PathVariable Long userId) {
        UserInfo userInfo = userService.getById(userId);
        return Result.ok(userInfo);
    }
}
