import java.util.Random;

public class TestandoLampadas {

    public static void main(String[] args) {
        Lampada lamp1 = new Lampada();

        Random random = new Random();
        boolean value = random.nextBoolean();
        System.out.println(value);

        System.out.println("Status = " + lamp1.getStatus());

    }
}