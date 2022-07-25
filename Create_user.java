public class Create_user {
    private String User_id;
    private String password;
    private String username;
    private double account_bl;

    public Create_user(String user, String password, String username, double account_bl) {
        this.User_id = user;
        this.password = password;
        this.username = username;
        this.account_bl = account_bl;
    }
    public String getUser_id() {
        return User_id;
    }
    public void setUser_id(String user_id) {
        User_id = user_id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public double getAccount_bl() {
        return account_bl;
    }
    public void setAccount_bl(double account_bl) {
        this.account_bl = account_bl;
    }
}