package creational.abstractFactory.entity;

/**
 * Created by Denis Starovoitenko on 02.08.2017.
 */
public interface ProjectTeamFactory {
    Developer createDeveloper();
    Tester createTester();
    ProjectManager createPM();
}
