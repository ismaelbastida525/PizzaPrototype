
public class Khlavkalash extends Pizza {
	private String khlavkalash = "Khlavkalash";
	private String escorpiones = "escorpiones";
	private String gasolina = "gasolina";
	
	public Khlavkalash(String masa, String salsa) {
		super(masa, salsa);
		setKhlavkalash(khlavkalash);
		setEscorpiones(escorpiones);
		setGasolina(gasolina);
	}

	public String getKhlavkalash() {
		return khlavkalash;
	}

	public void setKhlavkalash(String khlavkalash) {
		this.khlavkalash = khlavkalash;
	}

	public String getEscorpiones() {
		return escorpiones;
	}

	public void setEscorpiones(String escorpiones) {
		this.escorpiones = escorpiones;
	}

	public String getGasolina() {
		return gasolina;
	}

	public void setGasolina(String gasolina) {
		this.gasolina = gasolina;
	}

	@Override
	public String devolverPizza() {
		String resultado = this.getBasicIngredients();
		resultado += khlavkalash + ", " + escorpiones + " y mucha " + gasolina;
		return resultado;
	}

}
