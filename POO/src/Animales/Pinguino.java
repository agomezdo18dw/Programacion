package Animales;

public class Pinguino extends Ave {

	  public Pinguino() {}

	  public Pinguino(Sexo s) {
	    super(s);
	  }

	  public void vuela() {
	    System.out.println("Soy un ping�ino, no puedo volar");
	  }

	  public void programa() {
	    System.out.println("Soy un ping�ino programador, estoy programando en Java");
	  }

	  public void nada() {
	    System.out.println("Estoy nadando");
	  }
	}