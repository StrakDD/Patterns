package creational.factory;

/**
 * Created by Denis Starovoitenko on 02.08.2017.
 */
public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP Developer writes php code.");
    }
}
