public class Estacionamento <T>{
	// adicionar uma fila
    private Fila alameda;
    private int ultimo;
    private int primeiro;
    private int quantidade;
    private final int capacidade = 10;

    public Estacionamento(){
        this.alameda = new Fila();
    }

}