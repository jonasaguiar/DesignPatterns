
public class MaiorNumero {

	
	public String maiorQueOutro(int numero1, int numero2) {
		String mensagem;
		if(numero1 >= numero2) {
			 mensagem = "O numero " + numero1 + " é o maior!";
		}else {
			mensagem = "O numero " + numero2 + " é o maior!";
		}
		
		return mensagem;
	}
	
	public static void main(String[] args) {
		
		MaiorNumero quale = new MaiorNumero();
		System.out.println(quale.maiorQueOutro(17, 13));
		
	}
	
}
