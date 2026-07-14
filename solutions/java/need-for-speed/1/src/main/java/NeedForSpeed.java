class NeedForSpeed {
    public int speed;
    public int batteryDrain;
    public int battery;
    public int distance;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        battery = 100;
        distance = 0;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if(!batteryDrained()){
            distance += speed;
            battery -= batteryDrain;  
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed car = new NeedForSpeed(50,4);
        return car;
    }
}

class RaceTrack {
    //track distance
    private int distance;

    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int numberOfDrives = (distance + car.speed - 1) / car.speed;
        int batteryNeeded = numberOfDrives * car.batteryDrain;
        return batteryNeeded <= car.battery;
    }
}
