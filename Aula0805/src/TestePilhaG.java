
public class TestePilhaG {
	public static void main (String[] args) {
		PilhaVetorG<Carta> pilhaCartas = new PilhaVetorG<Carta>();
		
		PilhaVetorG<Integer> pilhaInteiros = new PilhaVetorG<>();
		
		Carta c1 = new Carta ("copas", "valete");
	
		
		pilhaCartas.push(c1);
		pilhaCartas.push(new Carta ("espadas", "ás")); //encadeamento
		
		pilhaInteiros.push(23); //autoboxing (abraçando o inteiro e está transformando em um integer)
		pilhaInteiros.push(new Integer (45)); //exemplo de como funciona o autoboxing
		
		System.out.println(pilhaCartas);
		System.out.println(pilhaInteiros);
		
				
	}
	

}
