/*
* La Clase estudiante hereda las propiedades de la clase persona
* pero aplica las propiedades de un estudiante como la carrera y el indice
 */
package poogroupproject;

/**
 *
 * @author asoriano
 */
public class Estudiante extends Persona{   
     
        public Estudiante(int edad,String nombre, String id,String sexo){
            super(edad,nombre,id,sexo);
        }
        
        public String carrera;
        public double indice;      
        
        public void Estudiante(String carrera, double indice){
            this.carrera=carrera;
            this.indice=indice;
        }
        
        public String getCarrera(){
            return this.carrera;
        }
        public void setCarrera(String carrera){
            this.carrera=carrera;
        }
        
        public double getIndice(){
            return this.indice;
        }
        public void setIndice(double indice){
            this.indice=indice;
        }
        
        public void infoEstudiante(){
            System.out.println("Carrera: "+this.carrera);
            System.out.println("Indice: "+this.indice);
        }
    
    }
    