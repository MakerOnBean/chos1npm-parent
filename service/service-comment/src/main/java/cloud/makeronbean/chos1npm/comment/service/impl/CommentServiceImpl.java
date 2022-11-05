package cloud.makeronbean.chos1npm.comment.service.impl;

import cloud.makeronbean.chos1npm.client.UserFeignClient;
import cloud.makeronbean.chos1npm.comment.mapper.CommentMapper;
import cloud.makeronbean.chos1npm.comment.service.CommentService;
import cloud.makeronbean.chos1npm.comment.utils.CommentUtil;
import cloud.makeronbean.chos1npm.model.pojo.CommentInfo;
import cloud.makeronbean.chos1npm.model.pojo.UserInfo;
import cloud.makeronbean.chos1npm.model.vo.CommentVo;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;

/**
 * @author makeronbean
 * @createTime 2022-11-05  20:28
 * @description TODO
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, CommentInfo> implements CommentService {

    @Autowired
    private UserFeignClient userFeignClient;


    /**
     * 根据文章id查询文章对应的评论
     */
    @Override
    public List<CommentInfo> showCommentByArticleId(Long articleId) {
        LambdaQueryWrapper<CommentInfo> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(CommentInfo::getArticleId,articleId);
        List<CommentInfo> commentInfoList = baseMapper.selectList(wrapper);
        if (!CollectionUtils.isEmpty(commentInfoList)) {
            commentInfoList.forEach(commentInfo -> {
                UserInfo userInfo  = userFeignClient.getUserById(commentInfo.getUserId());
                if (userInfo != null) {
                    commentInfo.setUserInfo(userInfo);
                }
            });
        }
        commentInfoList = CommentUtil.recursionMethod(commentInfoList);
        return commentInfoList;
    }


    /**
     * 添加评论
     */
    @Override
    public void insertCommentInfo(CommentInfo commentInfo) {
        commentInfo.setCreateTime(new Date());
        commentInfo.setUpdateTime(new Date());
        this.baseMapper.insert(commentInfo);
    }


    /**
     * 根据评论id 删除评论
     */
    @Override
    public void delete(Long commentId) {
        LambdaQueryWrapper<CommentInfo> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(CommentInfo::getId,commentId).or(w -> w.eq(CommentInfo::getParentId,commentId));
        this.baseMapper.delete(wrapper);
    }
}
