package behavioral.observer;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        JavaDeveloperSite jobSite = new JavaDeveloperSite();

        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        Observer first = new Subscriber("First sub");
        Observer second = new Subscriber("Second sub");

        jobSite.addObserver(first);
        jobSite.addObserver(second);

        jobSite.addVacancy("Third Java position");

        jobSite.removeVacancy("First Java Position");
    }
}
