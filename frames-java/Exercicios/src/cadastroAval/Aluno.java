package cadastroAval;

public class Aluno {

	CarteiraDeEstudante carteiraDeEstudante;
	String relatorioAval;
	
	
	public Aluno(String nome, String nomedoCurso, String nomedaFaculdade, double prova1, double prova2, double trabalho1, double trabalho2, double trabalho3, double trabalho4) {
		Avaliacao aval = new Avaliacao(prova1, prova2, trabalho1, trabalho2, trabalho3, trabalho4);
		this.carteiraDeEstudante = new CarteiraDeEstudante(nome, nomedoCurso, nomedaFaculdade);
		this.relatorioAval = aval.relatorio();
	}
	
	public String getRelatorioAval() {
		return relatorioAval;
	}
	
	@Override
	public String toString() {
		String mensagem = carteiraDeEstudante + " E tendo como relatório de notas: " + relatorioAval;
		return mensagem;
	}
	
	
	
}
