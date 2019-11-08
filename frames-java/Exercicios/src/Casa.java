import java.util.ArrayList;

public class Casa {
	
	private String cor;
	private ArrayList<Porta> portas;
	
	public Casa(String cor, ArrayList<Porta> portas) {
		this.cor = cor;
		this.portas = portas;
	}
	
	public void pinta(String cor) {
		this.cor = cor;
	}
	
	public int quantasPortasEstaoAbertas() {
		int quantidade = 0;
		for(int i = 0; i < portas.size(); i++) {
			if(portas.get(i).estaAberta()) {
				quantidade++;
			}
		}
		return quantidade;
	}
	
	
	
	

}