package structual.bridge;


/**
 * Created by Denis Starovoitenko on 05.08.2017.
 */
public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Cpp developer writes c++ code.");
    }
}
