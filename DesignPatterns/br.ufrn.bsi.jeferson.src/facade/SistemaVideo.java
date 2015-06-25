package facade;

public class SistemaVideo {
	public void configurarResolucao(){
		System.out.println("Resolução Configurado");
	}
	
	public void configurarCores(){
		System.out.println("Cores Configurado");
	}
	
	public void reproduzirVideo(String video){
		System.out.println("Reproduzindo: "+ video);
	}
}
