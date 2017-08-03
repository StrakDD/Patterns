package creational.abstractFactory;

import creational.abstractFactory.banking.BankingFactory;
import creational.abstractFactory.entity.Developer;
import creational.abstractFactory.entity.ProjectManager;
import creational.abstractFactory.entity.ProjectTeamFactory;
import creational.abstractFactory.entity.Tester;

/**
 * Created by Denis Starovoitenko on 02.08.2017.
 */
public class BankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory factory = new BankingFactory();
        Developer developer1 = factory.createDeveloper();
        Developer developer2 = factory.createDeveloper();
        Developer developer3 = factory.createDeveloper();
        Tester tester = factory.createTester();
        ProjectManager manager = factory.createPM();

        System.out.println("Creating Bank system.");
        developer1.writeCode();
        developer2.writeCode();
        developer3.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
