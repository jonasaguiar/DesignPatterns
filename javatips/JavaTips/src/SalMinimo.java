
public class SalMinimo {
	
	private final double salMinimo = 788.00;
	private double salFunc;
	
	public SalMinimo() {
		this.salFunc = 0.0;
	}
	
	public String receberSalario(double salarioFunc) {
		salFunc = salarioFunc;
		String mensagem = "O Funcionário ganha " + calcularQntdSalarios() + " salários mínimos!";
		return mensagem;
		
	}
	
	private double calcularQntdSalarios() {
		return salFunc / salMinimo;
		
	}
	
	
	public static void main(String[] args) {
		
		SalMinimo salminimo = new SalMinimo();
		System.out.println(salminimo.receberSalario(15000));
		
		
	}
	
	
	

}
