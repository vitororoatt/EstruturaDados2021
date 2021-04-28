public class Teste2 {
    public static void main(String[] args) {
        
        byte b = 42;
        char c = 'a'; // NUMERO TABELA ASCII
        short s = 1024;
        int i = 50000;
        float f = 5.67f; // float deve acompanhar o F no fim do numero
        double d = 0.1234;

        System.out.println(((Object)(c+b)).getClass().getName());
        //a
        System.out.println((f * b)); // 238.14
        System.out.println(((Object)(f*b)).getClass().getName()); // FLOAT + BYTE = FLOAT
        //b
        System.out.println(i / c); // 515 - CHAR = Número da Tabela ASCII (a = 97)
        System.out.println(((Object)(i / c)).getClass().getName()); // INT + CHAR = INT
        //c
        System.out.println((f * b) + (i / c)); // 753.14 - f * b = FLOAT // i / c = INT
        System.out.println(((Object)((f * b) + (i / c))).getClass().getName()); // FLOAT + INT = FLOAT
        //d
        System.out.println(d * s); // 126.3616
        System.out.println(((Object)(d * s)).getClass().getName()); // SORT + DOUBLE = DOUBLE
        //e
        System.out.println((f * b) + (i / c) -(d * s)); // 626.7784146484375 
        System.out.println(((Object)((f * b) + (i / c) -(d * s))).getClass().getName()); // FLOAT + INT + DOUBLE = DOUBLE
    }

}
