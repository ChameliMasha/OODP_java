package abstractFactory;

public class Demo {
    public static void main(String[] args){
        AbstractFactory vehicleFactory = FactoryGenerator.getFactory("CAR");
        Vehicle carForFrance =  vehicleFactory.MakeVehicle("FRENCH");
        carForFrance.ReturnVehicle();

        AbstractFactory vehicleFactory2 = FactoryGenerator.getFactory("VAN");
        Vehicle vanForEurope = vehicleFactory2.MakeVehicle("EUROPEAN");
        vanForEurope.ReturnVehicle();

    }
}
