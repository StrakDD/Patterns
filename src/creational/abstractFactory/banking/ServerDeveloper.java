package creational.abstractFactory.banking;

import creational.abstractFactory.entity.Developer;

/**
 * Created by Denis Starovoitenko on 02.08.2017.
 */
public class ServerDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Server developer creates robust servers.");
    }
}
