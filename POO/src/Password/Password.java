package Password;

import java.util.Scanner;

public class Password {

	private int longitud;
	private String contrase�a;
	
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	public static String numeros = "0123456789";
	public static String mayusculas = "ABCDEFGHIJKLMN�IPQRSTUVWXYZ";
	public static String minusculas = "abcdefghijklmn�opqrstuvwxyz";
	
	public String generarPassword() {
		Scanner sc = new Scanner(System.in);
		String contrase�a;
		
		System.out.println("Escribe una contrase�a (para que sea fuerte necesita tener almenos 2 mayusculas, 1 minuscula, 5 numeros y 11 caracteres):");
        contrase�a = sc.nextLine();
        while (contrase�a.length() < 11) {
        	System.out.println("La contrase�a introducida tiene menos de 11 caracteres.");
        	System.out.print("Escribe otra contrase�a: ");
            contrase�a = sc.nextLine();
        }
		return contrase�a;
		
	}
	
	public boolean esFuerte() {
		int cuentanumeros=0;
        int cuentaminusculas=0;
        int cuentamayusculas=0;
        
        for (int i=0;i<contrase�a.length();i++){
                if (contrase�a.charAt(i)>=97 && contrase�a.charAt(i)<=122){
                    cuentaminusculas+=1;
                }else{
                    if (contrase�a.charAt(i)>=65 && contrase�a.charAt(i)<=90){
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
