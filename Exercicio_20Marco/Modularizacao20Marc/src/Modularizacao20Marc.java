import java.util.Scanner;

public class Modularizacao20Marc {
    static void calculaMedia(){
        int entTamanho, i;
        double entNotas, totalNotas = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas notas serao usadas para calcular a media? ");
        entTamanho = entrada.nextInt();
        double notas[] = new double[entTamanho];

        for (i = 0; i<notas.length; i++){
            System.out.printf("Digite a nota %d - ", i+1);
            entNotas = entrada.nextDouble();
            notas[i] = entNotas;
        }

        for (i = 0; i<notas.length; i++){
            totalNotas = totalNotas + notas[i];
        }

        System.out.printf("A media do aluno eh = %.2f", totalNotas / notas.length);
    }
    
    public static void main(String[] args) {
        int opc;
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.print("\n\nDigite a opcao desejada, onde:\n1 - Calcular Media\n6 - Sair\nOpcao desejada - ");
            opc = entrada.nextInt();

            switch(opc){
                case 1:
                calculaMedia();
                break;

                case 2:
                System.out.print("Opcao 2");
            }
        } while(opc != 6);

    }
}