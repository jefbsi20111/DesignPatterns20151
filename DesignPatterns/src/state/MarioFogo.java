package state;

public class MarioFogo implements MarioState {

	public MarioState pegarCogumelo() {
		System.out.println("Mario Ganhou 1000pt");
		return this;
	}

	public MarioState pegarFlor() {
		System.out.println("Mario Ganhou 1000pt");
		return this;
	}

	public MarioState pegarPena() {
		System.out.println("Mario Capa");
		return new MarioCapa();
	}

	public MarioState levarDano() {
		System.out.println("Mario grande");
		return new MarioGrande();
	}

}
