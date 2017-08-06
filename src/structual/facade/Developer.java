package structual.facade;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker){
        if (bugTracker.isActiveSprint()){
            System.out.println("Developer is solving problems...");
        }else {
            System.out.println("Developer is reading hubhubr...");
        }
    }
}
