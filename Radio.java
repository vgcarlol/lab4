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
import java.util.Scanner;

public class Radio {
    private String marca;
    private int volume;
    private Double emisora;
    private ArrayList<Double> emisoras;
    ArrayList<Contactos> contactos = new ArrayList<>();
    Scanner teclado = new Scanner(System.in);

    public Radio() {
        marca = "Pyooner";
        volume = 50;
        emisora = 99.5;
        ArrayList<Double> emisoras = new ArrayList<>();
        Contactos contacto = new Contactos();
        ArrayList<Contactos> contacto1 = new ArrayList<>();
        ArrayList<Contactos> contacto2 = new ArrayList<>();
        ArrayList<Contactos> contacto3 = new ArrayList<>();
        contacto1.add(contacto);
        contacto.setNombre("Carlos");
        contacto.setTelefono(44605615);
        contacto2.add(contacto);
        contacto.setNombre("Ana Lucía");
        contacto.setTelefono(32065423);
        contacto3.add(contacto);
        contacto.setNombre("Juan");
        contacto.setTelefono(52008524);
    }

    public Radio(String marca, Double emisora, ArrayList<Double> emisoras) {
        this.marca = marca;
        this.emisora = emisora;
        this.emisoras = emisoras;
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
     * @return int
     */
    public int getVolume(){
        return this.volume;
    }
    
    /**
     * @param volume
     */
    public void setVolume(int volume){
        this.volume = volume;
    }

    /**
     * @return double
     */
    public double getEmisora()
    {
        return this.emisora;
    }

    /**
     * @param emisora
     */   
    public void setEmisora(Double emisora)
    {
        this.emisora = emisora;
    } 

    /**
     * @return ArrayList<Double>
     */
    public ArrayList<Double> getEmisoras()
    {
        return this.emisoras;
    }

    /**
     * @param emisoras
     */
    public void setEmisoras(ArrayList<Double> emisoras)
    {
        this.emisoras = emisoras;
    }
    
    /**
     * @return ArrayList<Contactos>
     */
    public ArrayList<Contactos> getContactos()
    {
        return this.contactos;
    }

    /**
     * @param contactos
     */
    public void setContactos(ArrayList<Contactos> contactos)
    {
        this.contactos = contactos;
    }

    /**
     * Método para cambiar de FM a AM.
     */

    public String cambiarFmAm(){
        boolean estado = true;
        String estadoFM = "la radio está en FM";
        String estadoAM = "la radio está en AM";
        int respuestaCamb;
        String estadoActual;
        System.out.println("¿Deseas la radio en FM o AM? \n [1] FM \n [2] AM ");
        respuestaCamb = teclado.nextInt();
        if(respuestaCamb == 1)
         {
            estado = true;
        }else if(respuestaCamb == 2)
        {
            estado = false;
        }
        if(estado)
        {
            estadoActual = estadoFM;
        }else
        {
            estadoActual = estadoAM;
        };
        return estadoActual;
    }

    /**
     * Método para cambiar de emisora.
     */
    public String cambiarEmisora(String operador){
        String cadena = "";
        if(operador == "+")
        {
            emisora += 0.5;
            cadena = "Se ha cambiado la emisora a + 0.5";
        }else if(operador == "-")
        {
            emisora -= 0.5;
            cadena = "Se ha cambiado la emisora a - 0.5";
        }
        return cadena;
    }

    /**
     * Método para guardar la emisora.
     */
    public String guardarEmisora(double emisora){
        emisoras.add(emisora);
        return "se ha guardado la emisora: " + emisora;
    }

    /**
     * Método para cargar una emisora.
     */
    public String cargarEmisora(double emisora){
        return "se ha cargado la emisora: " + emisora;
    }

    /**
     * Método para seleccionar una lista de reproducción
     */
    public String seleccionarLista(){
        return "se ha seleccionado la lista!";
    }

    /**
     * Método para retroceder o avanzar una canción
     */
    public String cambiarCancion(int direccion){
        String cadena1 = "";
        if(direccion == 1)
        {
            cadena1 = "Se ha cambiado a la siguiente canción!";
        }else if(direccion == 2)
        {
            cadena1 = "Se ha cambiado la canción previa!";
        }
        return cadena1;
    }

    /**
     * Método para escuchar una canción.
     */
    public String escucharCancion(ArrayList<Melodia> canciones, int eleccionCancion){
        String cancionEscuchada = canciones.get(eleccionCancion).toString();
        return cancionEscuchada;
    }

    /**
     * Método para contectar o desconectar el radio.
     */
    public void conectarDesconectar(int respuestaConectar, boolean conectado){
        switch(respuestaConectar){
            case 1:{
                if(conectado == false){
                    System.out.println("Conectando radio...");
                    conectado = true;
                }
                else if(conectado == true){
                    System.out.println("El radio ya se encontraba conectado.");
                }
                break;
            }
            case 2:{
                if(conectado == true){
                    System.out.println("Desconectando radio...");
                    conectado = false;
                    System.out.println("¡Radio desconectanda correctamente!");
                    System.out.println("¡Esperamos vuelva a utilizar de nuevo esta función!"); 
                }
                else if(conectado == false){
                    System.out.println("No se puede desconectar el radio debido a que se encuentra desconectada actualmente.");
                }
                break;
            }

        }
    }

    /**
     * Método para la lista de contactos.
     */
    public ArrayList<Contactos> contactos(Contactos contactos){
        return this.contactos;
    }

    /**
     * Método para realizar una llamada a un contacto.
     */
    public void llamar(int respuestaIngreso){
        System.out.println("Llamando al número: " + respuestaIngreso);
    }

    /**
     * Método para finalizar una llamada en curso.
     */
    public void finalizarLlamada(int respuestaIngreso){
            System.out.println("Llamada con el contacto con número: " + respuestaIngreso + " ha sido finalizada.");
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


    public void aumentarVolumen(){
        volume = volume + 1;
    }
    public void disminuirVolume(){
        volume = volume - 1;
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
