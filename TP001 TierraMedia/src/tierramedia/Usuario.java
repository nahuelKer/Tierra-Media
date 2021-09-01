package tierramedia;

public class Usuario {
	private int presupuesto;
	private int tiempoDisponible;
	private String tipoDeAtraccion;
	private String nombre;

	public Usuario(String nombre, int presupuesto, int tiempoDisponible, String tipoDeAtraccion) {
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.tiempoDisponible = tiempoDisponible;
		this.tipoDeAtraccion = tipoDeAtraccion;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public int getTiempoDisponible() {
		return tiempoDisponible;
	}

	public String getTipoDeAtraccion() {
		return tipoDeAtraccion;
	}

	public String getNombre() {
		return nombre;
	}
	
	

}
