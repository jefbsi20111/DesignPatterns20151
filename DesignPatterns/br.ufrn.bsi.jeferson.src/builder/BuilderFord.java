package builder;

public class BuilderFord extends BuilderCarro{

	@Override
	public void buildPreco() {
		carro.preco = 35000;		
	}

	@Override
	public void buildDscMotor() {
		carro.dscMotor = "1.8";		
	}

	@Override
	public void buildAnoDeFabricacao() {
		carro.anoDeFabricacao = 2014;
	}

	@Override
	public void buildModelo() {
		carro.modelo = "Fodastico"	;
	}

	@Override
	public void buildMontadora() {
		carro.montadora = "Ford";	
	}

}
