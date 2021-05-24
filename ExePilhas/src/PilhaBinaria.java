public class PilhaBinaria {
    private int dados[];
	private int topo;
	private int capacidade;
	private int decimal;

	public PilhaBinaria (int decimal) {
        this.topo = 0;
		this.decimal = decimal;
        int aux = decimal;
        int capacidade = 0, resto;
        do{
			// contar quantas vezes o numero decimal é divisivel por 2
            aux = aux / 2;
            capacidade++;
        }while(aux >= 1);
        this.capacidade = capacidade;
        this.dados = new int[capacidade]; // crio o vetor com 'capacidade'
        aux = decimal;
        do{
			// faz a operacao de resto para obter os numeros binarios
            resto = (int) aux % 2;
            push(resto); // armazena o resto (1 ou 0) no vetor binario
            aux = (int) aux / 2; // divide o numero decimal por 2 para o proximo laÃ§o
        }while(aux > 1);
        push(aux); // armazena o digito final (sobra de aux)
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
			sPilha = sPilha + "Capacidade: " + this.capacidade + " Tamanho: " + this.tamanho() + "\n" + "Decimal: " + this.decimal + "\n" + "Binario: ";
			for( int i=this.topo-1; i>=0; i--) {
				sPilha = sPilha + this.dados[i]+ " ";
			}
		}
		sPilha = sPilha + "\n";
		return sPilha;
	}
}
