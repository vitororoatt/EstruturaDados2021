//exercicio 1
public class Pilha {
	private int dados[];
	private int topo;
	private int capacidade;
	
	public Pilha () {
		this(10);
	}	
	public Pilha (int capacidade) {
		this.dados = new int[capacidade];
		this.topo = 0;
		this.capacidade = capacidade;
	}

	// Exercicio A
    public String empilhaForte(){
        for(int i = 0; i < this.topo - 1; i++){
            if(this.dados[i] < this.dados[i+1]){
                return "Essa pilha nao é forte \n";
            }
        }
        return "Essa pilha é forte \n";
    }
	
	// Exercicio B
	public String desempilhaDeBaixo(){
		if(estaVazia()){
			return "Essa pilha esta vazia";
		}
		if(this.topo == 1){
			return "Essa pilha tem apenas um item";
		}
		this.topo--;
		int cartaRemovida = this.dados[topo-1];
		this.dados[topo-1] = this.dados[topo];
		return "" + cartaRemovida;
	}

	public boolean estaCheia() {
		return this.topo == this.capacidade;
		}
	public boolean estaVazia() {
		return this.topo == 0;
	}
	public void push (int i) {
		this.dados[this.topo++] = i;
	}
	public int pull () {
		return this.dados[--topo];
		//this.topo --;
		//return this.dados[this.topo];
	}
	public int tamanho() {
		return this.topo;
	}
	//consulta do elemento do topo da pilha
	public int consultaTopo() {
		return this.dados[this.topo-1];
	}
	@Override
	public String toString() {
		String sPilha = "Pilha: ";
		if (this.estaVazia()) {
			sPilha = sPilha + "esta vazia";
		}
		else {
			sPilha = sPilha + "Capacidade: " + this.capacidade + " Tamanho: " + this.tamanho() + "\n";
			for( int i=this.topo-1; i>=0; i--) {
				sPilha = sPilha + this.dados[i]+ " ";
			}
		}
		sPilha = sPilha + "\n";
		return sPilha;
	}
	
}



