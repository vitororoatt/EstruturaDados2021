//exercicio 2
import javax.swing.JOptionPane;

public class TestePilhaBinaria {
    public static void main(String[] args) {
        int decimal = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero decimal"));

        PilhaBinaria pilhaB = new PilhaBinaria(decimal);

        System.out.println(pilhaB);

        
    }
}
