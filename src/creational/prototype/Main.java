package creational.prototype;

/**
 * Created by Denis Starovoitenko on 02.08.2017.
 */
public class Main {

    public static void main(String[] args) {
        Project project = new Project(1, "New Project", "Some source code...");
        System.out.println(project);

        ProjectFactory factory = new ProjectFactory(project);
        Project prototype  = factory.cloneProject();
        System.out.println(prototype);
    }
}
