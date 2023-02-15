package factoryMethod;

public class Vehicle implements SpeedInterface {

    private  int speed;
    public Vehicle(int speed){
        this.speed = speed;
    }

    public int getSpeed(){
        return this.speed;
    }

    public enum VehicleEnum {
        BIKE,
        CAR,
        MOTO,
        PLANE,
        TRAIN;

    }

}
