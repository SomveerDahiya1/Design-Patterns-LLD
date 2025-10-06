package SingletonDesignPattern;

public class Logger {
    static private Logger logger = null;//Return Instance
    static public int count ;
    private int value ;
    private Logger() //Pvt. Constructor
        {   count+=1 ;
            System.out.println("---Logs constructor("+count+")---");
        }

        public static Logger getLogger()
        {
            if (logger == null)
            {
                logger = new Logger(); //Constructor
            }
            return logger;
        }
        public void setValue(int value)
        {
            this.value=value ;
        }
        public int getValue()
        {
            return value ;
        }
}