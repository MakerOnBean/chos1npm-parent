package cloud.makeronbean.chos1npm.article.controller;

import cloud.makeronbean.chos1npm.article.service.ArticleService;
import cloud.makeronbean.chos1npm.common.result.Result;
import cloud.makeronbean.chos1npm.model.pojo.ArticleInfo;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author makeronbean
 * @createTime 2022-11-05  12:32
 * @description TODO
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    /**
     * 根据文章id获取文章信息
     * /article/showArticleInfo
     */
    @GetMapping("/showArticleInfo")
    public Result showArticleInfo(Long articleId) {
        ArticleInfo articleInfo = articleService.getById(articleId);
        if (articleInfo != null) {
            return Result.ok(articleInfo);
        }
        return Result.fail();
    }


    /**
     * 查询所有通过审核文章总数
     * article/showArticleCount
     */
    @GetMapping("/showArticleCount")
    public Integer showArticleCount() {
        Integer count = articleService.showArticleCount();
        return count;
    }

    /**
     * 查询所有通过审核并且所有人可见的文章
     * /article/showAllArticleInfo
     */
    @GetMapping("/showAllArticleInfo")
    public List<ArticleInfo> showAllArticleInfo() {
        List<ArticleInfo> list = articleService.showAllArticleInfo();
        return list;
    }

    /**
     * 查询所有通过审核并且所有可见的文章   可带关键字搜索
     * /article/page/showAll
     */
    @GetMapping("/page/showAll")
    public Result showAll(@RequestParam(value = "currentPage",defaultValue = "1") Integer currentPage,
                          @RequestParam(value = "pageSize",defaultValue = "8") Integer pageSize,
                          @RequestParam(value = "keyword", defaultValue = "") String keyword) {
        Page<ArticleInfo> page = new Page<>(currentPage,pageSize);
        articleService.getByKeyword(page,keyword);
        return Result.ok(page);
    }

    /**
     * 修改文章点击量，每点击一次+1
     * /article/updateArticleClick
     */
    @GetMapping("/updateArticleClick")
    public Result updateArticleClick(Long articleId) {
        this.articleService.updateArticleClick(articleId);
        return Result.ok();
    }
}