package Aula2205;

public class TesteFila {
	public static void main (String[] args) {
		Fila f = new Fila();
		System.out.println(f);
		int i=1;
		while (!f.estaCheia()) {
			f.insere(i++);
			System.out.println(f);
		}
		while (!f.estaVazia()) {
			System.out.println(f.remove() + " foi atendido");
			System.out.println(f);
		}
	}
	
}
