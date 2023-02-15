package factoryMethod;

import static factoryMethod.Vehicle.VehicleEnum.CAR;
import static factoryMethod.Vehicle.VehicleEnum.TRAIN;

public class BuildVehicle {
   /* public Vehicle getVehicle(String vehicle){
        if(vehicle.equals("car")){
            return new Car(25);
        }
    }*/
    public SpeedInterface getVehicle(Vehicle.VehicleEnum vehicle){
        switch (vehicle){
            case CAR: return new Car(12);
            case TRAIN : return new Train(23);
            // se aggiungo un veicolo basta modificare qui
            default: throw  new RuntimeException("Vehicle not recognised");
        }
    }
}
