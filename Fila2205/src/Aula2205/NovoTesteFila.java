package Aula2205;

import java.util.Random;

public class NovoTesteFila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fila f = new Fila(8);
		Random gerador = new Random();
		do {
			if (gerador.nextInt(2) == 0) {
				if (!f.estaCheia()) f.insere(gerador.nextInt(10));
			}
			else {
				if(!f.estaVazia()) {
					System.out.println(f.remove() + " foi atendido");
				}
			}
			System.out.println(f.stringVetor() + " | " + f);
		} while (!f.estaVazia());
	}
}
