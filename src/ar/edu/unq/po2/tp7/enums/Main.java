package ar.edu.unq.po2.tp7.enums;

public class Main {
	
	public static void imprimirInfoColor(Color color) {
        System.out.println("Color: " + color.getDescripcion());
        System.out.println("Nivel de riesgo: " + color.getNivelRiesgo());
        System.out.println("Próximo color en el proceso de maduración: " + color.getProximoColor().getDescripcion());
    }

    public static void main(String[] args) {
        // Prueba de la funcionalidad del enumerativo y la impresión de información
        Color miColor = Color.MIEL;
        imprimirInfoColor(miColor);

        // Prueba del ciclo rotativo
        miColor = miColor.getProximoColor();
        imprimirInfoColor(miColor);

    }
}
