package builder;

public class Cliente {

	public static void main(String[] args) {
		DirectorConsessionaria consessioanaria = new DirectorConsessionaria(new BuilderFiat());
		
		consessioanaria.construirCarro();
		ProdutoCarro carro = consessioanaria.getCarro();
		
		System.out.println("------------");
		System.out.println("Montadora: "+carro.montadora+"\nCarro: "+carro.modelo +"\nAno: "
		+carro.anoDeFabricacao + "\nMotor: "+carro.dscMotor+"\nPreço: "+carro.preco);
		System.out.println("------------");
		
		consessioanaria = new DirectorConsessionaria(new BuilderFord());
		consessioanaria.construirCarro();
		carro = consessioanaria.getCarro();
		
		System.out.println("------------");
		System.out.println("Montadora: "+carro.montadora+"\nCarro: "+carro.modelo +"\nAno: "
		+carro.anoDeFabricacao + "\nMotor: "+carro.dscMotor+"\nPreço: "+carro.preco);
		System.out.println("------------");
		
		
		consessioanaria = new DirectorConsessionaria(new BuilderHonda());
		consessioanaria.construirCarro();
		carro = consessioanaria.getCarro();
		
		System.out.println("------------");
		System.out.println("Montadora: "+carro.montadora+"\nCarro: "+carro.modelo +"\nAno: "
		+carro.anoDeFabricacao + "\nMotor: "+carro.dscMotor+"\nPreço: "+carro.preco);
		System.out.println("------------");

	}

}
