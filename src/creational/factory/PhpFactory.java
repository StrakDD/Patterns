package creational.factory;

/**
 * Created by Denis Starovoitenko on 02.08.2017.
 */
public class PhpFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
