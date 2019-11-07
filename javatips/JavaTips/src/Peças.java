
public class Peças {
	
	private int codigo;
	private int quantidade;
	private double valor;
	
	public Peças(int codigo, int quantidade, double valor) {
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
}
