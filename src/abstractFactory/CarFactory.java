package abstractFactory;

public class CarFactory extends AbstractFactory
{
    @Override
    public Vehicle MakeVehicle(String vehicleType){
        if(vehicleType.equalsIgnoreCase("FRENCH")){
            return new FrenchCar();
        }
        else if(vehicleType.equalsIgnoreCase("EUROPEAN")){
            return new EuropeanCar();
        }
        return null;
    }
}
