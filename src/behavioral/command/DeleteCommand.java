package behavioral.command;


/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class DeleteCommand implements Command {
    Database dataBase;

    public DeleteCommand(Database dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.delete();
    }
}
