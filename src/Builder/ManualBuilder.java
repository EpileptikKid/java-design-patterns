package Builder;

public class ManualBuilder implements Builder {
    private CarManual carManual;

    public void reset() {
        carManual = new CarManual();
    }

    @Override
    public void setSeats(int count) {
        carManual.setSeats(count);
    }

    @Override
    public void setEngine(String engineName) {
        carManual.setEngine(engineName);
    }

    @Override
    public void setTripComputer(String tripComputerName) {
        carManual.setTripComputer(tripComputerName);
    }

    @Override
    public void setGPS(boolean installed) {
        carManual.setGps(installed);
    }

    public CarManual getResult() {
        return carManual;
    }
}
