package behavioral.visitor;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public interface Developer {
    void create(ProjectClass projectClass);
    void create(Database database);
    void create(Test test);

}
