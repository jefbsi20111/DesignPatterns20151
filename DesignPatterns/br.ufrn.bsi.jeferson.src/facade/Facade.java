package facade;

public class Facade {
	protected SistemaAudio audio;
	protected SistemaVideo video;
	protected SistemaInput input;
	
	
	public void inicializarSubsistemas(){
		audio = new SistemaAudio();
		audio.configurarCanais();
		audio.configurarFrequencia();
		audio.configurarVolume();
		
		video = new SistemaVideo();
		video.configurarResolucao();
		video.configurarCores();
		
		input = new SistemaInput();
		input.configurarTeclado();
		input.configurarJoystick();
		
		
	}
	
	public void reproduzirAudio(String str){
		audio.reproduzirAudio(str);
	}
	
	public void reproduzirVideo(String str){
		video.reproduzirVideo(str);
	}
	
	public void lerInput(){
		input.lerInput();
	}
}
