package fp.daw.examen2ev;

public class Furgonetas extends TransporteMercancias{

	public Furgonetas() {
		super();
	}
	public Furgonetas(String matricula,double PMA) {
		super(matricula,PMA);
	}
	
	public String toString() {
		return "Tipo de Veh�culo: Furgoneta, "+super.toString();
	}
	//No es necesario sobreescribir en Furgonetas el m�todo getPrecioAlquiler ya que no
	//  hace cambios respecto al calculo hecho en TransporteMercancias.
	
}
