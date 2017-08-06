package behavioral.memento;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        Github github = new Github();


        System.out.println("Creating new project. Version 1.0");
        project.setVersionAndDate("Version 1.0");
        Thread.sleep(2000);

        System.out.println(project);

        System.out.println("Saving current version to Github...");
        github.setSave(project.save());

        System.out.println("Updating project to version 1.1");
        System.out.println("Writing poor code....");

        Thread.sleep(5000);
        project.setVersionAndDate("Version 1.1");
        System.out.println(project);


        System.out.println("Something went wrong....");
        System.out.println("Rolling back to version 1.0");
        project.load(github.getSave());

        System.out.println("Project after rollback: ");
        System.out.println(project);
    }
}
