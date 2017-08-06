package structual.bridge;

/**
 * Created by Denis Starovoitenko on 05.08.2017.
 */
public class BankSystem extends Program {
    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    protected void developProgram() {
        System.out.println("Bank system starts working.....");
        developer.writeCode();
    }
}
