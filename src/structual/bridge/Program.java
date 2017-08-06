package structual.bridge;

/**
 * Created by Denis Starovoitenko on 05.08.2017.
 */
public abstract class Program {
    protected Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    protected abstract void developProgram();
}
