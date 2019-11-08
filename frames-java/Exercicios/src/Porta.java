import java.util.ArrayList;

public class Porta {

	private boolean estaAberta;
	private String cor;
	private int dimensaoX;
	private int dimensaoY;
	private int dimensãoZ;
	
	public Porta(String cor, int dimensaoX, int dimensaoY, int dimensaoZ) {
		this.cor = cor;
		this.dimensaoX = dimensaoX;
		this.dimensaoY = dimensaoY;
		this.dimensãoZ = dimensaoZ;
		this.estaAberta = true;
	}
	
	public void abre() {
		this.estaAberta = true;
	}
	
	public void fecha() {
		this.estaAberta = false;
	}
	
	public void pinta(String cor) {
		this.cor = cor;
	}
	
	public boolean estaAberta() {
		return this.estaAberta;
		}
	
	public static void main(String[] args) {
		Porta porta = new Porta("Branca", 10, 20, 10);
		Porta porta2 = new Porta("Azul", 30, 5, 10);
		Porta porta3 = new Porta("Preta", 15, 12, 6);
		
		ArrayList<Porta> portas = new ArrayList<>();
		portas.add(porta);
		portas.add(porta2);
		portas.add(porta3);
		
		porta2.fecha();
		System.out.println(porta);
		
		porta.fecha();
		
		System.out.println(porta);
	
		porta.pinta("Vermelha");
		
		System.out.println(porta);
		
		Casa casa = new Casa("Amarela", portas);
		System.out.println(casa.quantasPortasEstaoAbertas());
		
	}
	
	@Override
	public String toString() {
		String abertura = "";
		if(this.estaAberta) {
			abertura = "está aberta!";
		}else {
			abertura = "está fechada!";
		}
		String mensagem = "A porta tem a cor " + cor + ", com dimensões X, Y e Z sendo respectivamente: " + dimensaoX + ", " + dimensaoY + ", " + dimensãoZ + ". E ela " + abertura; 
		return mensagem;
	}
	
}
	
	
	
	

