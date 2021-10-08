
/**
 * Write a description of class Perro here.
 * 
 * @author (EduJim) 
 * @version (1.0)
 */
public class Perro
{
    // instance variables - replace the example below with your own
    private int edad=0;
    private String nombre="Perro";
    private Float peso=1.0f;
    

    /**
     * Constructor for objects of class Perro
     */
    public int edadHumana(){
    
        // initialise instance variables
        return edad+7;
    }

    public String Interactuar(){
    
        // initialise instance variables
        return "guau";
    }
    
    public void imprimeInformacion(){
        System.out.println("Es un perro comiendo carne"+edad+"años, y me llamo:"+nombre);
    }
    
    Perro (int pEdad, String pNombre, float pPeso){
        edad = pEdad;
        nombre = pNombre;
        peso = pPeso;
    }
    
    public void alimentar (int tipoDeComida){
        if (tipoDeComida==0)
            System.out.println("Es un perro comiendo carne");
        else
            System.out.println("Es un perro comiendo croquetas");
    }
    
}
