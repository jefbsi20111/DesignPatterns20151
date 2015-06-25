package strategy;

public class Funcionario {
	public static final int DEV = 1;
	public static final int Manager = 2;
	public static final int DBA = 3;
	protected int cargo;
	protected double salarioBase;
	protected CalculaImposto estrategiaDeCalculo;
	
	public Funcionario(int cargo,double salarioBase){
		this.salarioBase = salarioBase;
		
		switch(cargo){
		case DEV:
			estrategiaDeCalculo = new CalculoImposto15ou10();
			cargo = DEV; break;
		case Manager:
			estrategiaDeCalculo = new CalculoImposto20ou15();
			cargo = Manager;break;
		case DBA:
			estrategiaDeCalculo = new CalculoImposto15ou10();
			cargo = DEV;break;
		default:
			throw new RuntimeException("Cargo não encontrado :/");
		
		}
	}
	
	public double calcularSalarioComImposto(){
		return estrategiaDeCalculo.calculaSalarioComImposto(this);
	}
	
	
	public int getCargo() {
		return cargo;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setCargo(int cargo) {
		this.cargo = cargo;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
}
