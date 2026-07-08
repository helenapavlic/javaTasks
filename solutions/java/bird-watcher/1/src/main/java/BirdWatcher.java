
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] lastWeek = {0,2,5,3,7,8,4};
        return lastWeek;
    }

    public int getToday() {
        return birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        birdsPerDay[6] += 1;
    }

    public boolean hasDayWithoutBirds() {
        boolean zeroBirds = false;
        for (int birdNum: birdsPerDay){
            if (birdNum == 0){
                zeroBirds = true;
            }
        }
        return zeroBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int numOfBirds = 0;
        for(int i = 0; i<=6; i++){
            if(i<numberOfDays){
                numOfBirds += birdsPerDay[i];
            }
        }
        return numOfBirds;
    }

    public int getBusyDays() {
        int numOfBusyDays = 0;
        for(int numOfBirds: birdsPerDay){
            if(numOfBirds >= 5){
                numOfBusyDays++; 
            }
        }
        return numOfBusyDays;
    }
}
