package cloud.makeronbean.chos1npm.article.service.impl;

import cloud.makeronbean.chos1npm.article.mapper.ArticleMapper;
import cloud.makeronbean.chos1npm.article.service.ArticleService;
import cloud.makeronbean.chos1npm.model.pojo.ArticleInfo;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author makeronbean
 * @createTime 2022-11-05  12:37
 * @description TODO
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, ArticleInfo> implements ArticleService {

    /**
     * 查询通过审核文章总数
     */
    @Override
    public Integer showArticleCount() {
        LambdaQueryWrapper<ArticleInfo> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(ArticleInfo::getPass,2).eq(ArticleInfo::getState,1).orderByDesc(ArticleInfo::getPublishTime);
        return baseMapper.selectCount(wrapper);
    }


    /**
     * 查询所有通过审核并且所有人可见的文章
     */
    @Override
    public List<ArticleInfo> showAllArticleInfo() {
        LambdaQueryWrapper<ArticleInfo> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(ArticleInfo::getPass,2);
        return baseMapper.selectList(wrapper);
    }


    /**
     * 查询所有通过审核并且所有可见的文章   可带关键字搜索
     */
    @Override
    public void getByKeyword(Page<ArticleInfo> page, String keyword) {
        LambdaQueryWrapper<ArticleInfo> wrapper = new LambdaQueryWrapper<>();
        if (!StringUtils.isEmpty(keyword)) {
            wrapper.eq(ArticleInfo::getState,1).eq(ArticleInfo::getPass,2);
            wrapper.and(w-> w.like(ArticleInfo::getTitle,keyword)
                    .or(w2 -> w2.like(ArticleInfo::getClassifyName,keyword))
                    .or(w2 -> w2.like(ArticleInfo::getUserName,keyword))
                    .or(w2 -> w2.like(ArticleInfo::getDescription,keyword)));
            wrapper.orderByDesc(ArticleInfo::getPublishTime);
        }
        baseMapper.selectPage(page,wrapper);
    }


    /**
     * 修改文章点击量，每点击一次+1
     */
    @Override
    public void updateArticleClick(Long articleId) {
        this.baseMapper.updateArticleClick(articleId);
    }
}
