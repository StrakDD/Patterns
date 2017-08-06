package behavioral.chain;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class SMS extends Notifier {
    public SMS(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("SMS sending: " + message);
    }
}
