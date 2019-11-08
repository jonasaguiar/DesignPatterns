
public class SomaImpar {
	
	
	public void somando() {
		int soma = 0;
		int multiplicacao = 0;
		for(int i=0; i <30; i++) {
			if(i % 2 == 0) {
				multiplicacao += i;
			}else {
				soma += i;
			}
		}
		System.out.println("A soma é: " + soma);
		System.out.println();
		System.out.println("A multiplicação é: " + multiplicacao);
		
	}
	
	public static void main(String[] args) {
		
		SomaImpar soma = new SomaImpar();
		soma.somando();
	}
	

}
