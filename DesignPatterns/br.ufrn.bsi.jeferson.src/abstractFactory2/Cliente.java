package abstractFactory2;

public class Cliente {

	public static void main(String[] args) {
		Factory fabrica = new EstatutariosFactory();
		TecnicoAdmin tecAdmin = fabrica.criarTecnicoAdmin();
		TecnicoDoscente tecDoscente = fabrica.criarTecnicoDoscente();
		
		System.out.println("--------------------");
		tecAdmin.exibirInfo();
		System.out.println("--------------------");
		tecDoscente.exibirInfo();
	}

}
