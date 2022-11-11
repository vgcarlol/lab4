//
//
//
//  @ Project: Laboratorio #4 de POO
//  @ File Name: contactos.java
//  @ Date: 11/11/2022
//  @ Author: Carlos Alberto Valladares Guerra & Julio Andrés García Salas Pérez
//
//
//

public class contactos{
    private String nombre;
    private int numero;


    public contactos() {
    }

    public contactos(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
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
     * @return int
     */
    public int getnumero() {
        return this.numero;
    }

    
    /** 
     * @param numero
     */
    public void setnumero(int numero) {
        this.numero = numero;
    }

    
    /** 
     * @param nombre
     * @return Contactos
     */
    public contactos nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    
    /** 
     * @param numero
     * @return Contactos
     */
    public contactos numero(int numero) {
        setnumero(numero);
        return this;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return
            "Nombre del contacto: " + getNombre() + "" +
            "\nNúmero de teléfono: " + getnumero() + "";
    }

}
