package fp.daw.examen2ev;

public class Microbuses extends TransportePersonas{
	private double pPorPlazaYDia;
	public Microbuses() {
		super();
	}
	public Microbuses(String Matricula, int plazas) {
		super(Matricula,plazas);
		pPorPlazaYDia=2;
	}
	public void setPPorPlazaYDia(double precio) {this.pPorPlazaYDia=precio;}
	
	public double getPPorPlazaYDia() {return pPorPlazaYDia;}
	
	public String toString() {
		return "Tipo de Veh�culo: Microb�s, "+super.toString();
	}
	public double getPrecioAlquiler(int dias) {
		//Si se hubiese declarado plazas en transportePersonas como protected se podr�a acceder
		//   directamente sin usar getPlazas().
		return super.getPrecioAlquiler(dias)+pPorPlazaYDia*getPlazas()*dias;
	}

}
