package behavioral.state;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class Developer {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity(){
        if (activity instanceof Sleeping){
            setActivity(new Training());
        }else if (activity instanceof Training){
            setActivity(new Coding());
        }else if (activity instanceof Coding){
            setActivity(new Reading());
        }else if (activity instanceof Reading){
            setActivity(new Sleeping());
        }
    }

    public void justDoIt(){
        activity.justDoIt();
    }
}
