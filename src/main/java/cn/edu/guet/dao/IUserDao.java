package cn.edu.guet.dao;

import cn.edu.guet.bean.User;

public interface IUserDao {
    void saveUser(User user) throws Exception;
    //saveUser经常会发生问题，所以在声明saveUser的时候，要用throws告知用户（谁调用我saveUser）要处理
}