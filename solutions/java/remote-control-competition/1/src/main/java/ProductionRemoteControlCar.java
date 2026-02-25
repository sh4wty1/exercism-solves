class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int driven;
    public int victories;

    public void drive() {
        driven += 10;
    }

    public int getDistanceTravelled() {
        return driven;
    }

    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        victories += numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(other.getNumberOfVictories(), this.getNumberOfVictories());
    }
}
