package local.damw;

public class Main {
    public static void main(String[] args) {
      
        // crea una instància de la classe (Objecte)
        Automobil a1 = new Automobil("mercedes","SL321","2346AB1");     
        
        // crida al mètode per mostrar les dades
        a1.printAutomobil();

        // comprovem si la matricula és correcta
        if(Automobil.matriculaCorrecta(a1.matricula)){
            System.out.println(" La matricula " + a1.matricula + " es correcta.");
        } else {
            System.out.println(" La matricula " + a1.matricula + " NOOO es correcta.");
        }
        
    }
}