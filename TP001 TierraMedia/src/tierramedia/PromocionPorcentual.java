package tierramedia;


public class PromocionPorcentual extends Promociones {
	
	public PromocionPorcentual() {
	}


	public double descuentoPorcentual(Atraccion atraccion1, Atraccion atraccion2, int descuento) {
		return this.getcostoTotal(atraccion1, atraccion2) - ((descuento*this.getcostoTotal(atraccion1, atraccion2))/100);
	}

}
