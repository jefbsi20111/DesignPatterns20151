package builder;

public class DirectorConsessionaria {
	protected BuilderCarro montadora;
	
	public DirectorConsessionaria(BuilderCarro montadora){
		this.montadora = montadora;
	}
	
	public void construirCarro(){
		montadora.buildPreco();
		montadora.buildAnoDeFabricacao();
		montadora.buildDscMotor();
		montadora.buildModelo();
		montadora.buildMontadora();
	}
	
	public ProdutoCarro getCarro(){
		return montadora.getCarro();
	}
}
