package clasePersona;

public class Persona {

	private String nombre;
	private int edad;
	private String sexo;
	private String DNI;
	private double peso;
	private double altura;
	
	public Persona(String pNombre, int pEdad, String pSexo, String pDNI, double pPeso, double pAltura) {
		nombre = pNombre;
		edad = pEdad;
		sexo = pSexo;
		DNI = pDNI;
		peso = pPeso;
		altura = pAltura;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int calcularIMC() {
		int pesoIdeal;
		int x;
		pesoIdeal = (int) (peso/Math.pow(altura, 2));
		if (pesoIdeal < 20) {
			x = -1;
		}
		else if (pesoIdeal <= 25) {
			x = 0;
		}
		else {
			x = 1;
		}
		return x;	
	}
	public static final int INFRAPESO = -1;
	public static final int PESO_IDEAL = 0;
	public static final int SOBREPESO = 1;
	
	public boolean esMayorDeEdad() {
		boolean mayorDeEdad = false;
		if (edad >= 18) {
			mayorDeEdad = true;
		}
		return mayorDeEdad;
	}
	
	@Override
    public String toString() {
        String sexo;
        if (this.sexo.equalsIgnoreCase("H")) {
            sexo = "Hombre";
        } else {
            sexo = "Mujer";
        }
        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + DNI + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n";
    }

}
