import java.util.List;
import java.util.ArrayList;

public class TestTrack{
    List<ProductionRemoteControlCar> cars = new ArrayList();

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        cars.sort(null); 
        return cars;
        
    }
}
