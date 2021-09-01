package tierramedia;

public abstract class Atraccion {
	private String nombrE;
	private int costo;
	private int tiempoMedio;
	private int cupoMax;
	private int prueba;
	
	public Atraccion(){
	}
	

	public Atraccion(String nombre, int costo, int tiempoMedio, int cupoMax) {
		this.nombre = nombre;
		this.costo = costo;
		this.tiempoMedio = tiempoMedio;
		this.cupoMax = cupoMax;
		
	}

}
