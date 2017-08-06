package structual.decorator;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class SeniorJavaDeveloper extends DeveloperDecorator {
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeRobustCode();
    }

    public String makeRobustCode(){
        return "Senior does his work.";
    }
}
