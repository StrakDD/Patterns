package structual.bridge;


/**
 * Created by Denis Starovoitenko on 05.08.2017.
 */
public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("JavaDeveloper developer writes java code.");
    }
}
