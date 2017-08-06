package behavioral.chain;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Notifier report = new SimpleReport(Priority.ROUTINE);
        Notifier email = new Email(Priority.IMPORTANT);
        Notifier sms = new SMS(Priority.ASAP);

        report.setNextNotifier(email);
        email.setNextNotifier(sms);

        report.notifyManager("Everything is OK.", Priority.ROUTINE);
        report.notifyManager("Something went wrong", Priority.IMPORTANT);
        report.notifyManager("Huston, we've had a problem here!!!", Priority.ASAP);

    }
}
