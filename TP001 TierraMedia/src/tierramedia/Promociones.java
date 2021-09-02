package tierramedia;

public class Promociones {
  
  private Atraccion atraccion;
  private String prueba_git;
  
  Promociones(){ }
  
  public double getcostoTotal(Atraccion atraccion1, Atraccion atraccion2) {
		
		return atraccion1.getCosto(atraccion1, atraccion2) + atraccion2.getCosto(atraccion1, atraccion2);
	}

}
