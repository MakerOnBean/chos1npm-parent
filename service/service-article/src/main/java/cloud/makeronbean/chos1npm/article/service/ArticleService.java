package cloud.makeronbean.chos1npm.article.service;

import cloud.makeronbean.chos1npm.model.pojo.ArticleInfo;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author makeronbean
 * @createTime 2022-11-05  12:37
 * @description TODO
 */
public interface ArticleService extends IService<ArticleInfo> {

    /**
     * 查询通过审核文章总数
     */
    Integer showArticleCount();


    /**
     * 查询所有通过审核并且所有人可见的文章
     */
    List<ArticleInfo> showAllArticleInfo();

    /**
     * 查询所有通过审核并且所有可见的文章   可带关键字搜索
     */
    void getByKeyword(Page<ArticleInfo> page, String keyword);

    /**
     * 修改文章点击量，每点击一次+1
     */
    void updateArticleClick(Long articleId);
}
