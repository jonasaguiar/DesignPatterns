
public class Idade {
	
	private int anos;
	private int meses;
	private int dias;
	
	private int diastotais = 0;
	
	public Idade() {
		this.anos = 0;
		this.meses = 0;
		this.dias = 0;
	}
	
	public String receberIdade(int anos, int meses, int dias) {
		this.anos = anos;
		this.meses = meses;
		this.dias = dias;
		calculandoDias();
		return imprimirDias();
		
	}
	
	private void calculandoDias() {
		diastotais = (anos* 365) + (meses*30) + dias; 
	}
	
	private String imprimirDias() {
		String mensagem = "Você já viveu " + diastotais + " dias!";
		return mensagem;
	}
	
	public static void main(String[] args) {
		
		Idade idade = new Idade();
		System.out.println(idade.receberIdade(20, 1, 5));
		
		
		
	}
	
	

}
