package structual.proxy;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class RealProject implements Project {
    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load(){
        System.out.println("Loading project from url...");
    }

    @Override
    public void run() {
        System.out.println("Runing project" + url + ".....");
    }
}
