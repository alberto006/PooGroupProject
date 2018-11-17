//hola
package poogroupproject;

public abstract class Persona {
    protected int edad;
    protected String nombre;
    protected String id;
    protected String sexo;
    
    
    protected Persona(int edad,String nombre,String id,String sexo){
        this.edad=edad;
        this.nombre=nombre;
        this.id=id;
        this.sexo=sexo;
    }
    //getter y setter para edad
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    //getter y setter para nombre
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String Nombre){
        this.nombre=nombre;
    }
    //getter y setter para id
    public String getId(){
        return this.id;
    }    
    public void setId(String id){
      this.id=id;
    }
    //getter y setter para sexo
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String sexo){
        this.sexo=sexo;
    }
    
    //Metodo que muestra la indormacion general de la persona
    public void informacionGeneral(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Identidad: "+id);
        System.out.println("Sexo: "+sexo);
    }
    
}