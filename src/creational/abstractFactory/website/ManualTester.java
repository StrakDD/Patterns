package creational.abstractFactory.website;

import creational.abstractFactory.entity.Tester;

/**
 * Created by Denis Starovoitenko on 02.08.2017.
 */
public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Tester tests code.");
    }
}
