
public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		PizzaPrototype pp = new PizzaPrototype();
		
		System.out.println("Ismael:");
		Pizza eleccionIsmael = (Pizza) pp.pizzaFinal("PizzaYork");
		System.out.println(eleccionIsmael.devolverPizza());
		
		System.out.println("Daniel:");
		Pizza eleccionDani = (Pizza) pp.pizzaFinal("PizzaAtun");
		System.out.println(eleccionDani.devolverPizza());
		
		System.out.println("Josema:");
		Pizza eleccionGosema = (Pizza) pp.pizzaFinal("PizzaGosema");
		System.out.println(eleccionGosema.devolverPizza());
	}

}
