package Password;

import java.util.ArrayList;

public class ejecutable {

	public static void main(String[] args) {
		
		ArrayList<Password> contra = new ArrayList<Password>(5);
		
		String contrase�a;
		int longitud;
		
		for (int i=0; i <= 4; i++) {
			Password pdw = new Password();
			contrase�a = pdw.generarPassword();
			longitud = pdw.longitudPassword(contrase�a);
			
			pdw.setContrase�a(contrase�a);
			pdw.setLongitud(longitud);;
			
			contra.add(pdw);
		}
		
		for (int i = 0; i < contra.size(); i++) {
			System.out.print("La contrase�a " + contra.get(i).getContrase�a() + " tiene " + contra.get(i).getLongitud() + " caracteres y es ");
			if (contra.get(i).esFuerte()== false) {
				System.out.println("debil.");
			}
			else {
				System.out.println("fuerte.");
			}
		}

	}

}
