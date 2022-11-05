package cloud.makeronbean.chos1npm.article.controller;

import cloud.makeronbean.chos1npm.article.service.ClassifyService;
import cloud.makeronbean.chos1npm.common.result.Result;
import cloud.makeronbean.chos1npm.model.pojo.ClassifyInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author makeronbean
 * @createTime 2022-11-05  13:22
 * @description TODO
 */
@RestController
@RequestMapping("/article/classify")
public class ClassifyController {

    @Autowired
    private ClassifyService classifyService;

    /**
     * 查询所有文章分类
     * /article/classify/showAllClassifyInfo
     */
    @GetMapping("/showAllClassifyInfo")
    public Result showAllClassifyInfo() {
        List<ClassifyInfo> list = classifyService.list();
        return Result.ok(list);
    }
}
