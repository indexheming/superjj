/**
 * Project Name:dt47_ssm
 * File Name:AdminController.java
 * Package Name:cn.java.controller.admin
 * Date:上午10:00:23
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
*/

package cn.java.controller.admin;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.java.entity.AdminNav;
import cn.java.service.FrontService;

/**
 * Description: <br/>
 * Date: 上午10:00:23 <br/>
 * 
 * @author dingP
 * @version
 * @see
 */
@Controller
@RequestMapping(value = "/admin/")
public class AdminController {
    @Autowired
    private FrontService fs;

    @RequestMapping("addUser") // http://localhost:8888/dt47_ssm/admin/addUser.shtml
    public void addUser(String username, String phone) {
        // 调用service
    }

    @RequestMapping(value = "getAdminNav")
    @ResponseBody
    public List<AdminNav> getAdminNav(@RequestParam(defaultValue = "0") Long id) {
        return fs.selectByPrimaryKey(id);
    }

    /**
     * 
     * Description: 获取后台导航栏所有的数据<br/>
     *
     * @author dingP
     * @param id
     * @return
     */
    @RequestMapping(value = "getNavsAdmin")
    public @ResponseBody Map<String, Object> getNavsAdmin(Integer page, Integer rows) {
        return fs.getAllAdminNavs(page, rows);
    }
}
