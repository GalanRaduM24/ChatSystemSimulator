import java.util.ArrayList;
import java.util.List;

public class Chat_Histoire {
    private final User sender;
    private Chat chat;
    private List<Message> messages;

    public Chat_Histoire(User sender, Chat chat, List<Message> messages) {
        this.sender = sender;
        this.chat = chat;
        this.messages = new ArrayList<>(messages);
    }

    public void addMessage(Message message) {
        messages.add(message);
    }

    public List<Message> getMessageList() {
        System.out.println(messages +  " " +  sender + " " + chat);
        return messages;
    }
}
