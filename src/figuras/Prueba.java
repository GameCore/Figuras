
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Prueba {
    
    public static void main(String[] args) {
         long ti,tf,tt;
         String s = null ;

		Scanner lee = new Scanner( System.in );
		Cuadrado cua = new Cuadrado();
		Triangulo tri = new Triangulo();
	       Rectangulo rec = new Rectangulo();
		Circulo cir = new Circulo(); 

		System.out.printf("%s %10s %10s %10s %10s %10s",
			"Escoge una de las Figuras de las que deas calculas su area y perimetro\n",
			"1.-Cuadrado\n",
			"2.-Triangulo\n",
			"3.-Rectangulo\n",
			"4.-Circulo\n",
                        "Seleccion: ");
		switch( lee.nextInt() )
		{
			case 1:
                            ti = System.currentTimeMillis();
                        System.out.println( "Area : " + cua.area() + "cm" );
			System.out.println( "Perimetro : " + cua.perimetro() + "cm" );
                            tf = System.currentTimeMillis();
                            tt = tf - ti;
                            System.out.println("Proceso :" + tt + "Milisegundos.");
			break;
                            
                        case 2:
                            ti = System.currentTimeMillis();
                        System.out.println( "Area : " + tri.area() + "cm" );
			System.out.println( "Perimetro : " + tri.perimetro() + "cm" ); 
                            tf = System.currentTimeMillis();
                            tt = tf - ti;
                            System.out.println("Proceso :" + tt + "Milisegundos.");
                        break;
                            
                        case 3:
                             ti = System.currentTimeMillis();
                        System.out.println( "Area : " + rec.area() + "cm" );
			System.out.println( "Perimetro : " + rec.perimetro() + "cm" ); 
                            tf = System.currentTimeMillis();
                            tt = tf - ti;
                            System.out.println("Proceso :" + tt + "Milisegundos.");
                        break;
                            
                        case 4:
                             ti = System.currentTimeMillis();
                        System.out.println( "Area : " + cir.area() + "cm" );
			System.out.println( "Perimetro : " + cir.perimetro() + "cm" );  
                            tf = System.currentTimeMillis();
                            tt = tf - ti;
                            System.out.println("Proceso :" + tt + "Milisegundos.");
                            break;
                           
                        default:
                            System.out.println("No esta una opcion valida");
             
                }

              
}
}
