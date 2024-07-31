package singleton;

public class SingleObject {

    //object of SingleObject
    private static SingleObject instance = new SingleObject();

    //private constructor
    private SingleObject() {
    }
    
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("hello world");
    }

}
