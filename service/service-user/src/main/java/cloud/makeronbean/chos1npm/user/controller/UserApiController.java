package cloud.makeronbean.chos1npm.user.controller;

import cloud.makeronbean.chos1npm.model.pojo.UserInfo;
import cloud.makeronbean.chos1npm.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author makeronbean
 * @createTime 2022-11-05  20:59
 * @description TODO
 */
@RestController
@RequestMapping("/user/api")
public class UserApiController {

    @Autowired
    private UserService userService;

    /**
     * 根据id获取UserInfo
     * /user/api/getUserById/{userId}
     */
    @GetMapping("/getUserById/{userId}")
    public UserInfo getUserById(@PathVariable Long userId) {
        return userService.getById(userId);
    }
}
