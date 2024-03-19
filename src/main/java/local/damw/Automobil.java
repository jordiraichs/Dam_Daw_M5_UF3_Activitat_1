package local.damw;

/**
 * Definició de la classe Automobil
 */
public class Automobil {

    // variables de instància (atributs)
    public String marca;
    public String model;
    public String matricula;

    // constructor
    public Automobil(String marca, String model, String matricula) {
        this.marca = marca;
        this.model = model;
        this.matricula = matricula;
    }

    // constructor sense parametres crea espai a memòria
    public Automobil() { }

    // mètode per  mostrar les dades de l'automòbil
    public void printAutomobil() {
        System.out.println("Marca  : " + marca);
        System.out.println("Model  : " + model);
        System.out.println("Matricula  : " + matricula);
    }

    /**
     * Funció de la classe Automòbil
     * @param matricula : String; és la matrícula del vehicle
     * @return : bool ; True: matricula correcta ; False: matricula NO correcta
     */
    public static boolean matriculaCorrecta (String matricula){
        char[] mat = matricula.toCharArray();
        int longitud = matricula.length();
        
        // 1
        boolean correcta = true;
        int i = 0;
        
        if(longitud != 7) correcta = false; // 2
        
        while (correcta == true && i < longitud){ // 3
            char c = mat[i];
    
            if( i < 4 && Character.isDigit(c)){ // 4
                i = i + 1; // 5
            } 
            
            else if ( i >= 4 && i < longitud && Character.isUpperCase(c)) { // 6
                i = i + 1; // 7
            }  
            
            else {
                correcta = false; // 8
            }
        }

        return correcta; // 9
        
        /**
         * Possibles camins
         * Nodes: 9
         * Arestes:11
         * M = Arestes - Nodes + 2 = 4
         * 1-2-3-9  : Matrícula amb més o menys de 7 xifres- Ex: 12AS, 1234AAAA ; esperem: false
         * 1-2-3-4-5-6-8-3-9 : Matrícula amb un des 4 primers digits no enters; Ex: 1ASP111, @112SSS ; esperem: false
         * 1-2-3-4-5-3-6-8-3-9: Matrícula amb un dels 3 digits de les lletres no correcte; Ex: 1234A1S, 2222@1A ; esperem: false
         * 1-2-3-4-5-3-5-6-7-3-9: Matrícula correcta; Ex: 2222ABC ; esperem: true
         * podem continuar provant.......
         */
    }

}
