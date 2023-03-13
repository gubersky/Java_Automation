package reqres_api.pojo;

public class ResponseUserData {
    private Integer id;
    private String createdAt;
    private String job;
    private String url;
    private String text;
    private String year;
    private String name;
    private String color;
    private String pantone_value;
    private String token;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;
    private String error;

    public ResponseUserData(Integer id, String createdAt, String job, String url, String text, String year, String name,
                            String color, String pantoneValue, String token, String email, String firstName,
                            String lastName, String avatar, String error) {
        this.id = id;
        this.createdAt = createdAt;
        this.job = job;
        this.url = url;
        this.text = text;
        this.year = year;
        this.name = name;
        this.color = color;
        pantone_value = pantoneValue;
        this.token = token;
        this.email = email;
        this.first_name = firstName;
        this.last_name = lastName;
        this.avatar = avatar;
        this.error = error;
    }

    public ResponseUserData() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPantone_value() {
        return pantone_value;
    }

    public void setPantone_value(String pantone_value) {
        this.pantone_value = pantone_value;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
