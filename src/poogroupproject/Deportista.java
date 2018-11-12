/*
 * La clase deportista hereda las propiedades de la clase persona
 * aplicaremos las propiedades de un deportista para mostrar datos propios de la clase.
 */
package poogroupproject;

public class Deportista extends Persona{
    //Metodo principal para la clase Persona
    public Deportista(int edad,String nombre,String id, String sexo){
        super(edad,nombre,id,sexo);
    }
    //Atributos de la clase Deportista
    private String disciplina;    
    private String categoria;    
    private int ranking;
    
    //Constructos de la clase deportista
    public void infoDeportista(String disciplina,String categoria,int ranking){
        this.disciplina=disciplina;
        this.categoria=categoria;
        this.ranking=ranking;
    }
    //Metodos de acceso a las variables
    public String getDisciplina(){
        return this.disciplina;
    }
    public void setDisciplina(String disciplina){
        this.disciplina=disciplina;
    }
    public String getCategoria(){
        return this.categoria;
    }
    public void setCategoria(String categoria){
        this.categoria=categoria;
    }
    public int getRanking(){
        return this.ranking;
    }
    public void setRanking(int ranking){
        this.ranking=ranking;
    }
    //Metodo de impresion para informacion de la clase deportista
    public void infoDeportista(){
        System.out.println("Disciplina: "+disciplina);
        System.out.println("Categoria: "+categoria);
        System.out.println("Ranking: "+ranking);
    }
    
}
