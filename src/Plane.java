import Interfaces.*;

public class Plane extends Transport {
    public Plane(){
        setFlyBehavoir(new Fly());
        setDriveBehavoir(new NeverDrive());
        setSwimBehavoir(new NeverSwim());
        luggageCapacity = 23;
        topSpeed = 912f;
    }

    @Override
    public void display() {
        System.out.println("plane go FSHIIIIIIIIIIII and carry " + luggageCapacity + "kgs of luggage, and drives at around " + topSpeed + "km/h");
    }

    @Override
    public void useFuel() {

    }
}
