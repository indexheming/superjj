/**
 * Project Name:dt47_ssm
 * File Name:FrontServiceImpl.java
 * Package Name:cn.java.service.impl
 * Date:上午11:20:54
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
*/

package cn.java.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.java.entity.AdminNav;
import cn.java.entity.User;
import cn.java.mapper.AdminNavMapper;
import cn.java.mapper.UserMapper;
import cn.java.service.FrontService;

/**
 * Description: <br/>
 * Date: 上午11:20:54 <br/>
 * 
 * @author dingP
 * @version
 * @see
 */
@Service
@Transactional(readOnly = false)
public class FrontServiceImpl implements FrontService {
    @Autowired
    private AdminNavMapper am;

    @Autowired
    private UserMapper um;

    /**
     * 简单描述该方法的实现功能（可选）.
     * 
     * @see cn.java.service.impl.FrontService#getUserById(java.lang.Long)
     */
    @Override
    @Transactional(readOnly = true)
    public User getUserById(Long id) {
        return um.selectByPrimaryKey(id);
    }

    /**
     * 
     * Description: 转账业务<br/>
     *
     * @author dingP
     * @param money：转账金额
     * @param bankNo1：钱转出账户
     * @param bankNo2：钱转入账户
     * @return
     */
    @Override
    public boolean moneyZhuang(Float money, String bankNo1, String bankNo2) {
        // 1、将宝强减掉200万
        int flag1 = um.zhuangMoney(-money, bankNo1);

        int i = 10 / 0;

        // 2、将马蓉加上200万
        int flag2 = um.zhuangMoney(money, bankNo2);
        return (flag1 + flag2) >= 2 ? true : false;
    }

    @Override
    public List<AdminNav> selectByPrimaryKey(Long id) {
        return am.selectByPrimaryKey(id);
    }

    // easyui分页
    @Override
    public Map<String, Object> getAllAdminNavs(Integer page, Integer rows) {
        // 1、计算分页的起始下标
        int index = (page - 1) * rows;
        // 2、获取分页的数据
        List<AdminNav> rowsList = am.getAllAdminNavs(index, rows);
        // 3、获取数据库中admin_nav表中的所有数据记录
        int total = am.getNavCount();
        // 将数据封装成easyui需要的格式
        Map<String, Object> dataMap = new HashMap<String, Object>();
        dataMap.put("total", total);
        dataMap.put("rows", rowsList);
        return dataMap;
    }
}
