package Builder;

public class CarManual {
    String seats;
    String engine;
    String tripComputer;
    String gps;

    public void setSeats(int seats) {
        this.seats = "This car have a " + seats + " seats";
    }

    public void setEngine(String engine) {
        this.engine = "Manual of " + engine;
    }

    public void setTripComputer(String tripComputer) {
        this.tripComputer = "Manual of " + tripComputer;
    }

    public void setGps(boolean gps) {
        if (gps) {
            this.gps = "Manual of gps";
        } else {
            this.gps = "GPS not installed";
        }
    }

    @Override
    public String toString() {
        String result = seats + "\n"
                + engine + "\n"
                + tripComputer + "\n"
                + gps + "\n" + "_____________";
        return result;
    }
}
