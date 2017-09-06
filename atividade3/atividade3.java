import java.util.ArrayList;


// Refatore o código da PizzaStore que foi visto em sala, utilizando interface ao invés de herança como está atualmente.
public class Atividade3 
{
	interface PizzaStore 
    {
		public Pizza createPizza(String item);

		public Pizza orderPizza(String type);
	}

	interface Pizza 
    {
		public void prepare();

		public void bake();

		public void cut();

		public void box();

		public String getName();

		public String toString();
	}

	class ChicagoPizzaStore implements PizzaStore
    {
		@Override
		public Pizza createPizza(String item) 
        {
			if (item.equals("cheese")) 
            {
				return new ChicagoStyleCheesePizza();
			} else if (item.equals("veggie")) 
            {
				return new ChicagoStyleVeggiePizza();
			} else if (item.equals("clam"))
            {
				return new ChicagoStyleClamPizza();
			} else if (item.equals("pepperoni"))
            {
				return new ChicagoStylePepperoniPizza();
			} else
				return null;
		}

		@Override
		public Pizza orderPizza(String type)
        {
			Pizza pizza = createPizza(type);
			System.out.println("--- Making a " + pizza.getName() + " ---");
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
			return pizza;
		}

	}

	class ChicagoStyleCheesePizza implements Pizza 
    {
		String name;
		String dough;
		String sauce;
		ArrayList<String> toppings = new ArrayList<String>();
		
		public ChicagoStyleCheesePizza() 
        {
	  		name = "Chicago Style Deep Dish Cheese Pizza";
	  		dough = "Extra Thick Crust Dough";
	  		sauce = "Plum Tomato Sauce";

	  		toppings.add("Shredded Mozzarella Cheese");
		}

		public void prepare() 
        {
			System.out.println("Prepare " + name);
	  		System.out.println("Tossing dough...");
	  		System.out.println("Adding sauce...");
	  		System.out.println("Adding toppings: ");
	  		for (String topping : toppings) 
            {
	  			System.out.println("   " + topping);
	  			}
		}

		@Override
		public void bake() 
        {
			System.out.println("Bake for 25 minutes at 350");
		}

		@Override
		public void cut() 
        {
			System.out.println("Cutting the pizza into square slices");

		}

		@Override
		public void box() {
			System.out.println("Place pizza in official PizzaStore box");

		}

		@Override
		public String getName() 
        {
			return name;
		}
		
		public String toString() 
        {
	  		StringBuffer display = new StringBuffer();
	  		display.append("---- " + name + " ----\n");
	  		display.append(dough + "\n");
	  		display.append(sauce + "\n");
	  		for (String topping : toppings) {
	  			display.append(topping + "\n");
	  		}
	  		return display.toString();
	  	}

	}

	class ChicagoStyleVeggiePizza implements Pizza
    {	
		String name;
	  	String dough;
	  	String sauce;
	  	ArrayList<String> toppings = new ArrayList<String>();
	  	
	  	public ChicagoStyleVeggiePizza()
        {
	  		name = "Chicago Deep Dish Veggie Pizza";
	  		dough = "Extra Thick Crust Dough";
	  		sauce = "Plum Tomato Sauce";

	  		toppings.add("Shredded Mozzarella Cheese");
	  		toppings.add("Black Olives");
	  		toppings.add("Spinach");
	  		toppings.add("Eggplant");
	  	}

		@Override
		public void prepare() 
        {
			System.out.println("Prepare " + name);
	  		System.out.println("Tossing dough...");
	  		System.out.println("Adding sauce...");
	  		System.out.println("Adding toppings: ");
	  		for (String topping : toppings) {
	  			System.out.println("   " + topping);
	  		}
		}

		@Override
		public void bake() 
        {
			System.out.println("Bake for 25 minutes at 350");
			
		}

		@Override
		public void cut() 
        {
			System.out.println("Cutting the pizza into square slices");
		}

		@Override
		public void box() 
        {
			System.out.println("Place pizza in official PizzaStore box");
		}

		@Override
		public String getName() 
        {
			return name;
		}
		
		public String toString() 
        {
	  		StringBuffer display = new StringBuffer();
	  		display.append("---- " + name + " ----\n");
	  		display.append(dough + "\n");
	  		display.append(sauce + "\n");
	  		for (String topping : toppings) {
	  			display.append(topping + "\n");
	  		}
	  		return display.toString();
	  	}
	}

	class ChicagoStyleClamPizza implements Pizza
    {
		String name;
	  	String dough;
	  	String sauce;
	  	ArrayList<String> toppings = new ArrayList<String>();
	  	
	  	public ChicagoStyleClamPizza() 
        {
	  		name = "Chicago Style Clam Pizza";
	  		dough = "Extra Thick Crust Dough";
	  		sauce = "Plum Tomato Sauce";

	  		toppings.add("Shredded Mozzarella Cheese");
	  		toppings.add("Frozen Clams from Chesapeake Bay");
	  	}

		@Override
		public void prepare()
        {
			System.out.println("Prepare " + name);
	  		System.out.println("Tossing dough...");
	  		System.out.println("Adding sauce...");
	  		System.out.println("Adding toppings: ");
	  		for (String topping : toppings) 
            {
	  			System.out.println("   " + topping);
	  		}
		}

		@Override
		public void bake() 
        {
			System.out.println("Bake for 25 minutes at 350");
		}

		@Override
		public void cut() 
        {
			System.out.println("Cutting the pizza into square slices");	
		}

		@Override
		public void box() 
        {
			System.out.println("Place pizza in official PizzaStore box");
		}

		@Override
		public String getName() 
        {
			return name;
		}
		
		public String toString() 
        {
	  		StringBuffer display = new StringBuffer();
	  		display.append("---- " + name + " ----\n");
	  		display.append(dough + "\n");
	  		display.append(sauce + "\n");
	  		for (String topping : toppings) {
	  			display.append(topping + "\n");
	  		}
	  		return display.toString();
	  	}
	}

	class ChicagoStylePepperoniPizza implements Pizza
    {
		String name;
	  	String dough;
	  	String sauce;
	  	ArrayList<String> toppings = new ArrayList<String>();
	  	
	  	public ChicagoStylePepperoniPizza() 
        {
	  		name = "Chicago Style Pepperoni Pizza";
	  		dough = "Extra Thick Crust Dough";
	  		sauce = "Plum Tomato Sauce";

	  		toppings.add("Shredded Mozzarella Cheese");
	  		toppings.add("Black Olives");
	  		toppings.add("Spinach");
	  		toppings.add("Eggplant");
	  		toppings.add("Sliced Pepperoni");
	  	}

		@Override
		public void prepare() 
        {
			System.out.println("Prepare " + name);
	  		System.out.println("Tossing dough...");
	  		System.out.println("Adding sauce...");
	  		System.out.println("Adding toppings: ");
	  		for (String topping : toppings) {
	  			System.out.println("   " + topping);
	  		}
		}

		@Override
		public void bake() 
        {
			System.out.println("Bake for 25 minutes at 350");
		}

		@Override
		public void cut() 
        {
			System.out.println("Cutting the pizza into square slices");
		}

		@Override
		public void box()
        {
			System.out.println("Place pizza in official PizzaStore box");
		}

		@Override
		public String getName() 
        {
			return name;
		}
		
		public String toString() 
        {
	  		StringBuffer display = new StringBuffer();
	  		display.append("---- " + name + " ----\n");
	  		display.append(dough + "\n");
	  		display.append(sauce + "\n");
	  		for (String topping : toppings) 
            {
	  			display.append(topping + "\n");
	  		}
	  		return display.toString();
	  	}
	}
}