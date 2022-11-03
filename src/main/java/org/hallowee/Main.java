package org.hallowee;

import org.hallowee.Invitados;
import org.hallowee.Lugar;
import org.hallowee.Fiesta;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner fiestaScanner = new Scanner(System.in);
        Invitados objetoInvitado = new Invitados();
        Lugar objetoLugar = new Lugar();
        Fiesta objetoFiesta = new Fiesta();

        //DEFINIENDO LOS CONTOS DE LA FIESTA
        System.out.println("****** SUPER FIESTA HALLOWEEN *******");
        System.out.println("*************************************");

        System.out.println("1. Dijita el costo de la comida");
        double costosAlimento = fiestaScanner.nextDouble();
        if (costosAlimento > 0) {
            objetoFiesta.alimentos = costosAlimento;
        }else{
            System.out.println("Estas ingresando un valor invalido");
        }
        System.out.println("2. Dijita el costo de las bebidas");
        double costoBebida = fiestaScanner.nextDouble();
        if (costoBebida > 0) {
            objetoFiesta.bebidas = costoBebida;
        }else {
            System.out.println("Estas ingresando un valor invalido");
        }
        System.out.println("3. Dijita el costo del lugar");
        double costoLugar = fiestaScanner.nextDouble();
        if (costoLugar > 0) {
            objetoFiesta.costosLugar = costoLugar;
        }else {
            System.out.println("Estas ingresando un valor invalido");
        }
        System.out.println("4. Dijita el costo equipos");
        double costoEquipo = fiestaScanner.nextDouble();
        if (costoEquipo > 0) {
            objetoFiesta.costosEquipo = costoEquipo;
        }else {
            System.out.println("Estas ingresando un valor invalido");
        }

        System.out.println("costos de la fiesta \n comida = "+objetoFiesta.alimentos+"\n bebidas = "+objetoFiesta.alimentos+"\n Lugar = "+objetoFiesta.costosLugar+"\n Equipos = "+objetoFiesta.costosEquipo);




    }
}