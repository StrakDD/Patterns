package behavioral.command;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class Developer {
    Command insert;
    Command delete;
    Command select;
    Command update;

    public Developer(Command insert, Command delete, Command select, Command update) {
        this.insert = insert;
        this.delete = delete;
        this.select = select;
        this.update = update;
    }

    public void insertRecord(){
        insert.execute();
    }

    public void deleteRecord(){
        delete.execute();
    }

    public void updateRecord(){
        delete.execute();
    }

    public void selectRecord(){
        delete.execute();
    }
}
