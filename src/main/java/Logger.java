import java.sql.Timestamp;

public class Logger {
    private static Logger instance = null;

    private Logger(){}

    public static Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }

    protected int num = 1;

    public void log(String msg){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("["+ timestamp + " " + num++ + "] " + msg);
    }
}
