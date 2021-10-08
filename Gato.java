
/**
 * Write a description of class Gato here.
 * 
 * @author (EduJim) 
 * @version (1.0)
 */
public class Gato
{
    // instance variables - replace the example below with your own
    private int edad=0;
    private String nombre="Gato";
    private Float peso=1.0f;
    

    /**
     * Constructor for objects of class Gato
     */
    public int edadHumana(){
    
        // initialise instance variables
        return edad+7;
    }

    public String Interactuar(){
    
        // initialise instance variables
        return "miau";
    }
    
    public void imprimeInformacion(){
        System.out.println("Es un gato comiendo carne"+edad+"años, y me llamo:"+nombre);
    }
    
    Gato (int pEdad, String pNombre, float pPeso){
        edad = pEdad;
        nombre = pNombre;
        peso = pPeso;
    }
    
    public void alimentar (int tipoDeComida){
        if (tipoDeComida==0)
            System.out.println("Es un gato comiendo carne");
        else
            System.out.println("Es un gato comiendo croquetas");
    }
    
}
