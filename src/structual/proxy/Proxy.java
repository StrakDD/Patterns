package structual.proxy;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class Proxy implements Project{

    private String url;
    private RealProject realProject;

    public Proxy(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (realProject == null){
            realProject = new RealProject(url);
        }
        realProject.run();
    }
}
