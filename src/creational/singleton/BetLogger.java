package creational.singleton;

/**
 * Created by Denis Starovoitenko on 02.08.2017.
 */
class BetLogger {
    private static BetLogger betLogger;
    private static String logString = "This is log file. \n\n";

    public static synchronized BetLogger getBetLogger(){
        if (betLogger == null){
            betLogger = new BetLogger();
        }
        return betLogger;
    }

    private BetLogger(){

    }

    public void addLog(String log){
        logString += log + "\n";
    }

    public void showLog(){
        System.out.println(logString);
    }
}
