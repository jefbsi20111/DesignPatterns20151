package abstractFactory;

public class Cliente {

	public static void main(String[] args) {
		Factory fabrica = new FiatFactory();
		CarroSedan sedan = fabrica.criarCarroSedan();
		CarroPopular popular = fabrica.criarCarroPopular();
		
		sedan.exibirinfoSedan();
		System.out.println();
		popular.exibirinfoPopular();
		System.out.println();

		System.out.println("--------------------");
		fabrica = new FordFactory();
		sedan = fabrica.criarCarroSedan();
		popular = fabrica.criarCarroPopular();
		
		sedan.exibirinfoSedan();
		System.out.println();
		popular.exibirinfoPopular();
		System.out.println();
		

	}

}
