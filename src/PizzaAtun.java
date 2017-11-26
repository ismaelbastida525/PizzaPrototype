
public class PizzaAtun extends Pizza {
	private String atun = "atun";

	public PizzaAtun(String masa, String salsa) {
		super(masa, salsa);
		setAtun(atun);
	}

	public String getAtun() {
		return atun;
	}

	public void setAtun(String atun) {
		this.atun = atun;
	}

	@Override
	public String devolverPizza() {
		String resultado = super.getBasicIngredients();
		resultado += atun;
		return resultado;
	}

}
