package abstractFactory;

public class EuropeanVan implements Vehicle{
    @Override
    public void ReturnVehicle(){
        System.out.println("Inside EuropeanVan::ReturnVehicle() method");
    }
}
