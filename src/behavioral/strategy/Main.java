package behavioral.strategy;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setActivity(new Sleeping());
        developer.executeActivity();

        developer.setActivity(new Training());
        developer.executeActivity();
        developer.setActivity(new Reading());
        developer.executeActivity();
        developer.setActivity(new Sleeping());
        developer.executeActivity();
    }
}
