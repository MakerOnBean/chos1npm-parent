package cloud.makeronbean.chos1npm.model.pojo;

import cloud.makeronbean.chos1npm.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 留言表
 * @TableName message
 */
@TableName(value ="message")
@Data
public class Message extends BaseEntity implements Serializable {
    /**
     * 留言昵称
     */
    private String name;

    /**
     * 留言QQ
     */
    private String qq;

    /**
     * 留言内容
     */
    private String content;

    /**
     * 回复留言内容
     */
    private String replyContent;

    /**
     * 留言日期
     */
    private Date messageDate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}