package org.example.peluchitos;

import java.util.Scanner;

public class TiendaPeluchitos {
public static void main(String[] args) {

    /*la tienda peluchitos necesita almacenar
     la informacion de sus productos, ademas necesita
      almacenar la informacion de una venta indicando al
      cliente final el precio unitario, el IVA y aplicando
      los descuentos si es necesario

     */

    //un producto: id,nombre(codigo),descripcion
    //precio unitario, fotografia, cantidadEnBodega

    //una venta:id del producto; IVA del 19%
    //cantidad de producto comprado
    //debe mostrar el total sin IVA
    //debe mostrar el total despues del IVA

    //Entradas

    String fotografia;
    String descripcion;
    String nombreDeProducto;
    Long cantidadEnBodega;
    Long idProducto;
    Float precioUnitario;
    final Float IVA_PRODUCTO=0.19F;
    Float precioConIva;
    Float precioConDescuento;

    //Entradas para el registro de una venta
    Byte cantidadProductoComprador;


    //ENTRADA ESPECIAL PARA PEDIR DATOS POR TECLADO
    Scanner leerTeclado=new Scanner(System.in);

    //PROCEOS
    //1. Almacenando la informacion de 1 producto
    String verde="\u001B[31m";
    String rojo="\u001B[32m";
    System.out.println(verde+"***tienda peluchitos***");
    System.out.println(rojo+"******************\n");

    System.out.println("\nRegistrando un producto en la base de datos:");
    System.out.print("1. Digita el nombre del producto que ingresa a bodega: ");
    nombreDeProducto=leerTeclado.nextLine();

    System.out.println("2. Escribe la descripcion del producto (forma,tamaño,peso etc): ");
    descripcion=leerTeclado.nextLine();
    System.out.println("3.Ingresa la URL de la fotografia del producto: ");
    fotografia=leerTeclado.nextLine();
    System.out.println("4.Ingresa el identificador unico o codigo del producto: ");
    idProducto= leerTeclado.nextLong();
    System.out.println("5. ahora, Cuantos productos similares hay en bodega");
    cantidadEnBodega= leerTeclado.nextLong();
    System.out.println("6. cual es el precio unitario de venta del producto");
    precioUnitario= leerTeclado.nextFloat();

    System.out.println("........Procesando");
    System.out.println("Exito registrando tu preducto!!!");
    System.out.println("\n Resultado:");
    System.out.println("Nombre del preducto registrado: "+nombreDeProducto);
    System.out.println("____"+descripcion);
    System.out.println("$ "+precioUnitario+"precio unitario de venta");


    //Procesando una venta del producto
    System.out.println("\n ****Registro de venta***:");
    System.out.println("-- Digita el id del produto que quiere comprar: ");
    //1.cargar la variable con el id que digita el usuario
    idProducto= leerTeclado.nextLong();
    System.out.println("-- Digita la unidad de unidades que quieres comprar del producto: "+nombreDeProducto);
    cantidadProductoComprador= leerTeclado.nextByte();
    //2.quiero que me salga en el mensaje el nombre del prodcuto

    //3.quiero almacenar en una variable el resultado de multiplicador el precio unitario * cantidad

    Float costoTotalBruto =precioUnitario * cantidadProductoComprador;
    Float costoTotalNeto =costoTotalBruto + (costoTotalBruto*IVA_PRODUCTO);

    System.out.println("la compra total del producto "+nombreDeProducto+" fue de: $"+costoTotalNeto);


}

}
