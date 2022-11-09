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

public class Principal{
    public static void main(String[] args) {
        
        Radio laMusicona = new Radio();

        boolean radioEncendido = false;

        System.out.println("¡Bienvenido a la radio de Julio y Carlos!");

        Scanner teclado = new Scanner(System.in);
        String menu = "Por favor seleccione una opción del menú. \n 1. Encender radio. \n2. Cambiar el volumen (Aumentar o disminuir). \n3. Seleccionar Modo Radio. \n4. Seleccionar Modo Reproducción. \n5. Seleccionar Modo Teléfono. \n6. Seleccionar Modo Productividad. \n7. Apagar Radio.";
        int opcion = 1;
        System.out.println(menu);
        System.out.println("Ingrese la opción que desa: ");
        opcion = teclado.nextInt();
        teclado.nextLine();

        while(opcion < 8 && opcion >= 1){
            try{
                switch(opcion){
                    case 1:{
                        System.out.println("Encendiendo radio...");
                        radioEncendido = true;
                        System.out.println("¡Radio encendida correctamente!");                        
                        System.out.println(menu);
                        System.out.println("Ingrese la opción que desea: ");
                        opcion = teclado.nextInt();
                        teclado.nextLine();
                        break;
                    }
                    case 2:{
                        int cambio = 0;
                        System.out.println("(Volumen actual: " + laMusicona.getVolume() + "% \nIngrese si desea aumentar o disminuir el volumen: \n1. Aumentar \n2. Disminuir.");
                        cambio = teclado.nextInt();
                        teclado.nextLine();
                        switch(cambio){
                            case 1:{
                                System.out.println("Volumen aumentado correctamente...");
                                laMusicona.aumentarVolumen();
                                System.out.println("Volumen actual: " + laMusicona.getVolume() + "%");;
                            }
                            case 2:{
                                System.out.println("Volumen disminuido correctamente...");
                                laMusicona.disminuirVolume();
                                System.out.println("Volumen actual: " + laMusicona.getVolume() + "%");;
                            }
                        }
                        System.out.println(menu);
                        System.out.println("Ingrese la opción que desea: ");
                        opcion = teclado.nextInt();
                        teclado.nextLine();
                        break;
                    }
                    case 3:{
                        /* Añadir todas las funciones del modo Radio comparando si el radio se encuentra encendido */
                    }
                    case 4:{
                        /* Añadir todas las funciones del modo Reproducción comparando si el radio se encuentra encendido */
                    }
                    case 5:{
                        /* Añadir todas las funciones del modo Teléfono comparando si el radio se encuentra encendido */
                    }
                    case 6:{
                        /* Añadir todas las funciones del modo Productividad comparando si el radio se encuentra encendido */
                    }
                    case 7:{
                        System.out.println("Apagando radio...");
                        radioEncendido = false;
                        opcion = 0;
                        System.out.println("¡Radio apagada correctamente!");
                        System.out.println("¡Esperamos la vuelva a utilizar pronto nuevamente!"); 
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