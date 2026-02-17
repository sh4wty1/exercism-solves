public class JedliksToyCar {
    public int drivenMeters;
    public int batteryPercentage = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven %d meters".formatted(drivenMeters);
    }

    public String batteryDisplay() {
        if (batteryPercentage > 0) {
            return "Battery at %d%%".formatted(batteryPercentage);
        }
        return "Battery empty";
    }

    public void drive() {
        if (batteryPercentage > 0) {
        drivenMeters += 20;
        batteryPercentage -= 1;
    }
    }
}
