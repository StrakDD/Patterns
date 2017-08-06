package structual.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class Flyweight {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpeciality(String speciality){
        Developer developer = developers.get(speciality);

        if(developer == null){
            switch (speciality){
                case "java":
                    System.out.println("Hiring java Delevepor....");
                    developer = new JavaDeveloper();
                    break;
                case "c++":
                    System.out.println("Hiring c++ developer....");
                    developer = new CppDeveloper();
                    break;
            }
            developers.put(speciality, developer);
        }
        return developer;

    }
}
