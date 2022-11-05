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
     * 本评论下的子评论
     */
    @TableField(exist = false)
    private List<CommentInfo> child = new ArrayList<>();

    @TableField(exist = false)
    private UserInfo userInfo;

    // 文章标题
    @TableField(exist = false)
    private String title;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}