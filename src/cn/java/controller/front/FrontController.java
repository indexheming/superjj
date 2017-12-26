/**
 * Project Name:dt47_ssm
 * File Name:FrontController.java
 * Package Name:cn.java.controller.front
 * Date:上午11:33:51
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
*/

package cn.java.controller.front;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.java.entity.QQ;
import cn.java.entity.User;
import cn.java.service.FrontService;

/**
 * Description: <br/>
 * Date: 上午11:33:51 <br/>
 * 
 * @author dingP
 * @version
 * @see
 */
@Controller
public class FrontController {

    @Autowired
    private FrontService fs;

    @RequestMapping("getUser")
    @ResponseBody
    public User getUser(Long id) {
        return fs.getUserById(id);
    }

    @RequestMapping(value = "testException")
    public void testException() {
        int i = 10 / 0;
    }

    @RequestMapping(value = "testException2")
    public void testException2() {
        String str = null;
        str.length();
    }

    @RequestMapping("zhuangMoney")
    public void zhuangMoney() {
        boolean flag = fs.moneyZhuang(200F, "110", "911");
        System.out.println(flag);
    }

    // 接收前端传递过来的JSon数据
    @RequestMapping(value = "receiveJson")
    @ResponseBody
    // public boolean receiveJson(@RequestBody Map<String, Object> map) {
    public boolean receiveJson(@RequestBody QQ map) {
        System.out.println("map=" + map);
        return true;
    }
}
