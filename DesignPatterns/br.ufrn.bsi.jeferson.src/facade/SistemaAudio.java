package facade;

public class SistemaAudio {
	public void configurarFrequencia(){
		System.out.println("Audio Configurado");
	}
	
	public void configurarVolume(){
		System.out.println("Volume Configurado");
	}
	
	public void configurarCanais(){
		System.out.println("Canais Configurados");
	}
	
	public void reproduzirAudio(String audio){
		System.out.println("Reproduzindo: "+ audio);
	}
}
