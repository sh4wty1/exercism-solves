public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int driven;

    public void drive() {
        driven += 20;
    }

    public int getDistanceTravelled() {
        return driven;
    }
}