package Password;

import java.util.Scanner;

public class Password {

	private int longitud;
	private String contraseña;
	
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public static String numeros = "0123456789";
	public static String mayusculas = "ABCDEFGHIJKLMNÑIPQRSTUVWXYZ";
	public static String minusculas = "abcdefghijklmnñopqrstuvwxyz";
	
	public String generarPassword() {
		Scanner sc = new Scanner(System.in);
		String contraseña="";
		int longitud = 0;
        for (int i = 0; i < 11; i++){
        	
            int eleccion=((int)Math.floor(Math.random()*3+1));
  
            if (eleccion==1){
                char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
                contraseña+=minusculas;
            }else{
                if(eleccion==2){
                    char mayusculas=(char)((int)Math.floor(Math.random()*(91-65)+65));
                    contraseña+=mayusculas;
                }else{
                    char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
                    contraseña+=numeros;
                }
            }
           longitud++;
        }
        if (longitud < 11) {
        	System.out.print("La contraseña tiene menos de 11 caracteres, escribe una contraseña que por lo menos tenga 11 caracteres y solo sean mayusculas, minusculas y numeros.");
        	contraseña = sc.nextLine();
        	for (int con = 0; con < contraseña.length(); con++)
        		for (int num = 0; num < numeros.length(); num++)
        			for (int mayus = 0; mayus < mayusculas.length(); mayus++)
        				for (int minus = 0; minus < minusculas.length(); minus++)
        					if (con != num || con != mayus || con != minus) {
        						System.out.print("Has introducido caracteres no validos, escriba otra contraseña");
        					}
        }
		return contraseña;
		
	}
	
	public boolean esFuerte() {
		int cuentanumeros=0;
        int cuentaminusculas=0;
        int cuentamayusculas=0;
        
        for (int i=0;i<contraseña.length();i++){
                if (contraseña.charAt(i)>=97 && contraseña.charAt(i)<=122){
                    cuentaminusculas+=1;
                }else{
                    if (contraseña.charAt(i)>=65 && contraseña.charAt(i)<=90){
                        cuentamayusculas+=1;
                }else{
                    cuentanumeros+=1;
                    }
                }
            }
            
            if (cuentanumeros>=5 && cuentaminusculas>=1 && cuentamayusculas>=2){
            return true;
        }else{
            return false;
        }
	}
	
	public int longitudPassword(String pass) {
		
		return longitud;
	}
}
