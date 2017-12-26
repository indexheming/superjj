/**
 * Project Name:dt47_ssm
 * File Name:FrontService.java
 * Package Name:cn.java.service.impl
 * Date:上午11:33:21
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
*/

package cn.java.service;

import java.util.List;
import java.util.Map;

import cn.java.entity.AdminNav;
import cn.java.entity.User;

/**
 * Description: <br/>
 * Date: 上午11:33:21 <br/>
 * 
 * @author dingP
 * @version
 * @see
 */
public interface FrontService {

    User getUserById(Long id);

    boolean moneyZhuang(Float money, String bankNo1, String bankNo2);

    /**
     * 
     * Description: 根据id获取后台导航栏信息<br/>
     *
     * @author dingP
     * @param id
     * @return
     */
    List<AdminNav> selectByPrimaryKey(Long id);

    /**
     * 
     * Description: 获取所有菜单<br/>
     *
     * @author dingP
     * @param id
     * @return
     */
    Map<String, Object> getAllAdminNavs(Integer page, Integer rows);

}
