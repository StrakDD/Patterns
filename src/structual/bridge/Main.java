package structual.bridge;

/**
 * Created by Denis Starovoitenko on 05.08.2017.
 */
public class Main {

    public static void main(String[] args) {
        Program[] programs = {new BrockerSystem(new JavaDeveloper()), new BankSystem(new CppDeveloper())};

        for (Program program : programs) {
            program.developProgram();
        }
    }
}
