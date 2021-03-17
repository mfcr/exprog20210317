package fp.daw.examen2ev;

public class Coches extends TransportePersonas{
	private double pPorPlaza;
	public Coches() {
		super();
	}
	public Coches(String Matricula, int plazas) {
		super(Matricula,plazas);
		pPorPlaza=1.5;
	}
	public void setPPorPlaza(double precio) {this.pPorPlaza=precio;}
	public double getPPorPlaza() {return pPorPlaza;}
	public String toString() {
		return "Tipo de Vehículo: Coche, "+super.toString();
	}
	public double getPrecioAlquiler(int dias) {
		//Si se hubiese declarado plazas en transportePersonas como protected se podría acceder
		//   directamente sin usar getPlazas().
		return super.getPrecioAlquiler(dias)+pPorPlaza*getPlazas();
	}
}
