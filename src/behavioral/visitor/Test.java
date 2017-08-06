package behavioral.visitor;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class Test implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
