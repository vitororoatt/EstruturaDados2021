public class PilhaBinaria {
    private int dados[];
	private int topo;
	private int capacidade;

	public PilhaBinaria (int decimal) {
        this.topo = 0;
        int aux = decimal;
        int capacidade = 0, resto;
        do{
            aux = aux / 2;
            capacidade++;
        }while(aux >= 1);
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        aux = decimal;
        do{
            resto = (int) aux % 2;
            push(resto);
            aux = (int) aux / 2;
        }while(aux > 1);
        push(1);
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
