package cloud.makeronbean.chos1npm.user.service.impl;

import cloud.makeronbean.chos1npm.model.pojo.UserInfo;
import cloud.makeronbean.chos1npm.user.mapper.UserMapper;
import cloud.makeronbean.chos1npm.user.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author makeronbean
 * @createTime 2022-11-05  19:56
 * @description TODO
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserInfo> implements UserService {

}
