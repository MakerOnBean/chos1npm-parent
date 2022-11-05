package cloud.makeronbean.chos1npm.gateway.constant;

/**
 * Redis常量配置类
 * set name admin
 */
public class RedisConst {
    //用户登录
    public static final String USER_LOGIN_KEY_PREFIX = "user:login:";
    //    public static final String userinfoKey_suffix = ":info";
    public static final int USERKEY_TIMEOUT = 60 * 60 * 24 * 7;
}
