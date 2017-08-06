package structual.decorator;

/**
 * Created by Denis Starovoitenko on 05.08.2017.
 */
public class Main {

    public static void main(String[] args) {
        Developer developer = new TeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));

        System.out.println(developer.makeJob());
    }
}
