package fp.daw.examen2ev;

public abstract class TransportePersonas extends Vehiculos{
	private int plazas;
	public TransportePersonas() {
		super();
	}
	public TransportePersonas(String matricula) {
		super(matricula);
	}
	public TransportePersonas(String matricula, int plazas) {
		this(matricula);
		this.plazas=plazas;
	}
	public void setPlazas(int plazas) {
		this.plazas=plazas;
	}
	public int getPlazas() {
		return plazas;
	}
	public String toString() {
		return (super.toString()+", Plazas: "+plazas);
	}

}
