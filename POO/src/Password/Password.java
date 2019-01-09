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
		String contrase�a="";
		int longitud = 0;
        for (int i = 0; i < 11; i++){
        	
            int eleccion=((int)Math.floor(Math.random()*3+1));
  
            if (eleccion==1){
                char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
                contrase�a+=minusculas;
            }else{
                if(eleccion==2){
                    char mayusculas=(char)((int)Math.floor(Math.random()*(91-65)+65));
                    contrase�a+=mayusculas;
                }else{
                    char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
                    contrase�a+=numeros;
                }
            }
           longitud++;
        }
        if (longitud < 11) {
        	System.out.print("La contrase�a tiene menos de 11 caracteres, escribe una contrase�a que por lo menos tenga 11 caracteres y solo sean mayusculas, minusculas y numeros.");
        	contrase�a = sc.nextLine();
        	for (int con = 0; con < contrase�a.length(); con++)
        		for (int num = 0; num < numeros.length(); num++)
        			for (int mayus = 0; mayus < mayusculas.length(); mayus++)
        				for (int minus = 0; minus < minusculas.length(); minus++)
        					if (con != num || con != mayus || con != minus) {
        						System.out.print("Has introducido caracteres no validos, escriba otra contrase�a");
        					}
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
		
		return longitud;
	}
}
