//
//
//
//  @ Project: Laboratorio #4 de POO
//  @ File Name: Contactos.java
//  @ Date: 08/11/2022
//  @ Author: Carlos Alberto Valladares Guerra & Julio Andrés García Salas Pérez
//
//
//

public class Contactos {
    private String nombre;
    private int telefono;


    public Contactos() {
    }

    public Contactos(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
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
    public int getTelefono() {
        return this.telefono;
    }

    
    /** 
     * @param telefono
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    
    /** 
     * @param nombre
     * @return Contactos
     */
    public Contactos nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    
    /** 
     * @param telefono
     * @return Contactos
     */
    public Contactos telefono(int telefono) {
        setTelefono(telefono);
        return this;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return
            "Nombre del contacto: " + getNombre() + "" +
            "\nNúmero de teléfono: " + getTelefono() + "";
    }

}
