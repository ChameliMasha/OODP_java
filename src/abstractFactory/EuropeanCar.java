package abstractFactory;

public class EuropeanCar implements Vehicle{
    @Override
    public void ReturnVehicle(){
        System.out.println("Inside EuropeanCar::ReturnVehicle() method");
    }
}
