public class ExperimentalRemoteControlCar implements RemoteControlCar  {
    private int units = 0;
    private int numberOfVictories = 0;

    public void drive() {
        units += 20;
    }

    public int getDistanceTravelled() {
        return units;
    }
}
