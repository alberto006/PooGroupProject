/*
 * La clase deportista hereda las propiedades de la clase persona
 * aplicaremos las propiedades de un deportista para mostrar datos propios de la clase.
 */
package poogroupproject;

public class Deportista extends Persona{
    
    public Deportista(int edad,String nombre,String id, String sexo){
        super(edad,nombre,id,sexo);
    }
    //disciplina indica el deporte que practica el deporstista
    public String disciplina;
    //la caterogria indica si es principiante, experimentado o profesional
    public String categoria;
    //el ranking le data un lugar en la tabla de posiciones en comparacion de los atletas competidores
    public int ranking;
    
    public void infoDeportista(String disciplina,String categoria,int ranking){
        this.disciplina=disciplina;
        this.categoria=categoria;
        this.ranking=ranking;
    }
    
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
    public void infoDeportista(){
        System.out.println("Disciplina: "+disciplina);
        System.out.println("Categoria: "+categoria);
        System.out.println("Ranking: "+ranking);
    }
    
}
