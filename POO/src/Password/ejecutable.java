package Password;

import java.util.ArrayList;

public class ejecutable {

	public static void main(String[] args) {
		
		ArrayList<Password> contra = new ArrayList<Password>(5);
		
		String contraseña;
		int longitud;
		
		for (int i=0; i <= 4; i++) {
			Password pdw = new Password();
			contraseña = pdw.generarPassword();
			longitud = pdw.longitudPassword(contraseña);
			
			pdw.setContraseña(contraseña);
			pdw.setLongitud(longitud);;
			
			contra.add(pdw);
		}
		
		for (int i = 0; i < contra.size(); i++) {
			System.out.print("La contraseña " + contra.get(i).getContraseña() + " tiene " + contra.get(i).getLongitud() + " caracteres y es ");
			if (contra.get(i).esFuerte()== false) {
				System.out.println("debil.");
			}
			else {
				System.out.println("fuerte.");
			}
		}

	}

}
