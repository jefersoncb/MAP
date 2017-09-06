package software_design.abstractFactory;


class PizzaStoreAF 
{
 /* public interface PizzaIngredientFactory {

  	public Dough createDough();
  	public Sauce createSauce();
  	public Cheese createCheese();
  	public Veggies[] createVeggies();
  	public Pepperoni createPepperoni();
  	public Clams createClam();

  */
  
  public enum TipoPepperoni
  {
	
  }
  
  public enum TipoVeggies
  {
	  
  }
  
  public enum TipoClams
  {
	  
  }
  
   public enum TipoCleese
  {
	  
  }
  
   public enum TipoSauce
  {
	  
  }
  
  public enum TipoDough
  {
	  
  }
  
  private final TipoDough dough;
  private final TipoSauce sauce;
  private final TipoCleese cheese;
  private final TipoVeggies veggies;
  private final TipoPepperoni pepperoni;
  private final TipoClams clams;
  
  
  private PizzaStoreAF(Builder builder)
  {
	  this.dough = builder.dough;
	  this.sauce = builder.sauce;
	  this.cheese = builder.cheese;
	  this.veggies = builder.veggies;
	  this.pepperoni = builder.pepperoni;
	  this.clams = builder.clams;
  }
  
  public TipoDough getTipoDough()
  {
	  return dough;
  }
  
  public TipoSauce getTipoSauce()
  {
	  return sauce;
  }
  
  public TipoCleese getTipoCleese()
  {
	  return cheese;
  }
  
  public TipoVeggies getTipoCheese()
  {
	  return veggies;
  }
  
  public TipoPepperoni getTipoPepperoni()
  {
	  return pepperoni;
  }
  
  public TipoClams getTipoClams()
  {
	  return clams;
  }
  
  // Concrete Factory
  public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    	public Dough createDough() {
    		return new ThinCrustDough();
    	}

    	public Sauce createSauce() {
    		return new MarinaraSauce();
    	}

    	public Cheese createCheese() {
    		return new ReggianoCheese();
    	}

    	public Veggies[] createVeggies() {
    		Veggies veggies[] = { new BlackOlives(),
    		                      new Spinach(),
    		                      new Eggplant() };
    		return veggies;
    	}

    	public Pepperoni createPepperoni() {
    		return new SlicedPepperoni();
    	}

    	public Clams createClam() {
    		return new FreshClams();
    	}
  }
  // Parts of Pizza
  public interface Clams {
	   public String toString();
  }

  public interface Cheese {
	   public String toString();
  }

  public interface Sauce {
	    public String toString();
  }

  public interface Dough {
  	public String toString();
  }

  public interface Pepperoni {
  	public String toString();
  }

  public class FreshClams implements Clams {

  	public String toString() {
  		return "Fresh Clams from Long Island Sound";
  	}
  }

  public class ReggianoCheese implements Cheese {

  	public String toString() {
  		return "Reggiano Cheese";
  	}
  }

  public class MarinaraSauce implements Sauce {
	  public String toString() {
	    return "Marinara Sauce";
	  }
  }

  public class ThinCrustDough implements Dough {
  	public String toString() {
  		return "Thin Crust Dough";
  	}
  }

  public class SlicedPepperoni implements Pepperoni {
    public String toString() {
      return "Sliced Pepperoni";
    }
  }
}
