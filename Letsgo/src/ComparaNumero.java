
public class ComparaNumero {

	
	public void comparar(int numeroA, int numeroB) {
		String mensagem = "";
		if(numeroA > numeroB) {
			mensagem += " O numero " + numeroA + " � maior que o numero " + numeroB;
		}else if(numeroA < numeroB){
			mensagem += " O numero " + numeroB + " � maior que o numero " + numeroA;
		}else {
			mensagem += "Os numeros s�o iguais!";
		}
		
		System.out.println(mensagem);
	}
	
	
	public static void main(String[] args) {
		
		ComparaNumero comparar = new ComparaNumero();
		comparar.comparar(29, 30);
	}
}
