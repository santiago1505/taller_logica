/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller;

import javax.xml.transform.sax.SAXSource;

/**
 *
 * @author 503
 */
import java.util.Scanner;
public class Solucion {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        
        //Opereciones();
        //System.out.println("-------------------");
        //Rectangulo();
        //System.out.println("--------------------");
        //Carbon();
        //System.out.println("--------------------");
        //Autos();
        //System.out.println("--------------------");
        //Banco ();
        //System.out.println("--------------------");
        NumerosDe2En2 ();
    }
    public static void Opereciones() {
        int primero = 3+((8*5)-(6/3));
        double segundo = ((2.5*2)*3)-(4/2)+8;
        double tercero = 2*((6-2.5)/3);
        boolean cuarto = 25>18;
        boolean quinto = 3+2.5*4/3 != 4*5.2-3.8;
        boolean sexto = (8.5/3.2+6.5-2.3*5/6 >= 15.8) && (21.4<81/4+2);
        
        System.out.println("1. " + primero + "\n" + 
        "2. " + segundo + "\n" +
        "3. " + tercero + "\n" +        
        "4. " + cuarto + "\n" +
        "5. " + quinto + "\n" +
        "6. " + sexto + "\n" );
    }
    
    public static void Rectangulo() {
        
        double area;
        double perimetro;
        System.out.println("ingrese la base");
        double base = leer.nextDouble();
         System.out.println("ingrese la altura");
        double altura = leer.nextDouble();
        
        area = (base * altura);
        System.out.println("el area es: " + area);
        
        perimetro = (base*2)+ (altura*2);
        System.out.println("el area es: " + perimetro);
    }

    public static void Carbon() {
        int contador1 = 0, promedio, promedio2;
        int contador = 1;
        while (contador <=12) {
            System.out.println("ingrese las toneladas del año");
            int toneladas = leer.nextInt();
            contador1 += toneladas ;
            contador++;
        }
        promedio = contador1/12;
        promedio2 = (contador*1000)/12;
        System.out.println("el promedio de los 12 años en toneladas es: "+ promedio + " toneladas");
        System.out.println("el promedio de los 12 años en kilos es: "+ promedio2 + " kilos");
    }
    
    public static void Autos() {
        double comision ;
        System.out.println("ingrese nombre del auto ");
        String nombAuto = leer.next();
        System.out.println("ingrese el precio del auto");
        int precio = leer.nextInt();
        
        if(precio <= 100000){
            comision = (precio * 0.015);
            System.out.println("la comision por la venta el auto " + nombAuto + "es: " + comision );
        }else if(precio > 100000 && precio <= 250000){
            comision = (precio * 0.018);
            System.out.println("la comision por la venta del auto " + nombAuto + " es: " + comision );
        }else if(precio > 250000){
            comision = (precio * 0.023);
            System.out.println("la comision por la venta el auto " + nombAuto + "es: " + comision );
        }
    }
    
    public static void Banco () {
        System.out.println("BIENVENIDO" + "\n" +
                "-------------" + "\n" +
                "ingrese 1 si desea consultar saldo" + "\n" +
                "ingrese 2 si desea realizar transferencias " + "\n" +
                "ingrese 3 si desea cambiar la clave" + "\n" +
                "ingrese 4 si desea bloquear producto" + "\n" +
                "ingrese 5 si desea realizar una donacion" + "\n"  );
        int opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("su saldo es: $$$$$$");
                break;
            case 2:
                System.out.println("transferencia realizada con exito");
                break;
            case 3:
                System.out.println("clave cambiada con exito");
                break;
            case 4:
                System.out.println("producto bloqueado con exito");
                break;
            case 5:
                System.out.println("donacion realizada con exito");
                break;
            default:
                System.out.println("error,intentelo de nuevo");
        }
        
    }
    
    public static void NumerosDe2En2 () {
        int contador = 0;
        
        for(int i=0; i < 100; i++){
            contador = contador +2;
            System.out.println(contador);         
        }
    }
    
    
    
    
}



