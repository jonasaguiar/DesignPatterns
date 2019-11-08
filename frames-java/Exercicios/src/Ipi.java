
public class Ipi {

	private double ipi;
	Peças peça1;
	Peças peça2;
	
	public Ipi() {
		this.ipi = 0;
	}
	
	private void atualizaIpi(int ipi) {
		this.ipi = ipi;
	}
	
	public String recebeValores(int ipi, int codigoPç1, double valorPç1, int qntdPç1,int codigoPç2, double valorPç2, int qntdPç2) {
		atualizaIpi(ipi);
		criarPçs(codigoPç1, valorPç1, qntdPç1, codigoPç2, valorPç2, qntdPç2);
		String mensagem = "O valor total a ser pago é de " + calcularIpi() + " reais!";
		return mensagem;
		
	}
	
	private void criarPçs(int codigoPç1, double valorPç1, int qntdPç1,int codigoPç2, double valorPç2, int qntdPç2) {
		peça1 = new Peças(codigoPç1, qntdPç1, valorPç1);
		peça2 = new Peças(codigoPç2, qntdPç2, valorPç2);
	}
	
	private double calcularIpi() {
		double valor = (peça1.getValor()*peça1.getQuantidade() + peça2.getValor()*peça2.getQuantidade())* (ipi/100+1);
		return valor;
	}
	
	public static void main(String[] args) {
		
		Ipi ipi = new Ipi();
		System.out.println(ipi.recebeValores(17, 011, 25, 5, 012, 20, 5));
		
		
	}
	
	
	
}
