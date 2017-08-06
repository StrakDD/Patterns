package behavioral.strategy;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class Developer {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity(){
        activity.justDoIt();
    }
}
