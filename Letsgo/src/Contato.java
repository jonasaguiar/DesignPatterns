
public class Contato {

	private String nome;
	private String email;
	
	public Contato(String nome, String email) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		String mensagem = "Nome: " + nome + ", Email: " + email;
		return mensagem;
	}
	
	
}
