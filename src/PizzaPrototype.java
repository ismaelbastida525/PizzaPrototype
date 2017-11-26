import java.util.HashMap;

public class PizzaPrototype {

	private HashMap<String,Pizza> catalogo = new HashMap<String,Pizza>();

	public PizzaPrototype() {
		PizzaAtun pizzaAtun = new PizzaAtun("harina", "tomate");
		PizzaYork pizzaYork = new PizzaYork("napolitana ", "tomate");
		Khlavkalash pizzaGosema = new Khlavkalash("maiz", "yogurt");
		
		catalogo.put("PizzaAtun", pizzaAtun);
		catalogo.put("PizzaYork", pizzaYork);
		catalogo.put("PizzaGosema", pizzaGosema);
	}
	
	public Object pizzaFinal(String tipo) throws CloneNotSupportedException {
		return catalogo.get(tipo).clone();
	}
	
}
