import java.util.Random;

public class Lampada{
    private String tipo;
    private int tensao;
    private int potencia;
    private boolean status;

    public Lampada(String tipo, int tensao, int potencia){
        this.tipo = tipo;
        this.tensao = tensao;
        this.potencia = potencia;

        Random random = new Random();
        boolean statusRandom = random.nextBoolean();

        this.status = statusRandom;
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
        return "Tipo: " + this.tipo + ", Tensao: " + this.tensao + ", Potencia: " + this.potencia + ", Status: " + this.Status;
    }
    
    void acender(){
        if(this.status){
            System.out.print("A lampadas selecionada ja esta acessa");
        }
        else{
            this.status = true;
            System.out.print("A lampada selecionada foi acessa");
        }
    }

    void apagar(){
        if(this.status){
            this.status = false;
            System.out.print("A lampadas selecionada foi apagada");
        }
        else{
            System.out.print("A lampada selecionada ja esta apagada");
        }
    }

    void verificarStatus(){
        if(this.status){
            System.out.println("A lampada selecionada esta acessa");
        }
        else{
            System.out.println("A lampada selecionada esta apagada");
        }
    }
    
}