package tierramedia;

public class Promociones {
  
  private Atraccion atraccion;
  
  Promociones(){ }
  
  public double getcostoTotal(Atraccion atraccion1, Atraccion atraccion2) {
		
		return atraccion1.getCosto() + atraccion2.getCosto();
	}

}
