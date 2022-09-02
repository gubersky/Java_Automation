package api.pojo;

public class ResponseSingleResource {
    private String url;
    private String text;


    public ResponseSingleResource() {

    }

    public ResponseSingleResource(String url, String text) {
        this.text = text;
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
