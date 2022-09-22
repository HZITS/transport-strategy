import Interfaces.DriveBehavoir;
import Interfaces.FlyBehavoir;
import Interfaces.SwimBehavoir;

public abstract class Transport {
    public static float luggageCapacity;
    public static float topSpeed;
    DriveBehavoir driveBehavoir;
    FlyBehavoir flyBehavoir;
    SwimBehavoir swimBehavoir;

    public void setFlyBehavoir(FlyBehavoir fb) {flyBehavoir = fb;}
    public void setDriveBehavoir(DriveBehavoir db) {driveBehavoir = db;}
    public void setSwimBehavoir(SwimBehavoir sb) {swimBehavoir = sb;}

    public void performFly() {
        flyBehavoir.fly();
    }

    public void performDrive() {
        driveBehavoir.drive();
    }

    public void performSwim() {swimBehavoir.swim();}

    public abstract void display();

    public abstract void useFuel();

}