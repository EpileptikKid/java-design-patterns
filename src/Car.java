package Builder;

public class Car {
    int seats;
    String engine;
    String tripComputer;
    boolean gps;

    public int getSeats() { return seats; }

    public void setSeats(int seats) { this.seats = seats; }

    public String getEngine() { return engine; }

    public void setEngine(String engine) { this.engine = engine; }

    public String getTripComputer() { return tripComputer; }

    public void setTripComputer(String tripComputer) { this.tripComputer = tripComputer; }

    public boolean getGps() { return gps; }

    public void setGps(boolean gps) { this.gps = gps; }

    @Override
    public String toString() {
        String result = "Seats - " + seats + "\n"
                + "Engine - " + engine + "\n"
                + "Trip Computer - " + tripComputer + "\n"
                + "GPS - " + gps + "\n" + "__________________";
        return result;
    }
}
