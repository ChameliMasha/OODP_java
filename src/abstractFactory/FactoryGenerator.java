package abstractFactory;

public class FactoryGenerator {
    public static AbstractFactory getFactory(String vehicleType){
        if(vehicleType.equalsIgnoreCase("CAR")){
            return new CarFactory();
        }
        else if (vehicleType.equalsIgnoreCase("VAN")){
            return new VanFactory();
        }
        return null;
    }
}
