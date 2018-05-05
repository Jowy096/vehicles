package vehicles;

public class Vehicle {
	public static final int VELOCITAT_MAXIMA = 120;
	private int cilindrada;
	private int Portes;
	private double velocitat_actual;

	public Vehicle(int cilindrada, int portes, double velocitat_actual) {
		super();
		this.cilindrada = cilindrada;
		Portes = portes;
		this.velocitat_actual = velocitat_actual;

		velocitat_actual = 0;
	}

	public double Accelerar() {

		if (velocitat_actual < VELOCITAT_MAXIMA) {

			velocitat_actual = velocitat_actual + 10;

		}
		return velocitat_actual;
	}

	public double Desaccelerar() {

		if (velocitat_actual > 0) {

			velocitat_actual = velocitat_actual - 10;

		}
		return velocitat_actual;
	}

}
