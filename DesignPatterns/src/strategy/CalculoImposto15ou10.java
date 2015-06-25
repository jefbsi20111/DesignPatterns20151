package strategy;

public class CalculoImposto15ou10 implements CalculaImposto {

	public double calculaSalarioComImposto(Funcionario f) {
		if(f.getSalarioBase()>= 2000){
			return (f.getSalarioBase() * 0.85);
		}
		return (f.getSalarioBase() * 0.9);
	}

}
