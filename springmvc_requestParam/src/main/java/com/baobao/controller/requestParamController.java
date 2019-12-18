package com.baobao.controller;

import com.baobao.bean.Student;
import com.baobao.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * @author baobao
 * @create 2019-11-25 22:48
 * @description
 */
@Controller
//类上面用@RequestMapping映射一级目录
@RequestMapping(path = "/requestParamMapping")
public class requestParamController {
    //方法上面用@RequestMapping映射二级目录
    @RequestMapping(path = "/baseMapping")
    /*如果基本类型参数名称与请求参数名称一样，直接在方法中声明参数即可得到
    ，否则要添加@RequestParam用于映射请求参数名称*/
    public String baseMapping(@RequestParam("username") String name, int age){
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        return "success";
    }


    //测试请求参数映射到bean类型
    @RequestMapping(path = "/beanMapping")
    public String beanMapping(User user){
        System.out.println(user);
        return "success";
    }

    //测试请求参数映射到带有list或map属性的bean类型
    @RequestMapping(path = "/beanWithListPropertyMapping")
    public String beanWithListPropertyMapping(Student student){
        System.out.println(student);
        return "success";
    }

    //测试自定义格式的请求参数通过自定义转换器映射到Date类型
    @RequestMapping(path = "/customFormatMapping")
    public String customFormatMapping(Date date){
        System.out.println(date);
        return "success";
    }

    //测试获取servletAPI
    @RequestMapping(path = "/getServletAPI")
    public String getServletAPI(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        System.out.println(request);
        System.out.println(response);
        System.out.println(session);
        return "success";
    }
}
