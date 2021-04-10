
public class Personagem {
	private String nome;
	private int forca;
	private int sono;
	private int fome;
	
	//sobrecarga de construtores
	public Personagem(String nome, int fome, int forca, int sono) {
		this.setNome (nome);
		this.setFome (fome);
		this.setForca (forca);
		this.setSono (sono);
	}
	public Personagem(String nome) {
		this.setNome (nome);
		this.setSono (1);
		this.setFome (1);
		this.setForca (1);
	}
	public Personagem() {
		this.setNome ("Roi");
		this.setSono (1);
		this.setFome (1);
		this.setForca (1);
	}
	
	//métodos de acesso
	public String getNome() {
		return nome;
	}
	public int getSono() {
		return sono;
	}
	public int getForca() {
		return forca;
	}
	public int getFome() {
		return fome;
	}
	
	
	//métodos modificadores = setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setForca (int forca) {
		if(forca>= -5 && forca<= 5)
			this.forca = forca;
	}
	public void setFome(int fome) {
		if(fome>=0 && fome<=8 )
			this.fome = fome;
	}
	public void setSono(int sono) {
		if(sono >=0 && sono <=10)
			this.sono = sono;
		else if (sono < 0)
			this.sono = 0;
		else
			this.sono = 10;
	}
		
	void dormir() {
		this.setSono(this.getSono()-2);
		this.setForca(this.getForca()+1);
	}

	int soma (int a, int b) {
		return a+b;
	}
	int soma(int a, int b, int c) {
		return a+b+c;
	}
}
