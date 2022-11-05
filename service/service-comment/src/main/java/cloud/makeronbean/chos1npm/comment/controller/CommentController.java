package cloud.makeronbean.chos1npm.comment.controller;

import cloud.makeronbean.chos1npm.comment.service.CommentService;
import cloud.makeronbean.chos1npm.common.result.Result;
import cloud.makeronbean.chos1npm.model.pojo.CommentInfo;
import cloud.makeronbean.chos1npm.model.vo.CommentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author makeronbean
 * @createTime 2022-11-05  20:26
 * @description TODO
 */
@RestController
@RequestMapping("/comment")
public class CommentController {


    @Autowired
    private CommentService commentService;

    /**
     * 根据文章id查询文章对应的评论
     * /comment/showCommentByArticleId/{articleId}
     */
    @GetMapping("/showCommentByArticleId/{articleId}")
    public Result showCommentByArticleId(@PathVariable Long articleId) {
        List<CommentInfo> resultMap = commentService.showCommentByArticleId(articleId);
        return Result.ok(resultMap);
    }

    /**
     * 添加评论
     * /comment/insertCommentInfo
     */
    @PostMapping("/insertCommentInfo")
    public Result insertCommentInfo(CommentInfo commentInfo) {
        this.commentService.insertCommentInfo(commentInfo);
        return Result.ok();
    }


    /**
     * 根据评论id 删除评论
     * /comment/delete/{commentId}
     */
    @DeleteMapping("/delete/{commentId}")
    public Result delete(@PathVariable Long commentId) {
        this.commentService.delete(commentId);
        return Result.ok();
    }
}