package facade;

public class Cliente {

	public static void main(String[] args) {
		System.out.println("##### Configurando subsistemas #####");
		Facade facade = new Facade();
		facade.inicializarSubsistemas();
		
		System.out.println("##### Utilizando subsistemas #####");
		facade.reproduzirAudio("We are the champions.mp3");
		facade.reproduzirVideo("Copa 2002.mp4");
		facade.lerInput();

	}

}
