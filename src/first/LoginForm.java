package first;

import java.util.Scanner;

public class LoginForm  {

    void init(){
        System.out.println("**********初始界面**********");
    }

    Scanner sc = new Scanner(System.in);
    int UserName;
    int PassWord;

    public void display(){
        System.out.println("输入用户名和密码：");
        System.out.println("用户名：");
        UserName = sc.nextInt();
        System.out.println("密  码：");
        PassWord = sc.nextInt();
    }


    private UserDao dao = new UserDao();

    public void validate(){
        if(dao.findUser(UserName,PassWord))
        {
            System.out.println("完成登录处理");
        }
    }

}

