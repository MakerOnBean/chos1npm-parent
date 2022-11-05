package cloud.makeronbean.chos1npm.model.pojo;

import cloud.makeronbean.chos1npm.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 分类管理表
 * @TableName classify_info
 */
@TableName(value ="classify_info")
@Data
public class ClassifyInfo extends BaseEntity implements Serializable {

    /**
     * 分类介绍
     */
    private String introduce;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 文章数量
     */
    private Integer articleNumber;

    /**
     * 渐变色1
     */
    private String color1;

    /**
     * 渐变色2
     */
    private String color2;


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}