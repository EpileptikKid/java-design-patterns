package Builder;

public class Application {
    public static void makeCar() {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportCar(builder);
        Car car = builder.getResult();
        System.out.println(car);

        ManualBuilder manualBuilder = new ManualBuilder();
        director.constructSportCar(manualBuilder);
        CarManual carManual = manualBuilder.getResult();
        System.out.println(carManual);
    }

    public static void main(String[] args) {
        makeCar();
    }
}
