package cloud.makeronbean.chos1npm.model.vo;

import lombok.Data;

/**
 * @author makeronbean
 * @createTime 2022-11-05  21:40
 * @description TODO
 */
@Data
public class CommentVo {
    private Long articleId;
    private Long userId;
    private String content;
    private Long parentId;
}
