import javax.swing.JOptionPane;

public class TestePilha {
	public static void main (String [] args) {
		PilhaVetor pv1 = new PilhaVetor();
		JOptionPane.showMessageDialog(null, pv1);
		pv1.push(10);
		pv1.push(20);
		System.out.println("pv1");
		
		int c = Integer.parseInt(JOptionPane.showInputDialog("digite a capacidade da pilha "));
		
		PilhaVetor pv2 = new PilhaVetor(c);
		pv2.push(3);
		pv2.push(5);
		pv2.push(7);
		System.out.println(pv2);
		System.out.println(pv2.pull() + " foi desempilhado");
		System.out.println(pv2);
	}

}
