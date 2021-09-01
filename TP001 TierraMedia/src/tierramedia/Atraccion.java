package tierramedia;

public abstract class Atraccion {
	private String nombrE;
	private int costo;
	private int tiempoMedio;
	private int cupoMax;
	private tipoDeAtraccion tipoAtraccion;

	

	public Atraccion(String nombre, int costo, int tiempoMedio, int cupoMax, tipoDeAtraccion tipoAtraccion) {
		this.nombre = nombre;
		this.costo = costo;
		this.tiempoMedio = tiempoMedio;
		this.cupoMax = cupoMax;
		this.tipoAtraccion = tipoAtraccion;
		
	}
	public TipoDeAtraccion getTipoAtraccion() {
		return tipoAtraccion;
	}
	public static  List<Atraccion> listaDeAtracciones(Usuario usuario, List<Atraccion> atracciones) {
		TipoDeAtraccion tipo = usuario.getAtraccion();
		List <Atraccion> listaAtracciones = atracciones.stream()
				.filter(atraccion -> atraccion.getTipoAtraccion() == tipo)
				.collect(Collectors.toList());	
		return listaAtracciones;
	}
	
	public static void ordenarAtraccionPorCosto(List<Atraccion> lista) {
		Collections.sort(lista, new CostoComparacion());
	}

}
