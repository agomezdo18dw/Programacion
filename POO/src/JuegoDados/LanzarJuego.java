package JuegoDados;

public class LanzarJuego {

	public static void main(String[] args) {
		JuegoDeDados persona1=new JuegoDeDados();
		JuegoDeDados persona2=new JuegoDeDados();
        System.out.println("Persona 1:");
		persona1.jugar();
		System.out.println("Persona 2:");
        persona2.jugar();
        if (persona1.resultado() > persona2.resultado()) {
        	System.out.print("Ha ganado el jugador 1 con ");
        	System.out.print(persona1.resultado());
        	System.out.print(" puntos");
        }
        else if (persona1.resultado() < persona2.resultado()) {
        	System.out.print("Ha ganado el jugador 2 con ");
        	System.out.print(persona2.resultado());
        	System.out.print(" puntos.");
        }
        else {
        	System.out.print("Los jugadores han empatado con ");
        	System.out.print(persona1.resultado());
        	System.out.print(" puntos");
        }
	}

}
