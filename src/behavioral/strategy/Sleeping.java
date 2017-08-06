package behavioral.strategy;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping....");
    }
}
