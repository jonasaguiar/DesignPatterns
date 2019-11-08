
public class MediaAluno {

	int[] notas;
	
	public MediaAluno() {
		this.notas = new int[3];
	}
	
	public void adicionaNotas(int nota1, int nota2, int nota3) {
		if(testaMedia(nota1) || testaMedia(nota2) || testaMedia(nota3)) {
			System.out.println("Você inseriu uma nota com valor invalido!");
		}else {
			notas[0] = nota1;
			notas[1] = nota2;
			notas[2] = nota3;
		}
	}
	
	public int calculaMedia() {
		int media= 0;
		for(int i = 0; i < notas.length;i++) {
			media += notas[i]/ notas.length; 
		}
		return media;
	}
	
	public boolean testaMedia(int numero) {
		boolean alerta = false;
		int limiteAbaixo = 0;
		int limiteAcima = 100;
		if(numero < limiteAbaixo || numero > limiteAcima) {
			alerta = true;
		}
		return alerta;
	}
	
	public static void main(String[] args) {
		MediaAluno mediaa = new MediaAluno();
		mediaa.adicionaNotas(70, 60, 81);
		System.out.println("Sua média é " + mediaa.calculaMedia());
		
	}
	
	
}
