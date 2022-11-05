package cloud.makeronbean.chos1npm.url.controller;

import cloud.makeronbean.chos1npm.common.result.Result;
import cloud.makeronbean.chos1npm.model.pojo.UrlInfo;
import cloud.makeronbean.chos1npm.url.servcie.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author makeronbean
 * @createTime 2022-11-05  22:55
 * @description TODO
 */
@RestController
@RequestMapping("/url")
public class UrlController {

    @Autowired
    private UrlService urlService;


    /**
     * 根据链接类型获取对应集合
     * /url/showAllUrlInfo/{urlType}
     */
    @GetMapping("/showAllUrlInfo/{urlType}")
    public Result showAllUrlInfo(@PathVariable Integer urlType) {
        List<UrlInfo> list = urlService.showAllUrlInfo(urlType);
        return Result.ok(list);
    }

}
