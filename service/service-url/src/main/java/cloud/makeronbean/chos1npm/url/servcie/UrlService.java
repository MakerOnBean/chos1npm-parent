package cloud.makeronbean.chos1npm.url.servcie;

import cloud.makeronbean.chos1npm.model.pojo.UrlInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author makeronbean
 * @createTime 2022-11-05  23:02
 * @description TODO
 */
public interface UrlService extends IService<UrlInfo> {

    /**
     * 根据链接类型获取对应集合
     */
    List<UrlInfo> showAllUrlInfo(Integer urlType);
}
