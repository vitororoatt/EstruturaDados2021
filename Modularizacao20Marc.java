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
    
    static void vetorOrganizado(){
        int i, v[] = new int[50];

        for(i = 0; i < 50; i++){
            v[i] = 101 + i;
        }

        for(i = 0; i < 50; i++){
            System.out.println("Posicao " + (i+1) + " - Valor " + (v[i]));
        }
    }

    static void maiorNumero(){
        double num1, num2;
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite o primeiro numero - ");
        num1 = entrada.nextDouble();

        System.out.printf("Digite o segundo numero - ");
        num2 = entrada.nextDouble();

        if(num1 > num2){
            System.out.printf("O numero %.2f foi o maior digitado", num1);
        }
        else{
            System.out.printf("O numero %.2f foi o maior digitado", num2);
        }
    }
    
    static void calcularMedia(double [] v, char tipoMedia){
        double mediaTotal = 0;
        if(tipoMedia == 'p'){
            mediaTotal = ((v[0] * 5) + (v[1] * 3) + (v[2] * 2)) / 10;
            System.out.printf("Nota final (Media Aritmetica) - %.2f", mediaTotal);
        }
        else if(tipoMedia == 'a'){
            mediaTotal = (v[0] + v[1] + v[2]) / 3;
            System.out.printf("Nota final (Media Aritmetica) - %.2f", mediaTotal);
        }
        else{
            System.out.print("Tipo de Media nao reconhecido");
        }
    }

    static void somaInteiro(){
        int total = 0;
        String inteiro;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor inteiro maior que 0");
        inteiro = entrada.nextLine();

        String numSeparado[] = inteiro.split("");

        for(int i = 0; i < numSeparado.length; i++) {
            total = total + Integer.parseInt(numSeparado[i]);	
        }

        System.out.println("Algarismos somados = " + total);
    }

    public static void main(String[] args) {
        int opc, i;
        char tipoMedia;
        double v[] = new double[3];
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.print("\n\nDigite a opcao desejada, onde:\n1 - Calcular Media\n2 - Vetor Organizado\n3 - Maior Valor\n4 - Media Ponderada/Aritmetica\n5 - Soma de Algarismos\n6 - Sair\nOpcao desejada - ");
            opc = entrada.nextInt();

            switch(opc){
                case 1:
                    calculaMedia();
                    break;

                case 2:
                    vetorOrganizado(); 
                    break;

                case 3:
                    maiorNumero();
                    break;
                
                case 4:
                    for(i = 0; i < v.length; i++){
                        System.out.println("Digite a nota " + (i + 1));
                        v[i] = entrada.nextDouble();
                    }
                    System.out.println("Digite P para Media Ponderada e A para Media Aritmetica");
                    entrada.nextLine();
                    tipoMedia = entrada.nextLine().toLowerCase().charAt(0);

                    calcularMedia(v, tipoMedia);
                    break;
                
                case 5:
                    somaInteiro();
                    break;

            }
        } while(opc != 6);

    }
}