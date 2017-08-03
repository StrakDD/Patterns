package creational.prototype;

/**
 * Created by Denis Starovoitenko on 02.08.2017.
 */
public class ProjectFactory {
    private Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    Project cloneProject(){
       return (Project) project.copy();
    }
}
