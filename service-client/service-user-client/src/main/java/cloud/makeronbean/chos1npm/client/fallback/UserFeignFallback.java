package cloud.makeronbean.chos1npm.client.fallback;

import cloud.makeronbean.chos1npm.client.UserFeignClient;
import cloud.makeronbean.chos1npm.model.pojo.UserInfo;

/**
 * @author makeronbean
 * @createTime 2022-11-05  20:09
 * @description TODO
 */
public class UserFeignFallback implements UserFeignClient {
    @Override
    public UserInfo getUserById(Long userId) {
        return null;
    }
}
