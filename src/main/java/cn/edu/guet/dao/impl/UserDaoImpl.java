package cn.edu.guet.dao.impl;

import cn.edu.guet.bean.User;
import cn.edu.guet.dao.IUserDao;

public class UserDaoImpl implements IUserDao {

    @Override
    public void saveUser(User user) throws Exception {
        if(user.getId().equals("1111")){
            throw new Exception("保存失败");//throw是制造一个异常，throws是把制造的这个异常抛出
        }
    }
}
