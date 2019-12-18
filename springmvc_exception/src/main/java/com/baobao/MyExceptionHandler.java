package com.baobao;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author baobao
 * @create 2019-11-28 21:13
 * @description
 */
public class MyExceptionHandler implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ex.printStackTrace();
        if (ex instanceof MyException){
            ex = (MyException) ex;
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", ex.getMessage());
        modelAndView.setViewName("exception");
        return modelAndView;
    }
}
