import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrograminhaMacON {

	public static void main(String[] args) {
		int numero;

		Scanner ler = new Scanner(System.in);

		System.out.println("Selecione qual programa deseja executar");
		System.out.println("Escreva 1 para m�dia");
		System.out.println("Escreva 2 para 50 inteiros");
		System.out.println("Escreva 3 para qual o maior");
		System.out.println("Escreva 4 para ponderada ou aritm�tica");
		System.out.println("Escreva 5 para soma dos algarismos");

		numero = ler.nextInt();

		if (numero == 1) {
			ArrayList<Double> notas = new ArrayList();

			int loop = 1;
			try {
				while (loop == 1) {
					System.out.println("Digite [1] para adicionar uma nota:");
					System.out.println("Digite [2] para ver a m�dia das notas e sair do programa:");

					int option = ler.nextInt();

					switch (option) {
					case 1:

						System.out.println("Entre com a nota para armazena-la: ");

						Double nota = ler.nextDouble();
						notas.add(nota);

						break;

					case 2:
						double media = 0;
						for (int i = 0; i < notas.size(); i++) {
							media = media + notas.get(i) / notas.size();
							System.out.println("As notas foram: " + notas.get(i));

						}

						System.out.println("A m�dia das notas �: " + media);

						System.out.println("Programa Encerrado.");
						loop++;
						break;
					}

				}
			} catch (InputMismatchException ex) {
				System.out.println("Insira pontos flutuantes utilizando virgula!");
			}

		}
		
		if(numero == 2) {
			int vetor[] = new int[50];
			int posicao = 0;
			
				for (int i = 101; i<=150; i++) {
					vetor[posicao] = i;
					posicao++;
					System.out.println("O valor do vetor �: " + i + " e sua posi��o �" + posicao);
				}
		}
		
		if(numero == 3) {
			try {
				System.out.println("Insira o primeiro n�mero a ser comparado: ");
				double numero1 = ler.nextDouble();
				System.out.println("Insira o segundo n�mero a ser comparado: ");
				double numero2 = ler.nextDouble();
				
				if(numero1 > numero2) {
					System.out.println("O maior n�mero �: " + numero1);
				}
				else if(numero2 > numero1) {
					System.out.println("O maior n�mero �:" + numero2);
				}
				else {
					System.out.println("Os n�meros s�o iguais");
				}
			}
			catch(InputMismatchException ex) {
				System.out.println("Insira pontos flutuantes utilizando virgula!");
			}
			
		}
		
		if(numero == 4) {
			try {
				System.out.println("Insira a primeira nota do aluno");
				double nota1 = ler.nextDouble();
				System.out.println("Insira a segunda nota do aluno");
				double nota2 = ler.nextDouble();
				System.out.println("Insira a terceira nota do aluno");
				double nota3 = ler.nextDouble();
				System.out.println("Insira (a) para m�dia simples e (b) para m�dia ponderada");
				String letra = ler.next();
				if(letra.equalsIgnoreCase("a")) {
					double media = (nota1 + nota2 + nota3) / 3;
					System.out.println(media);
				}
				else if(letra.equalsIgnoreCase("b")) {
					double media = ((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) / 10;
					System.out.println(media);
				}
				else {
					System.out.println("Letra errada!");
				}
			}
			catch(InputMismatchException ex) {
				System.out.println("Insira pontos flutuantes utilizando virgula!");
			}
		}
		if(numero == 5) {
			int valor = 0;
			System.out.println("Insira o n�mero de entrada");
			Integer entrada = ler.nextInt();
			String teste = entrada.toString();
			String[] teste2 = teste.split("");
			
			for(int i = 0; i < teste2.length; i++) {
				valor = valor + Integer.parseInt(teste2[i]);
			}
			System.out.println(valor);
			
		}

	}

}
