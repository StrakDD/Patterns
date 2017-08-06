package structual.adapter;

/**
 * Created by Denis Starovoitenko on 05.08.2017.
 */
public class Main {

    public static void main(String[] args) {
        DataBase dataBase = new Adapter();

        dataBase.insert();
        dataBase.update();
        dataBase.select();
        dataBase.delete();
    }
}
