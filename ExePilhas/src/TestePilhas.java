public class TestePilhas {
    public static void main(String[] args) {
        Pilhas PilhaForte = new Pilhas();

        PilhaForte.push(10);
        PilhaForte.push(9);
        PilhaForte.push(8);

        System.out.println(PilhaForte);
        System.out.println(PilhaForte.empilhaForte());
        System.out.println(PilhaForte);
    }
}
