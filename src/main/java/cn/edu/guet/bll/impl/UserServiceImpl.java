package cn.edu.guet.bll.impl;

import cn.edu.guet.bean.User;
import cn.edu.guet.bll.IUserService;
import cn.edu.guet.dao.IUserDao;
import cn.edu.guet.dao.impl.UserDaoImpl;

public class UserServiceImpl implements IUserService {

    IUserDao userDao;

    @Override
    public void saveUser(User user) throws Exception {
        userDao=new UserDaoImpl();
        try {
            userDao.saveUser(user);
        } catch (Exception e) {
            //事务回滚或做其他事情，那为什么还要有下面的throw e；这样代码？抛的是错误信息，只要没有到UI这一层
            throw e;//制造一个异常
        }
    }
}
