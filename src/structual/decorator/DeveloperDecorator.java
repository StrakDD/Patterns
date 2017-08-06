package structual.decorator;


/**
 * Created by Denis Starovoitenko on 05.08.2017.
 */
public class DeveloperDecorator implements Developer {
    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }


    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
