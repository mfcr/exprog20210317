package fp.daw.examen2ev;

public abstract class TransporteMercancias extends Vehiculos{
	private double PMA_Tons;
	private double pPorPMA;
	public TransporteMercancias() {
		super();
		pPorPMA=20;
	}
	public TransporteMercancias(double PMA_Tons) {
		this.PMA_Tons=PMA_Tons;
		this.pPorPMA=20;
	}
	public TransporteMercancias(String matricula, double PMA_Tons) {
		super(matricula);
		this.PMA_Tons=PMA_Tons;
		this.pPorPMA=20;
	}
	
	public void setPPorPMA(double precio) {
		this.pPorPMA=precio; //No haríaFALTA	
	}
	public double getPPorPMA() {
		return pPorPMA;
	}
	public void setPMA_Tons(double PMA_Tons) {
		this.PMA_Tons=PMA_Tons;
	}
	public double getPMA_Tons() {
		return PMA_Tons;
	}
	public String toString() {
		return super.toString()+", PMA:"+PMA_Tons;
	}
	public double getPrecioAlquiler(int dias) {
		return super.getPrecioAlquiler(dias)+pPorPMA*PMA_Tons;
	}

}
