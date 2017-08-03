package creational.factory;

/**
 * Created by Denis Starovoitenko on 02.08.2017.
 */
public class JavaFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
