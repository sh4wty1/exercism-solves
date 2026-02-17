
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        int lastIndex = birdsPerDay.length - 1;
        birdsPerDay[lastIndex] = getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int birds: birdsPerDay) {
            if (birds == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int counter = 0;
        if (numberOfDays <= birdsPerDay.length) {
            for (int i = 0; i < numberOfDays; i++) {
            counter += birdsPerDay[i];
            }
        } else {
            for (int i = 0; i < birdsPerDay.length; i++) {
            counter += birdsPerDay[i];
            }
        }
        return counter;
    }

    public int getBusyDays() {
        int counter = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] >= 5) {
                counter++;
            }
        }
        return counter;
    }
}
