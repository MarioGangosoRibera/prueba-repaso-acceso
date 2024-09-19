package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        ArrayList <Usuario> lista=new ArrayList<>();
        try {
            int opciones=0 ;
            Scanner leer = new Scanner(System.in);

            System.out.println("Elige una opcion");
            System.out.println("1.- Añadir Usuario");
            System.out.println("2.- Buscar Usuario");
            System.out.println("3.- Total Ingresos");
            System.out.println("0.- Salir");
            System.out.println("Ingrese la accion a realizar: ") ;
            opciones=leer.nextInt();

            switch(opciones) {
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                default:
                    System.out.println ("Numero no valido");
            }

            }catch (Exception ex) {
            ex.toString();
            }
    }
}