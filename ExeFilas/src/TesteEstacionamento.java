import java.util.Random;
import javax.swing.JOptionPane;

public class TesteEstacionamento {
    public static void main(String[] args) {
        Fila estacBashemin = new Fila();
		Carro carAux = new Carro(0);
        Random gerador = new Random();

		do{
			if (gerador.nextInt(2) == 0) {
				System.out.println("Um carro chegou!");
				if (estacBashemin.estaCheia()) {
					System.out.println("Infelizmente o estacionamento esta cheio!\n");
				}
				else{
					estacBashemin.insere(new Carro(gerador.nextInt(10)));
					System.out.println("Carro de " + estacBashemin.ultimo() + " estacionado!\n");
				}
			}
			else {
				if (!estacBashemin.estaVazia()) { // tirar carro
					System.out.println("\n"+estacBashemin);
					int placa = Integer.parseInt(JOptionPane.showInputDialog("Escreva a placa do carro que deseja sair"));
					while(placa != estacBashemin.primeiro().getPlaca()){ // fazer manobra com os carros que estão na frente
						carAux = estacBashemin.primeiro();
						carAux.setVoltas(1); // adicionando valor 1 as voltas no Carro classe Carro (para contar as manobras no quarteirao)
						estacBashemin.remove();
						estacBashemin.insere(carAux);
						System.out.println(estacBashemin + "<- Carro manobrado");
					}
					carAux = estacBashemin.remove();
					System.out.println("\nCarro " + carAux + " saiu do estacionamento!\nEle fez " + carAux.getVoltas() + " manobras no quarteirao antes de sair!\n");
				}
				else{
					System.out.println(estacBashemin);
				}
			}
		}while(!estacBashemin.estaVazia());
    }
}
