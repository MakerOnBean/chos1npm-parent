package cloud.makeronbean.chos1npm.model.pojo;

import cloud.makeronbean.chos1npm.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 链接管理表
 * @author makeronbean
 * @TableName url_info
 */
@TableName(value ="url_info")
@Data
public class UrlInfo extends BaseEntity implements Serializable {

    /**
     * 网站名称
     */
    private String name;

    /**
     * 网站地址
     */
    private String address;

    /**
     * 网站介绍
     */
    private String referral;

    /**
     * 网站缩略图
     */
    private String litImg;

    /**
     * 站长邮箱
     */
    private String webmasterEmail;

    /**
     * 后台审核是否通过
     * 1待审核 2审核通过 3审核失败
     */
    private Integer Pass;

    /**
     * 链接类型
     * 1：学习网站 2：友情链接
     */
    private Integer type;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}