package com.baobao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author baobao
 * @create 2019-11-27 21:51
 * @description
 */

@Controller
@RequestMapping("/result")
public class ResultController {
    @RequestMapping("/modelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView modelAndView = new ModelAndView();
        //保存数据
        modelAndView.addObject("name", "baobao");
        //转发到success页面
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/forward")
    public String testForward(){
        System.out.println("forward");
        //转发到success页面
        return "forward:/WEB-INF/pages/success.jsp";
    }

    @RequestMapping("/redirect")
    public String testRedirect(){
        System.out.println("redirect");

        //重定向的jsp页面不能再WEB-INF中，因为这个目录不对外暴露
        return "redirect:/redirectPage.jsp";
    }

    @RequestMapping("/JsonResult")
    public @ResponseBody User testJsonResult(@RequestBody User user){
        //添加@RequestBody，会自动将ajax发送过来的jason数据封装到user对象中
        System.out.println(user);
        user.setUsername("baobao2");
        user.setAge(28);
        //添加@ResponseBody，会自动将user对象转化成json字符串返回
        return user;
    }
}
