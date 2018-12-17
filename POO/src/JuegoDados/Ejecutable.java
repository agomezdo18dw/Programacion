package JuegoDados;

public class Ejecutable {
	
	public static void main(String[] args) {
		public class Dado 
		{
		    private int valor;
		    
		    public void tirar() 
			{
		        valor=1+(int)(Math.random()*6);
		    	}
		    
		    public void imprimir() 
			{
		        System.out.println("El valor del dado es:"+valor);
		    	}
		    
		    public int retornarValor() 
			{
		        return valor;
		    	}
		}

		//clase Dado con el valor y tres métodos públicos


		public class JuegoDeDados 
		{
		    private Dado dado1,dado2,dado3;
		    
		    public JuegoDeDados() 
			{
		        dado1=new Dado();
		        dado2=new Dado();
		        dado3=new Dado();        	
		    	}
		    
		    public void jugar() 
			{
		        dado1.tirar();
		        dado1.imprimir();
		        dado2.tirar();
		        dado2.imprimir();
		        dado3.tirar();
		        dado3.imprimir();
		        if (dado1.retornarValor()==dado2.retornarValor() && 
		            dado1.retornarValor()==dado3.retornarValor()) 
				{ System.out.println("Ganó");}
			 else 
				{ System.out.println("Perdió");}        	
		    }
		}
		//Clase Juego de dados, en su constructor llama al constructor por defecto que tiene la clase Dado.
		//Ese constructor no lo hemos definido lo genera por defecto el compilador. 

		public class LanzaJuego
		{
		    
		    public static void main(String[] ar){
		        JuegoDeDados j=new JuegoDeDados();
		        j.jugar();
		    }
		}
	}
}
