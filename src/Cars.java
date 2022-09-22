import Interfaces.*;

public class Cars extends Transport {

    public Cars(){
        setFlyBehavoir(new NeverFly());
        setDriveBehavoir(new Driving());
        setSwimBehavoir(new NeverSwim());
        luggageCapacity = 95;
        topSpeed = 140;
    }
    @Override
    public void display() {
        System.out.println("car go vroom and carry " + luggageCapacity + "kgs of luggage, and drives at around " + topSpeed + "km/h");
    }

    @Override
    public void useFuel() {
        System.out.println("car go vroom");
    }
}
