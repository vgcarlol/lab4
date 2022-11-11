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

import java.util.Scanner;
import java.lang.invoke.LambdaConversionException;
import java.util.ArrayList;
public class Principal{
    public static void main(String[] args) {
        
        radio laMusicona = new radio();
        Cancion circles = new Cancion("Circles","3:00","Post Malone","Rap");
        laMusicona.getListaCanciones1().add(circles);
        Cancion miDebilidad = new Cancion("Mi Debilidad", "2:46", "Maria Becerra", "Reggaeton");
        laMusicona.getListaCanciones1().add(miDebilidad);
        Cancion otraNocheMas = new Cancion("Otra noche mas", "2:15", "Rusherking","balada");
        laMusicona.getListaCanciones1().add(otraNocheMas);
        Cancion arrancarmelo = new Cancion("Arrancarmelo", "3:03", "Wos", "Balada");
        laMusicona.getListaCanciones1().add(arrancarmelo);
        Cancion ojala = new Cancion("Ojala", "2:40", "Maria Becerra", "Reggaeton");
        laMusicona.getListaCanciones1().add(ojala);
        Cancion memorias = new Cancion("Memorias", "3:48", "Jhay Cortez y Mora", "EDM Reggaeton");
        laMusicona.getListaCanciones2().add(memorias);
        Cancion modelito = new Cancion("Modelito","3:10","Mora y YVNGCHIMI","trap y reggaeton");
        laMusicona.getListaCanciones2().add(modelito);
        Cancion prohibidox = new Cancion("Prohibidox", "2:46","Feid","Reggaeton");
        laMusicona.getListaCanciones2().add(prohibidox);
        Cancion entreNostoros = new Cancion("Entre Nosotros","3:12","Tiago PZK y Lit Killah","RnB");
        laMusicona.getListaCanciones2().add(entreNostoros);
        Cancion bachataEnFukuoka = new Cancion("Bachata en fukuoka","3:37","Juan Luis Guerra","bachata");
        laMusicona.getListaCanciones2().add(bachataEnFukuoka);

        boolean radioEncendido = false;

        System.out.println("¡Bienvenido a la radio de Julio y Carlos!");

        Scanner teclado = new Scanner(System.in);
        String menu = "\n\nPor favor seleccione una opción del menú. \n1. Encender radio. \n2. Cambiar el volumen (Aumentar o disminuir). \n3. Seleccionar Modo Radio. \n4. Seleccionar Modo Reproducción. \n5. Seleccionar Modo Teléfono. \n6. Seleccionar Modo Productividad. \n7. Apagar Radio y salir.";
        int opcion = 1;
        System.out.println(menu);
        System.out.println("Ingrese la opción que desa: ");
        opcion = teclado.nextInt();
        teclado.nextLine();

        while(opcion < 8 && opcion >= 1){
            try{
                switch(opcion){
                    case 1:{
                        if(radioEncendido == false){
                            System.out.println("Encendiendo radio...");
                            radioEncendido = true;
                        }
                        else if(radioEncendido == true){
                            System.out.println("El radio ya se encontraba encendido.");
                        }
                        System.out.println("¡Radio encendida correctamente!");                        
                        System.out.println(menu);
                        System.out.println("Ingrese la opción que desea: ");
                        opcion = teclado.nextInt();
                        teclado.nextLine();
                        break;
                    }
                    case 2:{
                        if(radioEncendido == true){
                            int cambio = 0;
                            System.out.println("Volumen actual: " + laMusicona.getVolumen() + "% \nIngrese si desea aumentar o disminuir el volumen: \n1. Aumentar \n2. Disminuir.");
                            cambio = teclado.nextInt();
                            teclado.nextLine();
                            switch(cambio){
                                case 1:{
                                    System.out.println("Volumen aumentado correctamente...");
                                    laMusicona.cambiarVolumen("+");
                                    System.out.println("Volumen actual: " + laMusicona.getVolumen() + "%");
                                    break;
                                }
                                case 2:{
                                    System.out.println("Volumen disminuido correctamente...");
                                    laMusicona.cambiarVolumen("-");
                                    System.out.println("Volumen actual: " + laMusicona.getVolumen() + "%");
                                    break;
                                }
                            }
                        }
                        else if(radioEncendido == false){
                            System.out.println("Por favor encienda el radio para utilizar esta opción.");
                        }
                        System.out.println(menu);
                        System.out.println("Ingrese la opción que desea: ");
                        opcion = teclado.nextInt();
                        teclado.nextLine();
                        break;
                    }
                    case 3:{
                        if(radioEncendido == true){
                            int entrada, respuestaFM, respuestaEmi, respuestaEmisoras, respuestaIngreso, cantidadEmi, respuestaCargar, entradaCargo;
                            double emisora = 0.00;
                            String operador = "";
                            System.out.println("La frecuencia actual es de: " + laMusicona.getFmAm() + "\n¿Deseas cambiarlo? \n [1] si \n [2] no");
                            respuestaFM = teclado.nextInt();
                            if(respuestaFM == 1)
                            {
                                laMusicona.cambiarFmAm();
                            }
                            System.out.println("La emisora actual es:" + laMusicona.getEmisoraActual());
                            System.out.println("¿Quieres modificar la emisora? \n [1] si \n [2] no ");
                            respuestaEmi = teclado.nextInt();
                            teclado.nextLine();
                            if(respuestaEmi == 1)
                            {
                                System.out.println("¿Deseas aumentar o disminuir la emisora? \n [1] + \n [2] -");
                                entrada = teclado.nextInt();
                                teclado.nextLine();
                                if(entrada == 1)
                                {
                                    operador = "+";
                                }else if(entrada == 2)
                                {
                                    operador = "-";
                                }
                                laMusicona.cambiarEmisora(operador);
                            }
                            System.out.println("¿Deseas guardar una emisora? \n [1] si \n [2] no");
                            respuestaEmisoras = teclado.nextInt();
                            teclado.nextLine();
                            if(respuestaEmisoras == 1)
                            {
                                System.out.println("¿Deseas guardar la emisora actual o ingresar una emisora? \n [1] Actual \n [2] Ingresar");
                                respuestaIngreso = teclado.nextInt();
                                teclado.nextLine();
                                if(respuestaIngreso == 1)
                                {
                                    laMusicona.guardarEmisora(Double.toString(laMusicona.getEmisoraActual()));
                                }else if(respuestaIngreso == 2)
                                {
                                    System.out.println("¿Cuántas emisoras deseas guardar?: ");
                                    cantidadEmi = teclado.nextInt();
                                    for(int i = 0; i<cantidadEmi; i++)
                                    {
                                        System.out.println("Ingresa la emisora que deseas guardar: ");
                                        emisora = teclado.nextDouble();
                                        teclado.nextLine();
                                        laMusicona.guardarEmisora(Double.toString(emisora));
                                    }
                                }
                            }
                            System.out.println("¿Deseas cargar una emisora? \n [1] si \n [2] no");
                            respuestaCargar = teclado.nextInt();
                            teclado.nextLine();
                            if(respuestaCargar == 1)
                            {
                                System.out.println("Las emisoras que puedes cargar son \n ");
                                for(int i = 0; i<laMusicona.getListaEmisoras().size(); i++)
                                {
                                    System.out.println(i + laMusicona.getListaEmisoras().get(i));
                                }
                                System.out.println("¿Cuál deseas cargar?: \n");
                                entradaCargo = teclado.nextInt();
                                laMusicona.cargarEmisora(entradaCargo);
                            }
                        }
                        else if(radioEncendido == false){
                            System.out.println("Por favor encienda el radio para utilizar esta opción.");
                        }
                        System.out.println(menu);
                        System.out.println("Ingrese la opción que desea: ");
                        opcion = teclado.nextInt();
                        teclado.nextLine();
                        break;
                    }
                    case 4:{
                        if(radioEncendido == true){
                            int seleccionPlaylist;
                            int cambiarCancion = 0;
                            int direccion = 0;
                            int eleccionCancion = 0;
                            
                            System.out.println("¡Selecciona una lista! ");
                            System.out.println("playlist 1: \n" + laMusicona.getListaCanciones1() + "\nplaylist 2: \n" + laMusicona.getListaCanciones2());
                            seleccionPlaylist = teclado.nextInt();
                            System.out.println(laMusicona.seleccionarLista(seleccionPlaylist));
                            if(seleccionPlaylist == 1)
                            {
                                System.out.println("¿Qué cancion deseas escuchar?: ");
                                eleccionCancion = teclado.nextInt();
                                laMusicona.escucharCancion(eleccionCancion);
                                System.out.println("¿Deseas cambiar la canción: \n [1] si \n [2] no");
                                while(cambiarCancion !=2)
                                {
                                    if(cambiarCancion == 1){
                                        System.out.println("¿Deseas ir para adelante o para atras en la playlist? \n [1] para adelante \n [2] para atras");
                                        if(direccion == 1)
                                        {
                                            laMusicona.cambiarCancion(direccion);
                                        }else if(direccion == 2){
                                            laMusicona.cambiarCancion(direccion);
                                        }

                                    }
                                }
                            }
                        }
                        else if(radioEncendido == false){
                            System.out.println("Por favor encienda el radio para utilizar esta opción.");
                        }
                        System.out.println(menu);
                        System.out.println("Ingrese la opción que desea: ");
                        opcion = teclado.nextInt();
                        teclado.nextLine();
                        break;
                        
                    }
                    case 5:{
                        /* Añadir todas las funciones del modo Teléfono comparando si el radio se encuentra encendido */

                        if(radioEncendido == true){
                           
                            boolean llamadaStatus = false;
                            boolean conectado = false;
                            int respuestaCont;
                            int respuestaLlamadas;
                            int respuestaIngreso;
                            int finalizarLlamada;
                            int respuestaUltimo;
                            int respuestaConectar;
                            System.out.println("Selecciona la acción que deseas realizar: \n [1] Conectar radio \n [2] Desconectar radio ");
                            respuestaConectar = teclado.nextInt();
                            teclado.nextLine();
                            laMusicona.conectarDesconectar(respuestaConectar, conectado);
                            if(conectado == true){
                                System.out.println("¿Quieres mostrar los contactos? \n [1] si \n [2] no ");
                                respuestaCont = teclado.nextInt();
                                teclado.nextLine();
                                if(respuestaCont == 1)
                                {
                                    /* Mostrar contactos */
                                    laMusicona.getContactos();
                                }
                                System.out.println("¿Deseas llamar a algún contacto? \n [1] si \n [2] no");
                                respuestaLlamadas = teclado.nextInt();
                                teclado.nextLine();
                                if(respuestaLlamadas == 1)
                                {
                                    while(respuestaLlamadas == 1){
                                        System.out.println("Ingrese el número del contacto al que desea llamar: ");
                                        respuestaIngreso = teclado.nextInt();
                                        teclado.nextLine();
                                        llamadaStatus = true;
                                        laMusicona.llamar(respuestaIngreso);
                                        while(llamadaStatus == true){
                                            System.out.println("Ingrese [1] cuando desee finalizar la llamada: ");
                                            finalizarLlamada = teclado.nextInt();
                                            teclado.nextLine();
                                            laMusicona.finalizarLlamada(respuestaIngreso);
                                            respuestaLlamadas = 2;
                                        }
                                    }
                                }
                                System.out.println("¿Deseas llamar al último contacto con el que se habló? \n [1] si \n [2] no");
                                respuestaUltimo = teclado.nextInt();
                                teclado.nextLine();
                                if(respuestaUltimo == 1)
                                {
                                    
                                }
                            }
                            else if(conectado == false){
                                System.out.println("Por favor conecte un dispositivo al radio para utilizar esta opción.");
                            }
                        }
                        else if(radioEncendido == false){
                            System.out.println("Por favor encienda el radio para utilizar esta opción.");
                        }
                        System.out.println(menu);
                        System.out.println("Ingrese la opción que desea: ");
                        opcion = teclado.nextInt();
                        teclado.nextLine();
                        break;
                    }
                    case 6:{
                        /* Añadir todas las funciones del modo Productividad comparando si el radio se encuentra encendido */
                        
                        if(radioEncendido == true){
                            System.out.println("Mostrando tarjetas de presentación: ");



                        }
                        else if(radioEncendido == false){
                            System.out.println("Por favor encienda el radio para utilizar esta opción.");
                        }
                        System.out.println(menu);
                        System.out.println("Ingrese la opción que desea: ");
                        opcion = teclado.nextInt();
                        teclado.nextLine();
                        break;
                    }
                    case 7:{
                        if(radioEncendido == true){
                            System.out.println("Apagando radio...");
                            radioEncendido = false;
                            opcion = 0;
                            System.out.println("¡Radio apagada correctamente!");
                            System.out.println("¡Esperamos la vuelva a utilizar pronto nuevamente!"); 
                        }
                        else if(radioEncendido == false){
                            System.out.println("No se puede apagar el radio debido a que se encuentra apagado actualmente.");
                            System.out.println("Saliendo del sistema.");
                            opcion = 0;
                        }
                    }
                }
            }
            catch (Exception e){
            teclado.next();
            System.out.println("Entrada incorrecta");
            System.out.println(menu);
            System.out.println("Ingrese la opción que desea: ");
            opcion = teclado.nextInt();
            teclado.nextLine();
            }
        }

    }
}