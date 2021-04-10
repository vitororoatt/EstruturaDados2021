
public class TestePersonagem {
	
	public static void main (String[] args) {
		int i; 
		Personagem p1; //declarando
		p1 = new Personagem(); //instaciando = construindo
		System.out.println("p1: " + p1.getNome() + "\nforça: "+ p1.getForca());
		
		
		Personagem p2 = new Personagem();
		System.out.println("p2: " + p2.getNome() + "\nforça: "+ p2.getForca());
		p1.setFome (7);
		p1.setSono (5);
		
		p2.setFome (15);
		p2.setForca (-20);
		
		System.out.println("Sonos de P1:" +p1.getSono());
		System.out.println("Fome de P1: " +p1.getFome());
		
		Personagem p3 = new Personagem("Thor", 5, 10, 0);
		p3.setForca(p3.getForca()+1);
		
		Personagem p4 = new Personagem("Garfield");
		
		
	}

}
