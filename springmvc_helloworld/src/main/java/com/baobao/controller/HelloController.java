package com.baobao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author baobao
 * @create 2019-11-25 21:45
 * @description
 */
//将控制器加到spring容器中
@Controller
public class HelloController {
    //配置方法与请求路径映射关系
    /*1. RequestMapping注解的作用是建立请求URL和处理方法之间的对应关系
      2. RequestMapping注解可以作用在方法和类上
        1. 作用在类上：第一级的访问目录
        2. 作用在方法上：第二级的访问目录
        3. 细节：路径可以不编写 / 表示应用的根目录开始
        4. 细节：${ pageContext.request.contextPath }也可以省略不写，但是路径上不能写 /
      3. RequestMapping的属性
        1. path 指定请求路径的url
        2. value value属性和path属性是一样的
        3. method 指定该方法的请求方式
        4. params 指定限制请求参数的条件
        5. headers 发送的请求中必须包含的请求头*/

    @RequestMapping(path = "/hello")
    public String hello(){
        System.out.println("helloworld springmvc");
        return "success";
    }
}
