package abstractFactory;

public class FiatFactory implements Factory {

	public CarroPopular criarCarroPopular() {
		return new Palio();
	}

	public CarroSedan criarCarroSedan() {
		// TODO Auto-generated method stub
		return new Siena();
	}

}
