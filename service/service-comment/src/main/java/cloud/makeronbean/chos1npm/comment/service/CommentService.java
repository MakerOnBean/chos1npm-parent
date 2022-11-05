package cloud.makeronbean.chos1npm.comment.service;

import cloud.makeronbean.chos1npm.model.pojo.CommentInfo;
import cloud.makeronbean.chos1npm.model.vo.CommentVo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * @author makeronbean
 * @createTime 2022-11-05  20:28
 * @description TODO
 */
public interface CommentService extends IService<CommentInfo> {

    /**
     * 根据文章id查询文章对应的评论
     */
    List<CommentInfo> showCommentByArticleId(Long articleId);

    /**
     * 添加评论
     */
    void insertCommentInfo(CommentInfo commentInfo);

    /**
     * 根据评论id 删除评论
     */
    void delete(Long commentId);
}
