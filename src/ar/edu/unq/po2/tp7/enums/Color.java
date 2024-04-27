package ar.edu.unq.po2.tp7.enums;

public enum Color {
	
	ROJO("rojo", "alto riesgo", "gris"),
	GRIS("gris", "riesgo moderado", "amarillo"),
	AMARILLO("amarillo", "bajo riesgo", "miel"),
	MIEL("miel", "bajo riesgo", "rojo");
	
	
	private final String descripcion;
    private final String nivelRiesgo;
    private final String proximoColor;
    
    
    Color(String descripcion, String nivelRiesgo, String proximoColor) {
        this.descripcion = descripcion;
        this.nivelRiesgo = nivelRiesgo;
        this.proximoColor = proximoColor;
    }
    
    
    public String getDescripcion() {
        return descripcion;
    }

    public String getNivelRiesgo() {
        return nivelRiesgo;
    }

    public Color getProximoColor() {
        return valueOf(proximoColor.toUpperCase());
    }
}
