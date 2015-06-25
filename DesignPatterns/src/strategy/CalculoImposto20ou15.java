package strategy;

public class CalculoImposto20ou15 implements CalculaImposto {

	public double calculaSalarioComImposto(Funcionario f) {
		if(f.getSalarioBase()>= 3500){
			return (f.getSalarioBase() * 0.80);
		}
		return (f.getSalarioBase() * 0.85);
	}

}
