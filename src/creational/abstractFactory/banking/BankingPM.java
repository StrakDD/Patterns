package creational.abstractFactory.banking;

import creational.abstractFactory.entity.ProjectManager;

/**
 * Created by Denis Starovoitenko on 02.08.2017.
 */
public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Project Manager manages project.");
    }
}
