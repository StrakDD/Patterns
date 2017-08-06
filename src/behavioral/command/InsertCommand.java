package behavioral.command;


/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class InsertCommand implements Command {
    Database dataBase;

    public InsertCommand(Database dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.insert();
    }
}
