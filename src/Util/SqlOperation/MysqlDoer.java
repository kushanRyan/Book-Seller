package Util.SqlOperation;

import Model.Books;
import Model.Prices;
import Model.SimplePrice;
import Model.SimpleRecord;
import Model.book_record;
import Util.SqlOperation.UserOperation.LoginInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Model.reUser;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MysqlDoer {
    private Connection conn = null;
    private Statement stat = null;
    private LoginInfo loginInfo=new LoginInfo();
    public MysqlDoer(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                conn = DriverManager.getConnection(loginInfo.getUrl(), loginInfo.getUser(), loginInfo.getPassword());
            } catch (SQLException ex) {
                Logger.getLogger(MysqlDoer.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Database connected");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MysqlDoer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //给CUD用的操作
    public void mysqlOperation1(String sql) {
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
            System.out.println("操作完成");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Operation failed");
        }

    }
    //登陆时获取用户名单
    public List<reUser> mysqlSelectForAccPas(String sql) {
        List<reUser> list = new ArrayList();
        try {

            Statement stmt = conn.createStatement();
            //执行sql语句
            ResultSet rs = stmt.executeQuery(sql);
            //输出sql语句
            int counter = 1;
            while (rs.next()) {
                reUser ro = new reUser();
                ro.setAccount(rs.getString(1));
                ro.setPassword(rs.getString(2));
                ro.setName(rs.getString(3));
                list.add(ro);
            }
            //释放资源
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Test failed");
        }
        return list;
    }
    //获取书籍名单
    public List<Books> mysqlSelectForBookList(String sql) {

        List<Books> list = new ArrayList();
        try {
            Statement stmt = conn.createStatement();
            //执行sql语句
            ResultSet rs = stmt.executeQuery(sql);
            //输出sql语句
            int counter = 1;
            while (rs.next()) {
                Books ro = new Books();
                ro.setId(rs.getInt(1));
                ro.setName(rs.getString(2));
                ro.setAuthor(rs.getString(3));
                ro.setNumber(rs.getInt(4));
                ro.setOut_price(rs.getDouble(5));         
                list.add(ro);
            }
            //释放资源
            rs.close();
            stmt.close();
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Test failed");
        }
        return list;
    }
    
    public List<Prices> mysqlSelectForBookPriceList(String sql) {

        List<Prices> list = new ArrayList();
        try {
            Statement stmt = conn.createStatement();
            //执行sql语句
            ResultSet rs = stmt.executeQuery(sql);
            //输出sql语句
            int counter = 1;
            while (rs.next()) {
                Prices ro = new Prices();
                ro.setId(rs.getInt(1));
                ro.setRelated_book_name(rs.getString(2));
                ro.setRelated_provider_name(rs.getString(3));
                ro.setPrice(rs.getDouble(4));
                list.add(ro);
            }
            //释放资源
            rs.close();
            stmt.close();
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Test failed");
        }
        return list;
    }
    
    public List<book_record> mysqlSelectForBookRecord(String sql) {

        List<book_record> list = new ArrayList();
        try {
            Statement stmt = conn.createStatement();
            //执行sql语句
            ResultSet rs = stmt.executeQuery(sql);
            //输出sql语句
            int counter = 1;
            while (rs.next()) {
                book_record ro = new book_record();
                ro.setId(rs.getString(1));
                ro.setBook_name(rs.getString(2));
                ro.setProvider(rs.getString(3));
                ro.setTime(rs.getString(4));
                ro.setNumber(rs.getString(7));
                ro.setPrices(rs.getString(12));
                list.add(ro);
            }
            //释放资源
            rs.close();
            stmt.close();
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Test failed");
        }
        return list;
    }
    
    public List<SimpleRecord> mysqlSelectForSimpleRecord(String sql) {

        List<SimpleRecord> list = new ArrayList();
        try {
            Statement stmt = conn.createStatement();
            //执行sql语句
            ResultSet rs = stmt.executeQuery(sql);
            //输出sql语句
            int counter = 1;
            while (rs.next()) {
                SimpleRecord ro = new SimpleRecord();
                ro.setName(rs.getString(1));
                ro.setNumber(rs.getInt(2));
                list.add(ro);
            }
            //释放资源
            rs.close();
            stmt.close();
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Test failed");
        }
        return list;
    }
        
    public List<SimplePrice> mysqlSelectForSimplePrice(String sql) {

        List<SimplePrice> list = new ArrayList();
        try {
            Statement stmt = conn.createStatement();
            //执行sql语句
            ResultSet rs = stmt.executeQuery(sql);
            //输出sql语句
            int counter = 1;
            while (rs.next()) {
                SimplePrice ro = new SimplePrice();
                ro.setName(rs.getString(1));
                ro.setPrice(rs.getDouble(2));
                list.add(ro);
            }
            //释放资源
            rs.close();
            stmt.close();       
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Test failed");
        }
        return list;
    }
    
    public int mysqlSelectBookStackAndSold(String sql) {
        int result=0;
        try {
            Statement stmt = conn.createStatement();
            //执行sql语句
            ResultSet rs = stmt.executeQuery(sql);
            //输出sql语句
            int counter = 1;
            while (rs.next()) {
                 result=rs.getInt(1);
            }
            //释放资源
            rs.close();
            stmt.close();       
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Test failed");
        }
        return result;
    }
}