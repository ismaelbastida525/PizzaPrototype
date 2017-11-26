
public abstract class Pizza implements Cloneable {
	private String masa;
	private String salsa;

	public Pizza(String masa, String salsa) {
		super();
		setMasa(masa);
		setSalsa(salsa);
	}

	/**
	 * Metodo clonador
	 */
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public abstract String devolverPizza();

	public String getBasicIngredients() {
		return "Su pizza lleva: masa-" + getMasa() + ", salsa-" + getSalsa() + " y además: ";
	}

	public String getMasa() {
		return masa;
	}

	public void setMasa(String masa) {
		this.masa = masa;
	}

	public String getSalsa() {
		return salsa;
	}

	public void setSalsa(String salsa) {
		this.salsa = salsa;
	}
}