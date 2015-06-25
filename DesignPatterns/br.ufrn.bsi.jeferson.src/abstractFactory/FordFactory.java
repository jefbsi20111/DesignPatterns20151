package abstractFactory;

public class FordFactory implements Factory {

	public CarroPopular criarCarroPopular() {
		return new K();
	}

	public CarroSedan criarCarroSedan() {
		return new FordSedan();
	}

}
