package patrones;

public class Application {
	public static void main(String[] args) {
		Concesionario concesionario = new Concesionario();
	    CarBuilder builder = new CarBuilder();
	    concesionario.createSmallCar(builder);
	    Car car = builder.getCar();
	    System.out.println("Mi coche de tipo: " + car.getCarType());
	}
}
