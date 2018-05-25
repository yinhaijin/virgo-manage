package com.lunzhiyu.virgo.manage.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目名称: virgo-manage
 * 描述:
 * 作者: hakim
 * 创建日期: 2018-05-24.
 * 创建时间: 下午1:16
 */
@RestController
@RefreshScope
@RequestMapping("/manage")
public class DefaultController {

    @Value("${myprofile.username}")
    private String foo;

    @RequestMapping("/profile")
    public String home(){
        return this.foo;
    }
}
