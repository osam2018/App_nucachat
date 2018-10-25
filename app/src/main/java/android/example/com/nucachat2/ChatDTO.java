package android.example.com.nucachat2;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ChatDTO {

    private String userName;
    private String message;
    private String mytime;

    public ChatDTO() {}
    public ChatDTO(String userName, String message) {
        this.userName = userName;
        this.message = message;

        Date now = new Date();
        SimpleDateFormat date = new SimpleDateFormat("hh:mm");
        this.mytime = date.format(now);
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserName() {
        return userName;
    }

    public String getMessage() {
        return message;
    }

    public String getMytime() {
        return mytime;
    }
}