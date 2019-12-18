package com.baobao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author baobao
 * @create 2019-11-28 21:43
 * @description
 */
@Controller
public class MyController {
    @RequestMapping("/interceptor")
    public String testInterceptor(){
        System.out.println("controller方法执行");
        return "success";
    }
}
