package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leerteclado=new Scanner(System.in);

        //Datos video juego

        String nombreDelVideoJuego;
        String nombreDelJefe;
        String plataformaPrincipal;
        String motorDeDesarrollo;
        double licenciasDeSotfware;
        double gastosAdiccionales;
        int horasDeDesarrollo;
        float costoPorHora;


        System.out.println("=====Registro de presupuesto - IndieDreams==== ");

        System.out.print("Nombre del video juego");
        nombreDelVideoJuego = leerteclado.nextLine();

        System.out.print("Nombre del jefe ");
        nombreDelJefe = leerteclado.nextLine();

        System.out.println("Plataforma Principal ");
        plataformaPrincipal = leerteclado.nextLine();

        System.out.print("Motor De Desarrollo ");
        motorDeDesarrollo = leerteclado.nextLine();

        //Datos numericos

        System.out.print("Total Horas De Desarrollo ");
        horasDeDesarrollo = leerteclado.nextInt();

        System.out.print("Costo Por Hora Trabajo ($): ");
        costoPorHora = leerteclado.nextFloat();

        System.out.print("Costo total licencias de sotfware ($): ");
        licenciasDeSotfware = leerteclado.nextDouble();

        System.out.print("Gastos adiccionales ($): ");
        gastosAdiccionales = leerteclado.nextDouble();

        //Calculos

        costoPorHora = horasDeDesarrollo * costoPorHora;
        double subtotal = costoPorHora + licenciasDeSotfware + gastosAdiccionales;
        double honorarios = subtotal * 0.05;
        double imprevistos = subtotal * 0.10;
        double totalgeneral = subtotal + honorarios + imprevistos;

        //Fecha actual

        LocalDate fecharegistro = LocalDate.now();

        //Reporte

        System.out.print("\n===== REPORTE DE PRESUPUESTO =====");
        System.out.print("Nombre del videojuego: " + nombreDelVideoJuego );
        System.out.print("Jefe de proyecto: " + nombreDelJefe );
        System.out.print("Plataforma principal: " + plataformaPrincipal );
        System.out.print("Motor de desarrollo: " + motorDeDesarrollo );
        System.out.print("Fecha de registro: " +  fecharegistro);


        System.out.printf("Costo por horas de desarrollo: $%.2f%n", costoPorHora);
        System.out.printf("Subtotal inicial: $%.2f%n", subtotal);
        System.out.printf("Honorarios administrativos (5%%): $%.2f%n", honorarios);
        System.out.printf("Imprevistos (10%%): $%.2f%n", imprevistos);
        System.out.printf(">>> Costo total general del proyecto: $%.2f%n", totalgeneral);
        

    }
}