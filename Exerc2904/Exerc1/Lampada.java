import java.util.Random;

public class Lampada{
    private String tipo;
    private int tensao;
    private int potencia;
    private boolean status;

    public Lampada(String tipo, int tensao, int potencia){
        setTipo(tipo);
        setTensao(tensao);
        setPotencia(potencia);

        Random random = new Random();
        boolean statusRandom = random.nextBoolean();

        setStatus(statusRandom);
    }
    
    // getter/setter tipo
    public String getTipo() {
		return tipo;
	}
    public void setTipo(String tipo) {
		this.tipo = tipo;
	}

    // getter/setter tensao
    public int getTensao() {
		return tensao;
	}
    public void setTensao(int tensao) {
		this.tensao = tensao;
	}

    // getter/setter tensao
    public int getPotencia() {
		return potencia;
	}
    public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

    // getter/setter tensao
    public boolean getStatus() {
		return status;
	}
    public void setStatus(boolean status) {
		this.status = status;
	}

    @Override
    public String toString(){
        return "Tipo: " + this.tipo + ", Tensao: " + this.tensao + ", Potencia: " + this.potencia + ", Status: " + this.status;
    }
    
    void acender(){
        if(status){
            System.out.print("A lampadas selecionada ja esta acessa");
        }
        else{
            setStatus(true);
            System.out.print("A lampada selecionada foi acessa");
        }
    }

    void apagar(){
        if(status){
            setStatus(false);
            System.out.print("A lampadas selecionada foi apagada");
        }
        else{
            System.out.print("A lampada selecionada ja esta apagada");
        }
    }

    void verificarStatus(){
        if(status){
            System.out.println("A lampada selecionada esta acessa");
        }
        else{
            System.out.println("A lampada selecionada esta apagada");
        }
    }
    
}