package behavioral.chain;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class Email extends Notifier {
    public Email(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email: "+ message);
    }
}
