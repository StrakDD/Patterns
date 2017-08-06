package behavioral.chain;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class SimpleReport extends Notifier {


    public SimpleReport(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying using simple report:" + message);
    }
}
