package cloud.makeronbean.chos1npm.model.pojo;

import cloud.makeronbean.chos1npm.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 后台菜单表
 * @TableName backstage_menu
 */
@TableName(value ="backstage_menu")
@Data
public class BackstageMenu extends BaseEntity implements Serializable {

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 菜单中文名称
     */
    private String chineseName;

    /**
     * 菜单标题
     */
    private String title;

    /**
     * 菜单路径
     */
    private String path;

    /**
     * 菜单图标
     */
    private String icon;

    /**
     * 父菜单id
     */
    private Integer parentMenuId;

    /**
     * 菜单是否可见
     */
    private Integer menuStatus;

    /**
     * 子菜单
     */
    private List<BackstageMenu> childMenu;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}