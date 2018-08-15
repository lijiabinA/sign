package com.guoguo.sign.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 李嘉宾
 * @Date 2018年08月15日
 * @Desc 管理员端的页面跳转控制类
 */
@Controller
public class AdminIndexController {

    /**
     * 跳转到创建报名信息页面
     * @return
     */
    @RequestMapping("/admin/toCreateSignUpIndex")
    public String toCreateSignUpIndex(){
        return "/admin/createSignUpIndex";
    }
}
