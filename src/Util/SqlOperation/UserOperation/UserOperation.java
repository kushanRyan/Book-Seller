package Util.SqlOperation.UserOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//吐了，花了这么多时间写这破玩意发现用不上，啊啊啊啊啊啊啊！！！！！！！！
public class UserOperation {
    public void opeartionTheUser(LoginInfo loginInfo,String sql) {
        Connection conn = null;
        Statement stat = null;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //输入数据库管理员账号
            conn = DriverManager.getConnection(loginInfo.getUrl(),"", "");
            System.out.println("Database connected");
            Statement stmt = conn.createStatement();

            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
            System.out.println("操作完成");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Operation failed");
        }
    }
    public void getUser(LoginInfo loginInfo,String sql) {
        Connection conn = null;
        Statement stat = null;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //输入数据库管理员账号
            conn = DriverManager.getConnection(loginInfo.getUrl(),"", "");
            System.out.println("Database connected");
            Statement stmt = conn.createStatement();
            //执行sql语句
            ResultSet rs = stmt.executeQuery(sql);
            //输出sql语句
            int counter=1;
            while (rs.next()) {
                System.out.println(rs.getString(1)+" "+rs.getString(2));
            }
            //释放资源
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Test failed");
        }

    }


}
