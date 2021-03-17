package fp.daw.examen2ev;

public abstract class Vehiculos implements Alquilable {
	private String matricula;
	private double pBase;
	public Vehiculos() {
		this.pBase=50;
	}
	
	public Vehiculos(String matricula) {
		this();
		this.matricula=matricula;
	}
	public double getPBase() {
		return pBase;
	}
	public void setPBase(double pBase) {
		this.pBase=pBase;
	}
	public String getMatricula() {
		return(matricula);
	}
	public void setMatricula(String matricula) { 
		this.matricula=matricula; 
	}
	@Override
	public String toString() {
		return "Matrícula: "+matricula;
	}
	public double getPrecioAlquiler(int dias) {
		return dias*pBase;
	}
}
