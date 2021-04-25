package first;

public class UserDao {
    private DBUtil db = new DBUtil();
    void conn(){
        db.getConnection();
    }
    boolean findUser(int userName,int Password){
        if(userName == 123 && Password == 123){
            System.out.println("查找成功");
            return true;
        }
        else{
            System.out.println("未查找到当前用户");
            return false;
        }
    }

}
