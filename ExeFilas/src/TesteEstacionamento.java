import java.util.Random;

public class TesteEstacionamento {
    public static void main(String[] args) {
        Estacionamento estacBashemin = new Estacionamento();
        Random gerador = new Random();

			/*if (gerador.nextInt(2) == 0) {
                System.out.println("Um carro chegou!\n");
				if (estacBashemin.estaCheio()) {
					System.out.println("Infelizmente o estacionamento está cheio!\n");
				}
                else{
                    estacBashemin.adicionar(new Carro(gerador.nextInt(10)));
                    System.out.println("Carro de " + estacBashemin.ultimo() + " estacionado!\n\n");
                }
			}
			else {
				if (!estacBashemin.estaVazio()) { // tirar carro
					System.out.println("");
				}
				else{
					System.out.println(estacBashemin);
				}
			}*/
    }
}
