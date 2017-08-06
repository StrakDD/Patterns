package structual.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class Main {

    public static void main(String[] args) {
        Flyweight flyweight = new Flyweight();

        List<Developer> developers = new ArrayList<>();
        developers.add(flyweight.getDeveloperBySpeciality("java"));
        developers.add(flyweight.getDeveloperBySpeciality("java"));
        developers.add(flyweight.getDeveloperBySpeciality("java"));
        developers.add(flyweight.getDeveloperBySpeciality("java"));
        developers.add(flyweight.getDeveloperBySpeciality("java"));
        developers.add(flyweight.getDeveloperBySpeciality("java"));
        developers.add(flyweight.getDeveloperBySpeciality("java"));
        developers.add(flyweight.getDeveloperBySpeciality("java"));
        developers.add(flyweight.getDeveloperBySpeciality("c++"));
        developers.add(flyweight.getDeveloperBySpeciality("c++"));
        developers.add(flyweight.getDeveloperBySpeciality("c++"));
        developers.add(flyweight.getDeveloperBySpeciality("c++"));
        developers.add(flyweight.getDeveloperBySpeciality("c++"));

        for (Developer developer : developers) {
            developer.writeCode();
        }

    }
}
