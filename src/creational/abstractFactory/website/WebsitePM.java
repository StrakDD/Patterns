package creational.abstractFactory.website;

import creational.abstractFactory.entity.ProjectManager;

/**
 * Created by Denis Starovoitenko on 02.08.2017.
 */
public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Project Manager manages the project.");
    }
}
