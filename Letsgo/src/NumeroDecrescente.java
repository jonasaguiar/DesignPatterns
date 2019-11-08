
public class NumeroDecrescente {

	
	public void atezero(int numero) {
		for(int i = numero; i >= 0; i-- ) {
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		
		NumeroDecrescente ndecrescente = new NumeroDecrescente();
		ndecrescente.atezero(10);
		
	}
	
	
}
