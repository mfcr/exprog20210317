package fp.daw.examen2ev;

public class Camiones extends TransporteMercancias{
	private double suplemento;
	public Camiones() {
		super();
		suplemento=40;
	}
	public Camiones(String matricula,double PMA) {
		super(matricula,PMA);
		suplemento=40;
	}
	public double getSuplemento() {return suplemento;}
	public void setSuplemento(double suplemento) {this.suplemento=suplemento;}
	
	public String toString() {
		return "Tipo de Vehículo: Camion, "+super.toString();
	}
	
	public double getPrecioAlquiler(int dias) {
		return super.getPrecioAlquiler(dias)+suplemento;
	}

}
