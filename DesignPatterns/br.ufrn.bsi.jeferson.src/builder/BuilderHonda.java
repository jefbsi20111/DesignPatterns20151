package builder;

public class BuilderHonda extends BuilderCarro{

	@Override
	public void buildPreco() {
		carro.preco = 30000;		
	}

	@Override
	public void buildDscMotor() {
		carro.dscMotor = "1.6";		
	}

	@Override
	public void buildAnoDeFabricacao() {
		carro.anoDeFabricacao = 2014;
	}

	@Override
	public void buildModelo() {
		carro.modelo = "Civic"	;
	}

	@Override
	public void buildMontadora() {
		carro.montadora = "Honda";	
	}

}
