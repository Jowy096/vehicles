package vehicles;

public class Vehicle {
	public static final int VELOCITAT_MAXIMA=120;
	private int cilindrada;
	private int Portes;
	private double velocitat_actual;
	
	public Vehicle(int cilindrada, int portes, double velocitat_actual) {
		super();
		this.cilindrada = cilindrada;
		Portes = portes;
		this.velocitat_actual = velocitat_actual;
		
		velocitat_actual =0;
	}
	
	
	
}
