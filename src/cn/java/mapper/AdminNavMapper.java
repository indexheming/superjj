package cn.java.mapper;

import java.util.List;

import cn.java.entity.AdminNav;

public interface AdminNavMapper {
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
    List<AdminNav> getAllAdminNavs(Integer index, Integer rows);

    /**
     * 
     * Description: 获取导航栏的所有数据<br/>
     *
     * @author dingP
     * @return
     */
    int getNavCount();

}