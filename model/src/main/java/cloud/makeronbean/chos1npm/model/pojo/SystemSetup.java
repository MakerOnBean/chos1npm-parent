package cloud.makeronbean.chos1npm.model.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 系统设置表
 * @author makeronbean
 * @TableName system_setup
 */
@TableName(value ="system_setup")
@Data
public class SystemSetup implements Serializable {
    /**
     * 特效2
     */
    private Integer effects02;

    /**
     * 特效1
     */
    private Integer effects01;

    /**
     * 置顶
     */
    private String stickArticle;

    /**
     * 文章展示
     */
    private String allArticle;

    /**
     * 左侧精选文章
     */
    private String featuredArticle;

    /**
     * 左侧技术专区文章
     */
    private String technologyArticle;

    /**
     * 右侧资源专区文章
     */
    private String resourceArticle;

    /**
     * 左侧广告图1
     */
    private String advertising1;

    /**
     * 左侧广告链接1
     */
    private String advertisingLink1;

    /**
     * 右侧广告图1
     */
    private String advertising2;

    /**
     * 左侧广告链接1
     */
    private String advertisingLink2;

    /**
     * 右侧广告图2
     */
    private String advertising3;

    /**
     * 左侧广告链接1
     */
    private String advertisingLink3;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}