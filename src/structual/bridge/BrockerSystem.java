package structual.bridge;

/**
 * Created by Denis Starovoitenko on 05.08.2017.
 */
public class BrockerSystem extends Program {


    protected BrockerSystem(Developer developer) {
        super(developer);
    }

    @Override
    protected void developProgram() {
        System.out.println("Blocker system starts working.....");
        developer.writeCode();
    }
}
