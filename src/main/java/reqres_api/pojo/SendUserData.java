package reqres_api.pojo;

public class SendUserData {
    private String email;
    private String password;

    public SendUserData(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public SendUserData(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
