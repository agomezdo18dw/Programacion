package Coche;

public class Coche {
	
	private String marca;
	private String color;
	private double km;
	
	public Coche (String m, String c, double kilometros) {
		marca = m;
		color = c;
		km = kilometros;
	}
	
	public void AñadirKm (double km_de_mas) {
		km = km + km_de_mas;
	}
	
	public double ObtenerKm () {
		return km;
	}
	
	public String ObtenerColor () {
		return color;
	}

}
