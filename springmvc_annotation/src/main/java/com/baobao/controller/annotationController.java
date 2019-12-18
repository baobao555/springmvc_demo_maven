package com.baobao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

/**
 * @author baobao
 * @create 2019-11-26 0:23
 * @description
 */

@Controller
@RequestMapping(path = "/annotationController")
@SessionAttributes(value = {"name","age"},types = {String.class,int.class})
public class annotationController {

    /*@RequestParam
    作用： 把请求中指定名称的参数给控制器中的形参赋值。
    属性： value：请求参数中的名称。
    required：请求参数中是否必须提供此参数。默认值：true。表示必须提供，如果不提供将报错。*/
    @RequestMapping(path = "/requestParam")
    public String requestParam(String name,@RequestParam(value = "age",required = false) Integer userAge){
        System.out.println(name + userAge);
        return "success";
    }

    /*@RequestBody
    作用： 用于获取请求体内容。直接使用得到是key=value&key=value...结构的数据。 get请求方式不适用。
    属性： required：是否必须有请求体。默认值是:true。当取值为true时,get请求方式会报错。如果取值为false，get请求得到是null。*/
    @RequestMapping(path = "/requestBody")
    public String requestBody(@RequestBody(required = false) String body){
        System.out.println(body);//name=%E5%8C%85%E5%8C%85&age=18
        return "success";
    }

    /*@PathVariable
    作用： 用于绑定url中的占位符。
    例如：请求url中 /delete/{id}，这个{id}就是url占位符。
    用于rest风格的请求，所有请求可以对应同一个一级路径，而用不同的请求方式method来区分增删改查。
    但是如果碰到查询所有和根据id查询2种需求，同样是查询无法根据method区分，这时可以用占位符传入id，表示要执行根据id查询
    url支持占位符是spring3.0之后加入的。是springmvc支持rest风格URL的一个重要标志。
    属性： value：用于指定url中占位符名称。 required：是否必须提供占位符。*/
    @RequestMapping("/deleteUser/{id}")
    public String pathVariable(@PathVariable("id") int id){
        System.out.println(id);
        return "success";
    }


    /*@RequestHeader
    作用： 用于获取请求消息头。
    属性： value：提供消息头名称 required：是否必须有此消息头
    注： 在实际开发中一般不怎么用。*/
    @RequestMapping("/requestHeader")
    public String requestHeader(@RequestHeader("Accept-Language") String header){
        System.out.println(header);
        return "success";
    }

    /*@CookieValue
    作用： 用于把指定cookie名称的值传入控制器方法参数。
    属性： value：指定cookie的名称。 required：是否必须有此cookie。
    * */
    @RequestMapping("/cookieValue")
    public String cookieValue(@CookieValue("JSESSIONID") String cookieValue){
        System.out.println(cookieValue);
        return "success";
    }

    /*
    作用： 该注解是SpringMVC4.3版本以后新加入的。它可以用于修饰方法和参数。
    出现在方法上，表示当前方法会在控制器的方法执行之前，先执行。它可以修饰没有返回值的方法，也可以修饰有具体返回值的方法。
    出现在参数上，获取指定的数据给参数赋值。
    属性： value：用于获取数据的key。key可以是POJO的属性名称，也可以是map结构的key。
    应用场景： 当表单提交数据不是完整的实体类数据时，保证没有提交数据的字段使用数据库对象原来的数据。
    例如： 我们在编辑一个用户时，用户有一个创建信息字段，该字段的值是不允许被修改的。
    在提交表单数据是肯定没有此字段的内容，一旦更新会把该字段内容置为null，此时就可以使用此注解解决问题。*/
    @ModelAttribute
    public void testModelAttributeMethod(){
        System.out.println("被@ModelAttribute注解修饰的方法执行了");
    }
    @RequestMapping("/modelAttributeMethod")
    public String modelArributeMethod(String name){
        System.out.println("执行了控制器的方法");
        System.out.println(name);
        return "success";
    }

    /*作用： 用于多次执行控制器方法间的参数共享。
    属性： value：用于指定存入的属性名称 type：用于指定存入的数据类型。*/
    @RequestMapping("/sessionAttribute")
    public String sessionAttribute(Model model, ModelMap modelMap, SessionStatus sessionStatus) {
        System.out.println("存入数据");
        model.addAttribute("name", "baobao");
        model.addAttribute("age", 18);

        System.out.println("取出数据");
        System.out.println(modelMap.get("name"));
        System.out.println(modelMap.get("age"));

        System.out.println("清空数据");
        sessionStatus.setComplete();
        return "success";
    }
}
