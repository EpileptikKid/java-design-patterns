package Builder;

public class CarBuilder implements Builder {
    private Car car;
    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats(int count) {
        car.setSeats(count);
    }

    @Override
    public void setEngine(String engineName) {
        car.setEngine(engineName);
    }

    @Override
    public void setTripComputer(String tripComputerName) {
        car.setTripComputer(tripComputerName);
    }

    @Override
    public void setGPS(boolean installed) {
        car.setGps(installed);
    }

    public Car getResult() {
        return car;
    }
}
