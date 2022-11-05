package cloud.makeronbean.chos1npm.client;

import cloud.makeronbean.chos1npm.client.fallback.UserFeignFallback;
import cloud.makeronbean.chos1npm.common.result.Result;
import cloud.makeronbean.chos1npm.model.pojo.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author makeronbean
 * @createTime 2022-11-05  20:08
 * @description TODO
 */
@FeignClient(value = "service-user",fallback = UserFeignFallback.class)
public interface UserFeignClient {

    /**
     * 根据用户名查询用户信息
     * /user/showUserByUserId
     */
    /**
     * 根据id获取UserInfo
     * /user/api/getUserById/{userId}
     */
    @GetMapping("/user/api/getUserById/{userId}")
    UserInfo getUserById(@PathVariable Long userId)  ;
}