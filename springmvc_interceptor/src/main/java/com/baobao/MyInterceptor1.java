package com.baobao;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author baobao
 * @create 2019-11-28 21:32
 * @description
 */
public class MyInterceptor1 implements HandlerInterceptor {

    /** * 如何调用： * 按拦截器定义顺序调用 *
     * 何时调用： * 只要配置了都会调用
     * * 有什么用： * 如果程序员决定该拦截器对请求进行拦截处理后还要调用其他的拦截器，或者是业务处理器去 *
     * 进行处理，则返回true。 * 如果程序员决定不需要再调用其他的组件去处理请求，则返回false。 */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截器1:preHandle");
        //放行
        return true;
    }

    /** * 如何调用： * 按拦截器定义逆序调用 *
     * 何时调用： * 在拦截器链内所有拦截器返成功调用 *
     * 有什么用： * 在业务处理器处理完请求后，但是DispatcherServlet向客户端返回响应前被调用， *
     * 在该方法中对用户请求request进行处理。 */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("拦截器1:postHandle");
    }

    /** * 如何调用： * 按拦截器定义逆序调用 *
     * 何时调用： * 只有preHandle返回true才调用 *
     * 有什么用： * 在 DispatcherServlet 完全处理完请求后被调用， * 可以在该方法中进行一些资源清理的操作。 */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("拦截器1:afterCompletion");
    }

}
