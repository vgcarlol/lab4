//
//
//
//  @ Project: Laboratorio #4 de POO
//  @ File Name: Principal.java
//  @ Date: 11/11/2022
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

        contactos Carlos = new contactos("Carlos Valladares", 44605615);
        laMusicona.getListaContactos().add(Carlos);
        contactos Mirna = new contactos("Mirna Oscal", 54250989);
        laMusicona.getListaContactos().add(Mirna);
        contactos Oscar = new contactos("Oscar Álvarez", 34560219);
        laMusicona.getListaContactos().add(Oscar);
        contactos Mario = new contactos("Mario Aldana", 23103212);
        laMusicona.getListaContactos().add(Mario);
        contactos Alejandro = new contactos("Alejando Giammattei", 21254045);
        laMusicona.getListaContactos().add(Alejandro);

        TarjetaPresentacion Carlos1 = new TarjetaPresentacion("44605615", "Carlos", "Ingeniero");
        laMusicona.getListadoTarjetaPresentacion().add(Carlos1);
        TarjetaPresentacion Mirna1 = new TarjetaPresentacion("54250989", "Mirna Oscal", "Arquitecta");
        laMusicona.getListadoTarjetaPresentacion().add(Mirna1);
        TarjetaPresentacion Oscar1 = new TarjetaPresentacion("34560219", "Oscar Álvarez", "Ciberseguridad");
        laMusicona.getListadoTarjetaPresentacion().add(Oscar1);
        TarjetaPresentacion Mario1 = new TarjetaPresentacion("23103212", "Mario Aldana", "Carpintero");
        laMusicona.getListadoTarjetaPresentacion().add(Mario1);
        TarjetaPresentacion Alejandro1 = new TarjetaPresentacion("21254045", "Alejando Giammattei", "Presidente");
        laMusicona.getListadoTarjetaPresentacion().add(Alejandro1);


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
                            int respuestaCont;
                            int respuestaLlamadas;
                            int finalizarLlamada;
                            int respuestaUltimo;
                            int respuestaConectar;
                            System.out.println("Selecciona la acción que deseas realizar: \n [1] Conectar radio \n [2] Desconectar radio ");
                            respuestaConectar = teclado.nextInt();
                            teclado.nextLine();
                            laMusicona.conectarDesconectar();
                            if(laMusicona.getModoTelefonoConexion() == true){
                                System.out.println("El radio actualmente se encuentra en modo: Conectado");
                                System.out.println("Mostrando el listado de contactos...");

                                /* Mostrar contactos */
                                System.out.println(laMusicona.contactos());

                                System.out.println("¿Deseas llamar a algún contacto? \n [1] si \n [2] no");
                                respuestaLlamadas = teclado.nextInt();
                                teclado.nextLine();
                                if(respuestaLlamadas == 1)
                                {
                                    System.out.println("Ingrese el ID del contacto al que desea llamar: ");
                                    int contacto = teclado.nextInt();
                                    teclado.nextLine();
                                    System.out.println(laMusicona.llamar(contacto));

                                    llamadaStatus = true;
                                    while(llamadaStatus == true){
                                        System.out.println("¿Desea terminar la llamada? \nPresione [1] cuando desee terminar la llamada.");
                                        finalizarLlamada = teclado.nextInt();
                                        teclado.nextLine();
                                        if(finalizarLlamada == 1){
                                            System.out.println(laMusicona.finalizarLlamada());
                                            llamadaStatus = false;
                                        }
                                    }
                                }
                                System.out.println("¿Deseas llamar al último contacto con el que se habló? \n [1] si \n [2] no");
                                respuestaUltimo = teclado.nextInt();
                                teclado.nextLine();
                                if(respuestaUltimo == 1)
                                {
                                    System.out.println(laMusicona.llamarUltimoContacto());
                                    llamadaStatus = true;
                                    while(llamadaStatus == true){
                                        System.out.println("¿Desea terminar la llamada? \nPresione [1] cuando desee terminar la llamada.");
                                        finalizarLlamada = teclado.nextInt();
                                        teclado.nextLine();
                                        if(finalizarLlamada == 1){
                                            System.out.println(laMusicona.finalizarLlamada());
                                            llamadaStatus = false;
                                        }
                                    }
                                }
                            }
                            else if(laMusicona.getModoTelefonoConexion() == false){
                                System.out.println("El radio actualmente se encuentra en modo: Desonectado");
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
                        if(radioEncendido == true){
                            System.out.println("Mostrando tarjetas de presentación: ");
                            System.out.println(laMusicona.verTarjetasPresentacion());
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