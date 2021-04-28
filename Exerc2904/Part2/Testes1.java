public class Testes1 {

    public static void main(String[] args) {

        byte a = 40;
        System.out.println(a);

        byte b = 50;
        System.out.println(b);

        byte c = 100;
        System.out.println(c);

        int d = a * b / c; // exercicio D - Vai Funcionar
        System.out.println(d);

        //byte e = a * b / c; // exercicio E - ERRO!
        //System.out.println(e);

        byte e = 50;
        byte f = e * 6;

        System.out.println(f);
        /*Não. Para o código funcionar seria
        necessário fazer a conversão de int para byte, transformando
        a linha “g.” em: byte f = (byte)(e*6). Mesmo assim, o valor
        que resultaria não seria 300, uma vez que o tamanho máximo
        do tipo byte é de 8 bits, ou 2⁷-1 (127).*/


        

    }

}