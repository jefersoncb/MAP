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
  
  private final TipoDough dough;
  private final TipoSauce sauce;
  private final TipoCleese cheese;
  private final TipoVeggies[] veggies;
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
    
public enum Dough 
{
  FINA, GROSSA;

  @Override
  public String toString() 
  {
    return name().toLowerCase();
  }

}

public enum Sauce 
{
  TOMATE, BRANCO;

  @Override
  public String toString() 
  {
    return name().toLowerCase();
  }

}

public enum Pepperoni 
{s
  CARNE;

  @Override
  public String toString() 
  {
    return name().toLowerCase();
  }

}

public enum Clams {


  @Override
  public String toString() {
    return name().toLowerCase();
  }
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
  
  public TipoVeggies[] getTipoCheese()
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
  
public static class BuilderChicago 
{
  private final TipoDough dough;
  private final TipoSauce sauce;
  private final TipoCleese cheese;
  private final TipoVeggies[] veggies;
  private final TipoPepperoni pepperoni;
  private final TipoClams clams;

    /**
     * Constructor
     */
    public BuilderChicago(Dough dough, Sauce sauce) 
    {
		if (dough == null || sauce == null) 
        {
        throw new IllegalArgumentException("dough and sauce can not be null");
        }
      this.dough = dough;
      this.sauce = sauce;
	  
    }

	public Builder withVeggies(Veggies veggies) 
    {
      this.veggies = veggies;
      return this;
    }	

	
	public Builder withmPepperoni(Pepperoni pepperoni) 
    {
      this.pepperoni = pepperoni;
      return this;
    }
	
	public Builder withClams(Clams clams) 
    {
      this.clams = clams;
      return this;
    }
	
	public PizzaStoreAF build() {
      return new PizzaStoreAF(this);
    }

}
	
public class App 
{
  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

  public static void main(String[] args) 
  {
    Pizza pizza =
        new Pizza.BuilderChicago(Dough.Fina, Sauce.TOMATE).withmPepperoni(Pepperoni.CARNE).build();
    LOGGER.info(pizza.toString());
  }
}
