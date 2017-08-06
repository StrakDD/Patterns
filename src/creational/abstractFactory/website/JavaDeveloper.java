package creational.abstractFactory.website;

import creational.abstractFactory.entity.Developer;

/**
 * Created by Denis Starovoitenko on 02.08.2017.
 */
public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("JavaDeveloper developer writes code.");
    }
}
