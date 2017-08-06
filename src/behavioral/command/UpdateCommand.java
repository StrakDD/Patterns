package behavioral.command;


/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class UpdateCommand implements Command {
    Database dataBase;

    public UpdateCommand(Database dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.update();
    }
}
