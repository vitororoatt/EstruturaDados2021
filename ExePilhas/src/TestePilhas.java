import java.util.Random;

public class TestePilhas {
    public static void main(String[] args) {
        Pilhas PilhaForte = new Pilhas();
        Random gerador = new Random();

        for(int i = 0; i < 10; i++){ // preenchimento randomico
            PilhaForte.push(gerador.nextInt(10));
        } 

        System.out.println(PilhaForte); // mostra a pilha
        System.out.println(PilhaForte.empilhaForte()); // verifica se é forte

        for(int i = 0; i < 10; i++){ // esvazia a pilha
            PilhaForte.pull();
        }

        // preenche a pilha para testar o FORTE
        PilhaForte.push(10);
        PilhaForte.push(9);
        PilhaForte.push(8);
        PilhaForte.push(7);
        PilhaForte.push(6);
        PilhaForte.push(5);
        PilhaForte.push(4);
        PilhaForte.push(3);
        PilhaForte.push(2);
        PilhaForte.push(1);
        System.out.println(PilhaForte); // Mostra que a pilha é forte
        System.out.println(PilhaForte.empilhaForte());

    }
}
