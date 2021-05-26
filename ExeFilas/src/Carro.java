public class Carro {
    private int placa;

    public Carro(int placa){ // redefinindo construtor padrão
        setPlaca(placa);
    }

    public int getPlaca() {
        return placa;
    }
    public void setPlaca(int placa) {
        this.placa = placa;
    }
}
