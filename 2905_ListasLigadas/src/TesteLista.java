
public class TesteLista {
	public static void main(String[] args) {
		ListaLigadaComUltimo ll = new ListaLigadaComUltimo();
		System.out.println(11);
		ll.insereInicio(10);
		ll.insereInicio(20);
		ll.insereInicio(30);
		System.out.println(ll);
		
		if(!ll.listaVazia()) {
			System.out.println(ll.removeInicio() + " foi removido do inicio");
			System.out.println(ll);
		}
		
		ll.insereFim(100);
		ll.insereFim(200);
		ll.insereFim(300);
		System.out.println(ll);
		
		if(!ll.listaVazia()) {
			System.out.println(ll.removeFim() + " foi removido do fim");
			System.out.println(ll);
			}
	
	}
}
