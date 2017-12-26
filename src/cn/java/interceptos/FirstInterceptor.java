/**
 * Project Name:dt47_ssm
 * File Name:FirstInterceptor.java
 * Package Name:cn.java.interceptos
 * Date:上午9:35:35
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
*/

package cn.java.interceptos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * Description: 拦截器<br/>
 * Date: 上午9:35:35 <br/>
 * 
 * @author dingP
 * @version
 * @see
 */
public class FirstInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
        HttpSession session = request.getSession();
        Object flag = session.getAttribute("username");
        if (flag == null) {// 没有登录
            // 转发或者重定向到登录页面
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
            throws Exception {

        System.out.println("FirstInterceptor....中间");
    }

    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
        System.out.println("FirstInterceptor....最后");
    }

}
