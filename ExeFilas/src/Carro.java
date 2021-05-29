import java.util.Set;

public class Carro {
    private int placa;
    private int voltas;

    public Carro(int placa){ // redefinindo construtor padrão
        setPlaca(placa);
    }

    public int getVoltas() {
        return voltas;
    }
    public void setVoltas(int voltas) {
        this.voltas = this.voltas + voltas;
    }
    public int getPlaca() {
        return placa;
    }
    public void setPlaca(int placa) {
        this.placa = placa;
    }

    @Override
    public String toString(){
        return "Placa: " + this.placa;
    }
}
