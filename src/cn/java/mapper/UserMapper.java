package cn.java.mapper;

import cn.java.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 
     * Description: 转钱<br/>
     *
     * @author dingP
     * @param money：转账金额
     * @param bankNo:卡号
     * @return
     */
    int zhuangMoney(Float money, String bankNo);
}