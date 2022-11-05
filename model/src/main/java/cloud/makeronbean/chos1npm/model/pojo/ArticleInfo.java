package cloud.makeronbean.chos1npm.model.pojo;

import cloud.makeronbean.chos1npm.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 文章管理表
 * @author makeronbean
 * @TableName article_info
 */
@TableName(value ="article_info")
@Data
public class ArticleInfo extends BaseEntity implements Serializable {

    /**
     * 编写用户编号
     */
    private Long userId;

    /**
     * 编写用户名称
     */
    private String userName;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章分类id
     */
    private Integer classifyId;

    /**
     * 文章分类名称
     */
    private String classifyName;

    /**
     * 文章描述
     */
    private String description;

    /**
     * 文章内容
     */
    private String context;

    /**
     * 发表时间
     */
    private Date publishTime;

    /**
     * 文章状态
     */
    private Integer state;

    /**
     * 后台审核是否通过
     */
    private Integer isPass;

    /**
     * 评论状态
     */
    private Integer commentState;

    /**
     * 阅读次数
     */
    private Long click;

    /**
     * 评论次数
     */
    private Long review;

    /**
     * 文章缩略图
     */
    private byte[] litImg;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 实体关系
     * 博客评论（一对多）
     **/
    @TableField(exist = false)
    private List<CommentInfo> comments = new ArrayList<>();
}