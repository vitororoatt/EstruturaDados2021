public class Lampada{
    private String tipo = "Ola";
    private int tensao;
    private int potencia;
    private boolean status = true;
    
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

    void acender(){
        if(this.status){
            System.out.print("A lampadas selecionada ja esta acessa");
        }
        else{
            this.status = true;
            System.out.print("A lampada selecionada foi acessa");
        }
    }
    
}