
public class Carta {
	private String naipe;
	private String valor;
	
	public Carta() {
	}
	public Carta(String naipe, String valor) {
		this.naipe = naipe;
		this.valor = valor;
	}
	public String getNaipe() {
		return naipe;
	}
	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getValor() {
		return valor;
	}
	@Override
	public String toString() {
		return "Carta [naipe=" + naipe + ", valor=" + valor + "]";
	}

}
