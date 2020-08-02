package freijer.app.firebasetest;

public class Chat {
    String text;
    String name;
    String imaheUrl;

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getImaheUrl() {
        return imaheUrl;
    }
    public void setImaheUrl(String imaheUrl) {
        this.imaheUrl = imaheUrl;
    }

    public Chat(String text, String name, String imaheUrl) {
        this.text = text;
        this.name = name;
        this.imaheUrl = imaheUrl;
    }


}
