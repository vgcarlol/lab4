//
//
//
//  @ Project: Laboratorio #4 de POO
//  @ File Name: Principal.java
//  @ Date: 08/11/2022
//  @ Author: Carlos Alberto Valladares Guerra & Julio Andrés García Salas Pérez
//
//
//

import java.util.ArrayList;

public class Radio {
    private String marca;
    ArrayList<Contactos> contactos = new ArrayList<>();

    public Radio() {
    }

    public Radio(String marca) {
        this.marca = marca;
    }

    
    /** 
     * @return String
     */
    public String getMarca() {
        return this.marca;
    }

    
    /** 
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    /** 
     * @param marca
     * @return Radio
     */
    public Radio marca(String marca) {
        setMarca(marca);
        return this;
    }


    /**
     * Método para cambiar de FM a AM.
     */
    public void cambiarFmAm(){

    }

    /**
     * Método para cambiar de emisora.
     */
    public void cambiarEmisora(){

    }

    /**
     * Método para guardar la emisora.
     */
    public void guardarEmisora(){

    }

    /**
     * Método para cargar una emisora.
     */
    public void cargarEmisora(){

    }

    /**
     * Método para seleccionar una lista de reproducción
     */
    public void seleccionarLista(){

    }

    /**
     * Método para retroceder o avanzar una canción
     */
    public void cambiarCancion(){

    }

    /**
     * Método para escuchar una canción.
     */
    public void escucharCancion(){

    }

    /**
     * Método para contectar o desconectar el radio.
     */
    public void conectarDesconectar(){

    }

    /**
     * Método para la lista de contactos.
     */
    public void contactos(){
         
    }

    /**
     * Método para realizar una llamada a un contacto.
     */
    public void llamar(){

    }

    /**
     * Método para finalizar una llamada en curso.
     */
    public void finalizarLlamada(){

    }

    /**
     * Método para llamar al último contacto de la lista.
     */
    public void llamarUltimoContacto(){

    }

    /**
     * Método para ver las tarjetas de presentación.
     */
    public void verTarjetasPresentacion(){

    }


    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return
            "La marca del radio es: " + getMarca() + "";
    }

}
