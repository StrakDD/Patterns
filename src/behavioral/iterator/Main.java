package behavioral.iterator;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "PostgreSQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Denis", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer:" + javaDeveloper.getName());

        System.out.println("Skills: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
