package abstractFactory2;

public class EstatutariosFactory implements Factory {

	public TecnicoDoscente criarTecnicoDoscente() {
		return new Doscente();
	}

	public TecnicoAdmin criarTecnicoAdmin() {
		return new TecnicoAdministrativo();
	}

}
