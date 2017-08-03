package creational.abstractFactory.website;

import creational.abstractFactory.entity.Developer;
import creational.abstractFactory.entity.ProjectManager;
import creational.abstractFactory.entity.ProjectTeamFactory;
import creational.abstractFactory.entity.Tester;

/**
 * Created by Denis Starovoitenko on 02.08.2017.
 */
public class WebsiteFactory implements ProjectTeamFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester createTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager createPM() {
        return new WebsitePM();
    }
}
