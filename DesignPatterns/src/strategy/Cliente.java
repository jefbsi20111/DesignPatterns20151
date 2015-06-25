package strategy;

public class Cliente {

	public static void main(String[] args) {
		Funcionario umFuncionario = new Funcionario(Funcionario.DEV,2100);
		System.out.println(umFuncionario.calcularSalarioComImposto());
		
		Funcionario outroFuncionario = new Funcionario(Funcionario.DEV,1700);
		System.out.println(outroFuncionario.calcularSalarioComImposto());
		
		Funcionario maisUmFuncionario = new Funcionario(Funcionario.Manager,5000);
		System.out.println(maisUmFuncionario.calcularSalarioComImposto());


	}

}
