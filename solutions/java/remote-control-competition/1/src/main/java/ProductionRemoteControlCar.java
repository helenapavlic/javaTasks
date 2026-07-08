class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{
    private int units = 0;
    private int numberOfVictories = 0;

    public void drive() {
        units += 10;
    }

    public int getDistanceTravelled() {
        return units;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other) {

        // Null safety check
        if (other == null) {
            throw new NullPointerException("Cannot compare with null");
        }

        // Safe comparison (avoids integer overflow)
        return Integer.compare(other.getNumberOfVictories(), this.getNumberOfVictories());
    }
}
