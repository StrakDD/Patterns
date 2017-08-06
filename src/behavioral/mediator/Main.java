package behavioral.mediator;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        SimpleChat simpleChat = new SimpleChat();

        User admin = new Admin(simpleChat, "Admin");
        User user1 = new SimpleUser(simpleChat, "User 1");
        User user2 = new SimpleUser(simpleChat, "User 2");

        simpleChat.setAdmin(admin);
        simpleChat.addUserToChat(user1);
        simpleChat.addUserToChat(user2);

        user1.sentMessage("Hello, I am User 1!!!");
        admin.sentMessage("roger that. I am admin!");
    }
}
