
package poogroupproject;

public class PooGroupProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante Hector = new Estudiante(23,"Hector Alberto Soriano Gonzalez","0801-1991-06064","Masculino");
        Hector.informacionGeneral();
        Hector.setCarrera("Ingenieria Computacion");
        Hector.setIndice(89.99);
        Hector.infoEstudiante();
        
        //Instancia de un objeto de la clase deportista
        System.out.println("");
        Deportista Alonzo = new Deportista(19,"Alonzo Zelaya","0801-1994-16485","Masculino");
        Alonzo.informacionGeneral();
        Alonzo.setCategoria("Profesional");
        Alonzo.setDisciplina("Atletismo");
        Alonzo.setRanking(5);
        Alonzo.infoDeportista();
    }
    
   
}



