
/**
 * Write a description of class gato1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.Console;
public class programa
{
    public static void main(String args[]){
        Console Miconsola = System.console();
        System.out.println("Ingresa el nombre del perro");
        String nomPerro = Miconsola.readLine();
        Perro miPerro = new Perro(1,"Canelo", 10.5f);
        miPerro.alimentar(0);
        miPerro.Interactuar();
        miPerro.imprimeInformacion();
        
        Gato Mish = new Gato(1,"Mish", 10.5f);
        Mish.alimentar(0);
        Mish.Interactuar();
        Mish.imprimeInformacion();
    }
}
