package Builder;

public interface Builder {
    void reset();
    void setSeats(int count);
    void setEngine(String engineName);
    void setTripComputer(String tripComputerName);
    void setGPS(boolean installed);
}
