package org.hallowee;

import java.util.Scanner;

public class Invitados {
    //ATRIBUTOS

    public String nombre;
    public String apellido;
    public byte edad;
    public String id;
    public boolean aplicaCover;
    public float valorCover;
    public char disfraz;


    //CONSTRUCTOR

    public Invitados() {
    }

    //METODOS
    public void mostrarInvitado(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Apellido: "+this.apellido);
        System.out.println("Edad: "+this.edad);
        System.out.println("Id: "+this.id);
        System.out.println("Aplica Cover: "+this.aplicaCover);
        System.out.println("Valor Cover: "+this.valorCover);
        System.out.println("Disfraz Tipo : "+this.disfraz);

    }
    public void agregarInvitado(){
        Scanner invitadoScanner = new Scanner(System.in);
        this.aplicaCover = true;
        this.valorCover = 30000;
        System.out.println("INGRESE EL NOMBRE DEL INVITADO");
        this.nombre = invitadoScanner.nextLine();
        System.out.println("INGRESE EL EL APELLIDO");
        this.apellido = invitadoScanner.next();
        System.out.println("INGRESE EL ID");
        this.id = invitadoScanner.next();
        System.out.println("INGRESE EL TIPO DE DISFRAZ A - B - C ");
        this.disfraz = invitadoScanner.next().charAt(0);
        System.out.println("INGRESE LA EDAD");
        this.edad = invitadoScanner.nextByte();
    }
}
