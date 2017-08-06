package structual.adapter;

/**
 * Created by Denis Starovoitenko on 05.08.2017.
 */
public class Adapter extends JavaApplication implements DataBase {
    @Override
    public void insert() {
        insertOdject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        printObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }
}
