import java.util.Scanner;

public class TesteData{

    public static void main(String[] args) {
        int dia, mes, ano; // variaveis que servirão de atributo para classe Data
        Scanner entrada = new Scanner(System.in); // instanciação da classe Scanner

        System.out.print("Defina o dia: ");
        dia = entrada.nextInt(); // alocando o valor de entrada

        System.out.print("Defina o mes: ");
        mes = entrada.nextInt();

        System.out.print("Defina o ano: ");
        ano = entrada.nextInt();

        Data dataCriada = new Data(dia, mes, ano); // instanciando Data com parametros

        System.out.println("Dia Escrito: " + dataCriada); // chamada do metodo da classe Data
        System.out.print("Dia Seguinte: ");
        dataCriada.diaSeguinte(); // chamada do metodo da classe Data
        System.out.println(); // pular linha
        System.out.print("Dia Anterior: ");
        dataCriada.diaAnterior(); // chamada do metodo da classe Data
    }
}
