package cloud.makeronbean.chos1npm.model.pojo;

import cloud.makeronbean.chos1npm.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 注册用户管理表
 * @author makeronbean
 * @TableName user_info
 */
@TableName(value ="user_info")
@Data
public class UserInfo extends BaseEntity implements Serializable {
    /**
     * 用户类型
     */
    private Integer type;

    /**
     * 用户名
     */
    private String name;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 个性签名
     */
    private String signature;

    /**
     * 个人头像
     */
    private String icon;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}