
public class PizzaYork extends Pizza{
	private String york = "york";
	public PizzaYork(String masa, String salsa) {
		super(masa, salsa);
		setYork(york);
	}


	public String getYork() {
		return york;
	}

	public void setYork(String york) {
		this.york = york;
	}

	@Override
	public String devolverPizza() {
		String resultado = super.getBasicIngredients();
		resultado += york;
		return resultado;
	}

}
