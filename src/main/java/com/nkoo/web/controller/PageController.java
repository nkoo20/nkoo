package com.nkoo.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 视图控制器,返回jsp视图给前端
 **/
@Controller
public class PageController {
	
	
	/**
     * 模版页
     */
    @RequestMapping("index")
    public String index() {
        return "index/index";
    }

	
    /**
     * 登录页
     */
    @RequestMapping("login")
    public String login() {
        return "login";
    }


    /**
     * 404页
     */
    @RequestMapping("404")
    public String error404() {
        return "404";
    }

    /**
     * 401页
     */
    @RequestMapping("401")
    public String error401() {
        return "401";
    }

    /**
     * 500页
     */
    @RequestMapping("500")
    public String error500() {
        return "500";
    }

    /**
     * 错误页
     */
    @RequestMapping("error")
    public String error() {
        return "error/error";
    }
}