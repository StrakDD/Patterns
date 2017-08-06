package structual.composite;

/**
 * Created by Denis Starovoitenko on 05.08.2017.
 */
public class Main {

    public static void main(String[] args) {
        Team team = new Team();

        team.addDeveloper(new JavaDeveloper());
        team.addDeveloper(new JavaDeveloper());
        team.addDeveloper(new CppDeveloper());
        team.createProject();
    }
}
