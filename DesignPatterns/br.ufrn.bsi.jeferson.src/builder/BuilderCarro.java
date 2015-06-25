package builder;

public abstract class BuilderCarro {
	protected ProdutoCarro carro;
	
	public BuilderCarro(){
		carro = new ProdutoCarro();
	}
	
	public abstract void buildPreco();
	 
    public abstract void buildDscMotor();
 
    public abstract void buildAnoDeFabricacao();
 
    public abstract void buildModelo();
 
    public abstract void buildMontadora();
 
    public ProdutoCarro getCarro() {
        return carro;
    }
}	
