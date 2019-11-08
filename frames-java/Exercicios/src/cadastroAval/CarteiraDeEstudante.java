package cadastroAval;

import java.util.Random;

/*
 * uma classe que representa uma carteira de estudante,
contendo pelo menos o nome e o número de matrícula do aluno. Você pode definir outros
membros dessa classe, como o número do curso, o nome da faculdade, etc. Dica: crie
um construtor que lhe permita preencher os dados da carteira de estudante do aluno no
ato da instanciação dos objetos dessa classe.
 * 
 */

public class CarteiraDeEstudante {

	private String nome;
	private int matricula;
	private String nomeDoCurso;
	private String nomeDaFaculdade;
	
	public CarteiraDeEstudante(String nome, String nomedoCurso, String nomedaFaculdade) {
		Random random = new Random();
		this.nome = nome;
		this.nomeDoCurso = nomedoCurso;
		this.nomeDaFaculdade = nomedaFaculdade;
		this.matricula = random.nextInt();
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNomeDoCurso() {
		return nomeDoCurso;
	}

	public void setNomeDoCurso(String nomeDoCurso) {
		this.nomeDoCurso = nomeDoCurso;
	}

	public String getNomeDaFaculdade() {
		return nomeDaFaculdade;
	}

	public void setNomeDaFaculdade(String nomeDaFaculdade) {
		this.nomeDaFaculdade = nomeDaFaculdade;
	}
	
	@Override
		public String toString() {
			String mensagem = "";
			mensagem = "O nome do aluno é " + this.nome + ", com a matricula " + this.matricula + ", matriculado no Curso " + this.nomeDoCurso + " na " + this.nomeDaFaculdade + ".";
			return mensagem;
		}
	
	
	
	
}
