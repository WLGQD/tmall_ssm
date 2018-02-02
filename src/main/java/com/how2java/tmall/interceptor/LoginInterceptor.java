package com.how2java.tmall.interceptor;

import com.how2java.tmall.pojo.User;
import com.how2java.tmall.service.CategoryService;
import com.how2java.tmall.service.OrderItemService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

/**
 * @author XKK
 * @create 2018-02-02 11:59
 * @desc 登录拦截器
 **/
public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Autowired
    CategoryService categoryService;
    @Autowired
    OrderItemService orderItemService;

    /**
     * 在业务处理器处理请求之前被调用
     * 如果返回false
     *      从当前的拦截器往回纸箱所有的拦截器的afterCompletion(),再退出拦截器链
     * 如果返回true
     *      执行下一个拦截器，直到所有的拦截器都执行完毕
     *      再执行被拦截的Controller
     *      然后进入拦截器链
     *      从最后一个拦截器往回执行所有的postHandle()
     *      再从最后一个拦截器往回执行所有的afterCompletion()
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        String contextPath = session.getServletContext().getContextPath();
        String[] noNeedAuthPage = new String[]{
                "home",
                "checkLogin",
                "register",
                "loginAjax",
                "login",
                "product",
                "category",
                "search"};
        String uri = request.getRequestURI();
        uri = StringUtils.remove(uri, contextPath);
       System.out.println(uri);
        if (uri.startsWith("/fore")) {
            String method = StringUtils.substringAfterLast(uri,"/fore");
            if (!Arrays.asList(noNeedAuthPage).contains(method)){
                User user = (User) session.getAttribute("user");
                if (null == user) {
                    response.sendRedirect("loginPage");
                    return false;
                }
            }
        }
        return true;
    }



}
