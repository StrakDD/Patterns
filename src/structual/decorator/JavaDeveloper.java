package structual.decorator;

/**
 * Created by Denis Starovoitenko on 05.08.2017.
 */
public class JavaDeveloper implements Developer{
    @Override
    public String makeJob() {
        return "Write Java code.";
    }
}
