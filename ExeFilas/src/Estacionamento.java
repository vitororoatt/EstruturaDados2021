public class Estacionamento <T> {
    private T[] alameda;
    private int ultimo;
    private int primeiro;
    private int quantidade;
    private final int capacidade = 10;

    public Estacionamento(){
        this.alameda = (T[]) new Object [10]; // casting do tipo generico para T
        this.ultimo = 0;
        this.primeiro = 0;
        this.quantidade = 0;
    }

    public boolean estaVazio() {
		return this.quantidade == 0;
	}
	public boolean estaCheio() {
		return this.quantidade == this.capacidade;
	}

	private int proxima (int posicao) {
		return (posicao + 1) % this.capacidade;
	} 
	private int anterior (int posicao) {
		return (posicao - 1 + this.capacidade) % this.capacidade;
	}

    public void adicionar (T carro) {
		this.alameda[this.ultimo] = carro;
        this.ultimo	= proxima(this.ultimo);
        this.quantidade++;
	}
	public T remover (int posicaoCarro) {
		T quemSai = this.alameda[posicaoCarro];
		this.primeiro = proxima(posicaoCarro);
		this.ultimo = anterior(posicaoCarro);
		return quemSai;
	}
    public T remover () {
		T quemSai = this.alameda[this.primeiro];
        this.primeiro = proxima(this.primeiro);
        this.quantidade--;
        return quemSai;
	}

    public T primeiro () {
		return this.alameda[this.primeiro];
	}
	public int tamanho () {
		return this.quantidade;
	}
	public T ultimo () {
		return this.alameda[anterior(this.ultimo)];
	}

	@Override
	public String toString(){
		String s = "Estacionamento: ";
		if(estaVazio()){
			s = s + "Esta Vazio";
		}
		else{
			int i = this.primeiro;
			do{
				s = s + this.alameda[i] + " | ";
				i = proxima(i);
			}while(i != this.ultimo);
		}
		return s;
	}

	
}