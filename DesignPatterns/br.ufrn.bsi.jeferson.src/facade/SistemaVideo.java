package facade;

public class SistemaVideo {
	public void configurarResolucao(){
		System.out.println("Resolu��o Configurado");
	}
	
	public void configurarCores(){
		System.out.println("Cores Configurado");
	}
	
	public void reproduzirVideo(String video){
		System.out.println("Reproduzindo: "+ video);
	}
}
