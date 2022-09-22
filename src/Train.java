import Interfaces.*;

public class Train extends Transport {
    public Train(){
        setFlyBehavoir(new NeverFly());
        setDriveBehavoir(new Driving());
        setSwimBehavoir(new NeverSwim());
        luggageCapacity = 40;
        topSpeed = 110;
    }

    @Override
    public void display() {
        System.out.println("tren go dudunk and carry " + luggageCapacity + "kgs of luggage, and drives at around " + topSpeed + "km/h" );
    }

    @Override
    public void useFuel() {

    }
}