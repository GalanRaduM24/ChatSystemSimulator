import java.util.*;

public class Main {
    public static List<User> userList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user1 = new User("radu123", "1234", Status.AVAILABLE);
        User user2 = new User("andrei123", "abcd", Status.AVAILABLE);
        User user3 = new User("matei123", "qwerty", Status.OFFLINE);
        User user4 = new User("ana123", "mnbv", Status.AWAY);
        User user5 = new User("maria123", "asdf", Status.BUSY);
        User user6 = new User("ioana123", "zxcv", Status.OFFLINE);
        User user7 = new User("marius123", "0987", Status.AVAILABLE);
        System.out.println();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);
        userList.add(user7);


        user1.createAccount("radu", "ion", new Date(2000-02-02), "google@mail", "077");
        user1.login("radu123", "1234");
        user1.blockUser("andrei123");
        Settings settingsUser1 = new Settings(user1);

        settingsUser1.viewMonProfile();
        settingsUser1.setNotifications();
        settingsUser1.help();
        settingsUser1.changePassword("123456789");
        settingsUser1.changeNumber("+40777");
        settingsUser1.updateStatus(Status.OFFLINE);

        user1.getPassword();
        user1.getTelephone();
        user1.getStatus();

        //Chaturs
        Chat_Individuel chat_individuel = new Chat_Individuel(ChatType.INDIVIDUEL);
        user1.addChat(chat_individuel);
        Groupe_Chat groupe_chat = new Groupe_Chat(ChatType.GROUP);
        user1.createGroupChat(groupe_chat);

        user1.getActiveChatsList();


        Message message1 = new Message(MessageType.IMAGE, "imageimage");
        Message message2 = new Message(MessageType.TEXTE, "textetexte");
        Message message3 = new Message(MessageType.LOCATION, "location");
        message1.Display();
        message1.setMessage_type(MessageType.FICHIER);
        message1.getMessage_type();
        message2.Display();

        chat_individuel.receiveMessage(message2);

        Chat_Histoire chat_histoireIndividuel = new Chat_Histoire(user1, chat_individuel,Arrays.asList(message1, message2));
        chat_histoireIndividuel.getMessageList();
        chat_histoireIndividuel.addMessage(message3);
        chat_histoireIndividuel.getMessageList();

        System.out.println("addMember:");
        groupe_chat.addMembers(scanner.nextLine());
        System.out.println("removeFriend:");
        groupe_chat.removeFriend(scanner.nextLine());

        user1.searchMessages("textetexte");

        groupe_chat.sentERequest("google@mail");
        groupe_chat.sentMRequest("+40777");

        Groupe_Chat.deleteGroupe(1);
        Groupe_Chat.leaveGroupe(1, user1);

        user1.logout();
    }
}