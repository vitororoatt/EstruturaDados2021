import java.util.Random;

import javax.swing.JOptionPane;

public class Recursao {

	// Exercicio 1
	public static int somaDosNumeros (int n){
		if(n == 0){
			return 0;
		}
		return n + somaDosNumeros(n-1);
	}

	// Exercicio 2
	public static int numPares (int n){
        if(n == 0){ // Se o numero for igual a 0
            return 0; // Retorna 0
		}
        if(n % 2 == 0){ // Se o numero for divisivel por 2
            System.out.println(n); // Imprime o numero
        }
        return numPares(n-1); // Recursao - verificando o numero anterior
    }

	// Exercicio 3
	public static int tribonacci (int n){
		if(n == 0 || n == 1){
			return 0;
		}
		if(n == 2){
			return 1;
		}
		return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
	}

	public static void main(String[] args) {
		Random gerado = new Random();

		System.out.println("Teste da soma dos numeros de 1 a N");
		System.out.println(somaDosNumeros(10)); // n = 10

		System.out.println("Teste dos numeros pares, de 0 a N");
		System.out.println(numPares(gerado.nextInt(10))); // n = random
		
		System.out.println("Teste da funcao Tribonacci");
		int numT = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero Tribonacci que quer imprimir"));
		System.out.println(tribonacci(numT));
	}

}
