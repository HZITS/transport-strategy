import Interfaces.*;

public class Ship extends Transport{
    public Ship(){
        setFlyBehavoir(new NeverFly());
        setDriveBehavoir(new NeverDrive());
        setSwimBehavoir(new Swim());
        luggageCapacity = 45;
        topSpeed = 41.2f;
    }
    @Override
    public void display() {
        System.out.println("ship go ... and carry" + luggageCapacity + "kgs of luggage, and drives at around " + topSpeed + "km/h");
    }

    @Override
    public void useFuel() {

    }
}
