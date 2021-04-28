public class TestandoLampadas {

    public static void main(String[] args) {
        Lampada lamp1 = new Lampada("Led", 110, 10);
        Lampada lamp2 = new Lampada("Fluorescente", 220, 40);
        Lampada lamp3 = new Lampada("Fria", 110, 20);

        System.out.println("True = Ligada / False = Desligada");
        System.out.println(lamp1);
        System.out.println(lamp2);
        System.out.println(lamp3);
    }
}