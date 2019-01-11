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
		String contraseña;
		
		System.out.println("Escribe una contraseña (para que sea fuerte necesita tener almenos 2 mayusculas, 1 minuscula, 5 numeros y 11 caracteres):");
        contraseña = sc.nextLine();
        while (contraseña.length() < 11) {
        	System.out.println("La contraseña introducida tiene menos de 11 caracteres.");
        	System.out.print("Escribe otra contraseña: ");
            contraseña = sc.nextLine();
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
		return pass.length();
	}
}
