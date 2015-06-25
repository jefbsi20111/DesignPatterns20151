package builder;

public class BuilderFiat extends BuilderCarro{

	@Override
	public void buildPreco() {
		carro.preco = 25000;		
	}

	@Override
	public void buildDscMotor() {
		carro.dscMotor = "1.4";		
	}

	@Override
	public void buildAnoDeFabricacao() {
		carro.anoDeFabricacao = 2011;
	}

	@Override
	public void buildModelo() {
		carro.modelo = "Punto"	;
	}

	@Override
	public void buildMontadora() {
		carro.montadora = "Fiat";	
	}

}
