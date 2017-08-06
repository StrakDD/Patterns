package structual.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denis Starovoitenko on 05.08.2017.
 */
public class Team {
    private List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void deleteDeveloper(Developer developer){
        developers.remove(developer);
    }

    public void createProject(){
        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
