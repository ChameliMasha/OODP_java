package abstractFactory;

public class VanFactory extends AbstractFactory
{
    @Override
    public Vehicle MakeVehicle(String vehicleType){
        if(vehicleType.equalsIgnoreCase("FRENCH")){
            return new FrenchVan();
        }
        else if(vehicleType.equalsIgnoreCase("EUROPEAN")){
            return new EuropeanVan();
        }
        return null;
    }
}