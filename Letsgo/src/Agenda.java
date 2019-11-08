
public class Agenda {

	Contato[] contatos;
	
	public Agenda() {
	
		this.contatos = new Contato[10];
	}
	
	public void adicionarContato(Contato contato) {
		
		for(int i = 0; i < contatos.length; i++) {
			if(contatos[i] == null) {
				contatos[i] = contato;
			}
		}
	}
	
	public Contato buscarContato(String nome) {
		for(int i =0; i<contatos.length; i++) {
			if(contatos[i].getNome().equals(nome)) {
				return contatos[i];
			}
		}
		return null;

	}
	
	public static void main(String[] args) {
		
		Contato contato = new Contato("jonas", "jonas@eu.com");
		Agenda agenda = new Agenda();
		
		agenda.adicionarContato(contato);
		System.out.println(agenda.buscarContato("jonas"));
		
		
	}
	
	
}
