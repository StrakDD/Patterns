package creational.abstractFactory.banking;

import creational.abstractFactory.entity.Tester;
import creational.abstractFactory.entity.Developer;
import creational.abstractFactory.entity.ProjectManager;
import creational.abstractFactory.entity.ProjectTeamFactory;

/**
 * Created by Denis Starovoitenko on 02.08.2017.
 */
public class BankingFactory implements ProjectTeamFactory {
    @Override
    public Developer createDeveloper() {
        return new ServerDeveloper();
    }

    @Override
    public Tester createTester() {
        return new creational.abstractFactory.banking.Tester();
    }

    @Override
    public ProjectManager createPM() {
        return new BankingPM();
    }
}
