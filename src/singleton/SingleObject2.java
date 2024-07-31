package singleton;

public class SingleObject2 {
    //volatile - for the multiple threads to handle correctly
    //the variable is ke[t in the main memory]
    private static volatile SingleObject2 instance;
    private String data;

    // constructor to create objects of this class
    private SingleObject2(String data) {
        this.data = data;
    }

    // public static method created inside the singleton class
    public static SingleObject2 getInstance(String data) {
        //wrapping the if statement to prevent threading isues
        SingleObject2 result = instance;
        if (instance == null) {

            synchronized (SingleObject2.class) {
                result = instance;
                if (instance == null) {
                    instance = new SingleObject2(data);
                }
            }
        }
        return instance;
    }
}
