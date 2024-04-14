package ar.edu.unq.po2.tp2;

public class DesgloceConceptos {
	
	private String concepto;
	private float monto;
	
	public String getConcepto() {
		return concepto;
	}
	
	
	public float getMonto() {
		return monto;
	}
	  
	public DesgloceConceptos (String concepto, float monto) {
		   this.concepto = concepto;
		   this.monto = monto;
	  }
}
