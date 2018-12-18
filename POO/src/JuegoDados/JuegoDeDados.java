package JuegoDados;

public class JuegoDeDados {
	
	private Dado dado1,dado2,dado3;
	private int suma;
    
    public JuegoDeDados() {
        dado1=new Dado();
        dado2=new Dado();
        dado3=new Dado();        	
    }
    
    public void jugar() {
        dado1.tirar();
        dado1.imprimir();
        dado1.sumaPuntos();
        dado2.tirar();
        dado2.imprimir();
        dado2.sumaPuntos();
        dado3.tirar();
        dado3.imprimir();
        dado3.sumaPuntos();
        suma = dado1.retornarValor() + dado2.retornarValor() + dado3.retornarValor();
        System.out.println("La suma del resultado es: " + suma);
        if (dado1.retornarValor() == dado2.retornarValor() && dado1.retornarValor() == dado3.retornarValor()) {
        	suma = suma + 10;
        	 System.out.println("El jugador ha sacado un trio, se suman 10 puntos");
        	 System.out.println("El resultado final es: " + suma);
        }
        else if (dado1.retornarValor() == dado2.retornarValor() || dado1.retornarValor() == dado3.retornarValor() || dado2.retornarValor() == dado3.retornarValor()) {
        	suma = suma + 5;
        	System.out.println("El jugador ha sacado una pareja, se suman 5 puntos");
        	System.out.println("El resultado final es: " + suma);
        }
        System.out.println();
    }
    public int resultado() {
    	int resultado = 0;
    	return resultado = suma;
    }

	
    	
}