package cloud.makeronbean.chos1npm.model.pojo;

import cloud.makeronbean.chos1npm.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 评论表
 * @author makeronbean
 * @TableName comment_info
 */
@TableName(value ="comment_info")
@Data
public class CommentInfo extends BaseEntity implements Serializable {

    /**
     * 文章代号
     */
    private Long articleId;

    /**
     * 评论用户编号
     */
    private Long userId;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 父评论
     */
    private Long parentId;

    /**
     * 评论日期
     */
    private Date commentDate;

    /**
     * 本评论下的子评论
     */
    private List<CommentInfo> child = new ArrayList<>();

    // 多表查询到的字段
    private Long userType; // 用户类型  1：管理员 2：普通用户 默认普通用户
    private String userName; // 用户名
    private String userPass; // 密码
    private String userEmail; // 邮箱
    private Date userRegdate; // 注册时间
    private String userSignature; // 个性签名
    private String userIcon; // 个人头像

    private String articleTitle; // 文章标题

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}