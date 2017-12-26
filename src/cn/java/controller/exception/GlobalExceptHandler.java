/**
 * Project Name:dt47_ssm
 * File Name:GlobalExceptHandler.java
 * Package Name:cn.java.controller.exception
 * Date:上午11:51:28
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
*/

package cn.java.controller.exception;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Description: 全局异常处理器<br/>
 * Date: 上午11:51:28 <br/>
 * 
 * @author dingP
 * @version
 * @see
 */
@ControllerAdvice
public class GlobalExceptHandler {
    private static Logger logger = Logger.getLogger(GlobalExceptHandler.class);

    @ExceptionHandler(Exception.class)
    public String handException(Exception ex) throws Exception {
        // 将错误记录到日志中去 dt47_ssm.log debug:错误信息
        ex.printStackTrace();

        // 跳转到错误处理页面
        return "error/error.jsp";
    }

}
