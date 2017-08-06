package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class SimpleChat implements Chat {
    User admin;
    List<User> userList = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    
    public void addUserToChat(User user){
        this.userList.add(user);
    }
    @Override
    public void sentMessage(String message, User user) {
        for (User user1 : userList) {
            if (user1 != user){
                user1.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
