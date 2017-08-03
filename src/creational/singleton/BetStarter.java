package creational.singleton;


/**
 * Created by Denis Starovoitenko on 02.08.2017.
 */
public class BetStarter {
    public static void main(String[] args) {
        BetLogger.getBetLogger().addLog("First bet.....");
        BetLogger.getBetLogger().addLog("Second bet.....");
        BetLogger.getBetLogger().addLog("Third bet.....");

        BetLogger.getBetLogger().showLog();
    }
}
