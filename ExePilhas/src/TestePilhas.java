import java.util.Random;

public class TestePilhas {
    public static void main(String[] args) {
        Pilhas PilhaForte = new Pilhas();
        Random gerador = new Random();

        for(int i = 0; i < 10; i++){
            PilhaForte.push(gerador.nextInt(10));
        }

        System.out.println(PilhaForte);
        System.out.println(PilhaForte.empilhaForte());

        for(int i = 0; i < 10; i++){
            PilhaForte.pull();
        }

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

        System.out.println(PilhaForte);
        System.out.println(PilhaForte.empilhaForte());
    }
}
