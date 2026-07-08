public class CarsAssemble {
    double carsPerHour;
    int productionPerHour = 221;

    public double productionRatePerHour(int speed) {
        carsPerHour = speed * productionPerHour;
        if(speed == 0){
            carsPerHour = 0;
        } else if(5 <= speed && speed <= 8){
            carsPerHour *= 0.90;
        }else if(speed == 9){
            carsPerHour *= 0.80;
        } else if(speed == 10){
            carsPerHour *= 0.77;
        }
        return carsPerHour;
        
    }

    public int workingItemsPerMinute(int speed) {
        int res = 0;
        if (speed != 0 && speed <= 10){
            res = (int)productionRatePerHour(speed) / 60;
        }
        return res;
    }
}
