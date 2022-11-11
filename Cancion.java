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

public class Cancion {
    private String nombre;
    private String durabilidad;
    private String autor;
    private String genero;
    /*
     * Constructor vacío y constructor con parametros agregados
     */
    public Cancion(){
        nombre = " ";
        durabilidad = " ";
        autor = " ";
        genero = " ";
    }
    public Cancion(String nombre, String durabilidad, String autor, String genero){
        this.nombre = nombre;
        this.durabilidad = durabilidad;
        this.autor = autor;
        this.genero = genero;
    }
    /*
     * @param autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    /*
     * @return String return autor
     */
    public String getAutor() {
        return autor;
    }
    /*
     * @param durabilidad
     */
    public void setDurabilidad(String durabilidad) {
        this.durabilidad = durabilidad;
    }
    /*
     * @return String return durabilidad
     */
    public String getDurabilidad() {
        return durabilidad;
    }
    /*
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    /*
     * @return String return genero
     */
    public String getGenero() {
        return genero;
    }
    /*
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /*
     * @return String return nombre
     */
    public String getNombre() {
        return nombre;
    }
    @Override
    public String toString() {
        String cadena2 = "";
        cadena2 = " Nombre "+ nombre +"\n Durabilidad: "+durabilidad+"\n Genero: "+genero+"\n Autor: "+autor;
        return cadena2;
    }

}
