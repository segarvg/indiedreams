package org.example.Universidad;

import java.util.Scanner;

public class UniversidadDigital {
    public static void main(String[] args) {

      //Matriculas: id,nombre,correo,direccion,
      //  nombreAcudiente,estrato,numeroCreditos
      //Calcularcosto: precio1 credito=$850.000
      // 15% de Bienestar
      //Calcular promedio: p1 (0,5) (30%), p2 (35%), p3 (35%)

      //ENTRADAS

      String id;
      String nombre;
      String correo;
      String direccion;
      String nombreAcudiente;
      Byte numeroDeCreditos;
      Byte estrato;
      final Integer precio1Credito=850000;
      final Float porcentaje1=0.30F;
      final Float porcentaje2=0.35F;
      final Float porcentaje=0.35F;
      final Float bienestar=0.15F;



        Scanner leerTeclado=new Scanner(System.in);

        //informacion de estudiante
        System.out.println("Universidad Digital");

        System.out.println("id");
        id = leerTeclado.nextLine();

      System.out.println("Digite su nombre");
      nombre = leerTeclado.nextLine();

      System.out.println("Digite su correo");
      correo = leerTeclado.nextLine();

      System.out.println("Digite su direccion");
      direccion = leerTeclado.nextLine();

      System.out.println("Nombre de acudiente");
      nombreAcudiente = leerTeclado.nextLine();

      System.out.println("Ingrese el numero de creditos que desea");
      numeroDeCreditos = leerTeclado.nextByte();

      System.out.println("Ingrese su estrato");
      estrato = leerTeclado.nextByte();

      Integer total=precio1Credito*numeroDeCreditos;
      System.out.println("El costo total de la matricula "+total);












    }
}
