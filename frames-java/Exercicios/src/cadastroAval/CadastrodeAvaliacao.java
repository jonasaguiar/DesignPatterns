package cadastroAval;

import java.util.ArrayList;
import java.util.Random;

/*
 * uma classe que representa uma carteira de estudante,
contendo pelo menos o nome e o número de matrícula do aluno. Você pode definir outros
membros dessa classe, como o número do curso, o nome da faculdade, etc. Dica: crie
um construtor que lhe permita preencher os dados da carteira de estudante do aluno no
ato da instanciação dos objetos dessa classe.
 * 
 * 
 * 
 */

public class CadastrodeAvaliacao {
	
	
	public static void main(String[] args) {
		
		ArrayList<Aluno> alunos = new ArrayList<>();
		Aluno aluno1 = new Aluno("Jonas Gomes Aguiar", "Ciencia da Computação", "UFCG", 0, 0, 7, 7, 7, 10);
		System.out.println(aluno1.getRelatorioAval());
		System.out.println(aluno1);
		
	}
	

}
