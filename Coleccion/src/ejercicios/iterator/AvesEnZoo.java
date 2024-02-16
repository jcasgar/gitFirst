package ejercicios.iterator;

public class AvesEnZoo {

	public int numeroAves, numeroMachos, numeroHembras;
	public String tipoDeAve;

	public AvesEnZoo(String tipoDeAve, int numeroAves, int numeroMachos, int numeroHembras) {
		this.numeroAves = numeroAves;
		this.numeroMachos = numeroMachos;
		this.numeroHembras = numeroHembras;
		this.tipoDeAve = tipoDeAve;

	}

	public void setTipoDeAve(String tipoDeAve) {
		this.tipoDeAve = tipoDeAve;
	}

	public void setnumeroAves(int numeroAves) {
		this.numeroAves = numeroAves;
	}

	public void setnumeroMachos(int numeroMachos) {
		this.numeroMachos = numeroMachos;
	}

	public void setnumeroHembras(int numeroHembras) {
		this.numeroHembras = numeroHembras;
	}

	public String getTipoDeAve() {
		return tipoDeAve;
	}

	public int getnumeroAves() {
		return numeroAves;
	}

	public int getnumeroMachos() {
		return numeroMachos;
	}

	public int getnumeroHembras() {
		return numeroHembras;
	}

	@Override
	public String toString() {
		return tipoDeAve + "    " + numeroAves + "    " + numeroMachos + "    " + numeroHembras;
	}
}