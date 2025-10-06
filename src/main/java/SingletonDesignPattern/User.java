package SingletonDesignPattern;

public class User {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger();
        Logger logger2 = Logger.getLogger();

        logger1.setValue(10);//Initialized the value to 10 using logger1
        System.out.println(logger2.getValue());//Getting the value using logger2

        String result = (logger1==logger2)?"Skeleton Design passed":"Skeleton Design failed";
        System.out.println(result);
    }
}
