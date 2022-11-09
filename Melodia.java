//
//
//
//  @ Project: Laboratorio #4 de POO
//  @ File Name: Melodia.java
//  @ Date: 08/11/2022
//  @ Author: Carlos Alberto Valladares Guerra & Julio Andrés García Salas Pérez
//
//
//

public class Melodia{
    private String nombre;
    private String artista;
    private int year;
    private String genero;


    public Melodia() {
    }

    public Melodia(String nombre, String artista, int year, String genero) {
        this.nombre = nombre;
        this.artista = artista;
        this.year = year;
        this.genero = genero;
    }

    
    /** 
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }

    
    /** 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /** 
     * @return String
     */
    public String getArtista() {
        return this.artista;
    }

    
    /** 
     * @param artista
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    
    /** 
     * @return int
     */
    public int getYear() {
        return this.year;
    }

    
    /** 
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    
    /** 
     * @return String
     */
    public String getGenero() {
        return this.genero;
    }

    
    /** 
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    /** 
     * @param nombre
     * @return Melodia
     */
    public Melodia nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    
    /** 
     * @param artista
     * @return Melodia
     */
    public Melodia artista(String artista) {
        setArtista(artista);
        return this;
    }

    
    /** 
     * @param year
     * @return Melodia
     */
    public Melodia year(int year) {
        setYear(year);
        return this;
    }

    
    /** 
     * @param genero
     * @return Melodia
     */
    public Melodia genero(String genero) {
        setGenero(genero);
        return this;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Nombre de la melodía: " + getNombre() + "" +
            "\nArtista: " + getArtista() + "" +
            "\nAño de publicación: " + getYear() + "" +
            "\nGénero musical: " + getGenero() + "";
    }

}