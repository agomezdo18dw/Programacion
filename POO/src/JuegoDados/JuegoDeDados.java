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
        if (dado1.retornarValor() == dado2.retornarValor() && dado1.retornarValor() == dado3.retornarValor()) {
        	suma =+ 10;
        }
        	else { 
        		System.out.println("Perdió");
        	}        
        System.out.println(suma);
    }
}