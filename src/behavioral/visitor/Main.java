package behavioral.visitor;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Project project = new Project();

        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Junior in action..");
        project.beWritten(junior);
        System.out.println("\n=======================\n");

        System.out.println("Senior in action....");
        project.beWritten(senior);
    }
}
