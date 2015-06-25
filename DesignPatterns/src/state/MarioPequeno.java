package state;

public class MarioPequeno implements MarioState {

	public MarioState pegarCogumelo() {
		System.out.println("Mario grande");
		return new MarioGrande();
	}

	public MarioState pegarFlor() {
		System.out.println("Mario Fogo");
		return new MarioFogo();
	}

	public MarioState pegarPena() {
		System.out.println("Mario Capa");
		return new MarioCapa();
	}

	public MarioState levarDano() {
		System.out.println("Mario Morto");
		return new MarioMorto();
	}

}
