package cloud.makeronbean.chos1npm.article.mapper;

import cloud.makeronbean.chos1npm.model.pojo.ArticleInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author makeronbean
 * @createTime 2022-11-05  12:37
 * @description TODO
 */
@Mapper
public interface ArticleMapper extends BaseMapper<ArticleInfo> {
    /**
     * 修改文章点击量，每点击一次+1
     */
    void updateArticleClick(Long articleId);
}
