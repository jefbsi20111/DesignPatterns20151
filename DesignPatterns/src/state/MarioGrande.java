package state;

public class MarioGrande implements MarioState {

	public MarioState pegarCogumelo() {
		System.out.println("Mario Ganhou 1000pt");
		return this;
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
		System.out.println("Mario Pequeno");
		return new MarioPequeno();
	}

}
