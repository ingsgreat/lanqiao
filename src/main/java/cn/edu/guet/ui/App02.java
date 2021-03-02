package cn.edu.guet.ui;

import cn.edu.guet.bean.User;
import cn.edu.guet.bll.IUserService;
import cn.edu.guet.bll.impl.UserServiceImpl;

/*
模拟界面
user
interface
 */
public class App02 {

    public static void main(String[] args) {

        User user=new User();
        user.setId("1111");
        user.setPassword("1234");

        IUserService userService=new UserServiceImpl();
        try {
            userService.saveUser(user);
        } catch (Exception e) {
            System.out.println("界面："+e.getMessage());
            //到界面这一层，不要再抛出了，要try。。。。catch拿到错误消息，有了错误消息，我们就可以把具体的错误消息给用户显示
            e.printStackTrace();
        }
    }
}