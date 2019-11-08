package cadastroAval;

public class Avaliacao {
	
	private double prova1;
	private double prova2;
	private double trabalho1;
	private double trabalho2;
	private double trabalho3;
	private double trabalho4;
	
	public Avaliacao(double prova1, double prova2, double trabalho1, double trabalho2, double trabalho3, double trabalho4) {
		this.prova1 = prova1;
		this.prova2 = prova2;
		this.trabalho1 = trabalho1;
		this.trabalho2 = trabalho2;
		this.trabalho3 = trabalho3;
		this.trabalho4 = trabalho4;
	}
	
	public String relatorio() {
		String mensagem = "";
		double nota = 0.0;
		String situacao = "";
		nota =+ ((prova1+prova2)/2*0.5 ) + ((trabalho1 + trabalho2 + trabalho3 + trabalho4)/4*0.5);
		if(nota > 7.0) {
			situacao = "Aprovado";
		}else if(nota < 4.0) {
			situacao = "Reprovado";
		}else {
			situacao = "na Final";
		}
		mensagem = "A média por enquanto é " + nota + ", e tendo como situação atual " + situacao + "."; 
		return mensagem;
		
	}
	

	
	
}
