package behavioral.command;


/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class SelectCommand implements Command {
    Database dataBase;

    public SelectCommand(Database dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.select();
    }
}
