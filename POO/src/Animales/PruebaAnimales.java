package Animales;

/**
 * 3. Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario,
 *    Pinguino y Lagarto. Crea, al menos, tres m�todos espec�ficos de
 *    cada clase y redefne el/los m�todo/s cuando sea necesario.
 *    Prueba las clases creadas en un programa en el que se instancien
 *    objetos y se les apliquen m�todos.
 * 
 * @author Luis Jos� S�nchez
 */
public class PruebaAnimales {

  public static void main(String[] args) {
    Pinguino tux = new Pinguino(Sexo.MACHO);
    tux.come("palomitas");
    tux.programa();
    
    Perro laika = new Perro(Sexo.HEMBRA);
    laika.duerme();
    laika.dameLaPata();
    laika.amamanta();
    laika.cuidaCrias();
    
    Lagarto godzilla = new Lagarto(Sexo.MACHO);
    godzilla.tomaElSol();
    godzilla.duerme();
  }
}
