package Builder;

public class Director {
    public void constructSportCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("Sport Engine");
        builder.setTripComputer("SportCar Trip Computer");
        builder.setGPS(true);
    }
}
