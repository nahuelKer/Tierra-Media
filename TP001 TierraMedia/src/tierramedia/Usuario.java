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
	
	public void visitarAtraccion(Atraccion unaAtraccion) {
		if(this.getPresupuesto() < unaAtraccion.getCosto() || this.getTiempoDisponible() < unaAtraccion.getTiempoPromedio()) {
			throw new Error("No puede acceder a la atraccion, saldo o tiempo insuficiente");
		}
		this.tiempoDisponible -= unaAtraccion.getTiempoPromedio();
		this.presupuesto -= unaAtraccion.getCosto();
	}
	
	

}
