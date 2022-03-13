package Util.SqlOperation.UserOperation;

public class LoginInfo {
    //数据库地址
    private String url="";
    //用户账号
    private String user="";
    //用户密码
    private String password="";

    public LoginInfo(){
        
        
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


}
