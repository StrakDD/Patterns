package creational.abstractFactory;

import creational.abstractFactory.entity.Developer;
import creational.abstractFactory.entity.ProjectManager;
import creational.abstractFactory.entity.ProjectTeamFactory;
import creational.abstractFactory.entity.Tester;
import creational.abstractFactory.website.WebsiteFactory;

/**
 * Created by Denis Starovoitenko on 02.08.2017.
 */
public class WebsiteSystem {
    public static void main(String[] args) {
        ProjectTeamFactory factory = new WebsiteFactory();
        Developer developer = factory.createDeveloper();
        Tester tester = factory.createTester();
        ProjectManager manager = factory.createPM();

        System.out.println("Team start working.....");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
