import java.util.ArrayList;
import java.util.List;

public class Chat_Individuel extends Chat{
    private String partenerUsername;
    private User user;

    public Chat_Individuel(ChatType chat_type) {
        super(chat_type);
    }

    public void setPartenerUsername(String partenerUsername) {
        this.partenerUsername = partenerUsername;
    }

    public String getPartenerUsername() {
        return partenerUsername;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void receiveMessage(Message message) {
        System.out.println("Received individual chat message:");
        messageList.add(message);
    }

    @Override
    public void sentERequest(String email) {

    }

    @Override
    public void sentMRequest(String telephone) {

    }

}
