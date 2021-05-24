//exercício 1
public class Pilhas {
	private int dados[];
	private int topo;
	private int capacidade;
    private int base;
	
	public Pilhas () {
		this(10);
	}	
	public Pilhas (int capacidade) {
		this.dados = new int[capacidade];
		this.topo = 0;
        this.base = 0;
		this.capacidade = capacidade;
	}

    public String empilhaForte(){
        for(int i = 0; i < this.topo - 1; i++){
            if(this.dados[i] < this.dados[i+1]){
                return "Essa pilha nao e forte";
            }
        }
        return "Essa pilha e forte";
    }
    public int desempilhaDeBaixo(){
        return this.dados[++base];
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
		return this.topo - this.base; // tamanho é a diferençaa entre Topo e Base
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
			for( int i=this.topo-1; i>=this.base; i--) { // I vai de base a topo
				sPilha = sPilha + this.dados[i]+ " ";
			}
		}
		sPilha = sPilha + "\n";
		return sPilha;
	}
	
}



