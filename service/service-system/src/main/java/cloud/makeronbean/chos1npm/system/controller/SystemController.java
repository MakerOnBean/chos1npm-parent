package cloud.makeronbean.chos1npm.system.controller;

import cloud.makeronbean.chos1npm.model.pojo.SystemSetup;
import cloud.makeronbean.chos1npm.system.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author makeronbean
 * @createTime 2022-11-05  11:20
 * @description TODO
 */
@RestController
public class SystemController {

    @Autowired
    private SystemService systemService;


    /**
     * 查询全站的系统设置
     */
    @GetMapping("/showAllSystemSetup")
    public SystemSetup showAllSystemSetup() {
        List<SystemSetup> list = systemService.list();
        return list.get(0);
    }

}
