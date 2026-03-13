public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int totalProduction = speed * 221;
        if (0 <= speed && speed <= 4) {
            return totalProduction;
        } else if (5 <= speed && speed <= 8) {
            return totalProduction * 0.9;
        } else if (speed == 9) {
            return totalProduction * 0.8;
        } else {
            return totalProduction * 0.77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        double minuteProduction = productionRatePerHour(speed) / 60;
        return (int) minuteProduction;
    }
}
