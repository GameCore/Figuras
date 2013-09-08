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
public class Triangulo extends Figuras{

private double base;
private double altura;

	public double area(){
            
            tipo = "Triangulo";
		Scanner lee = new Scanner( System.in );
		System.out.print( "Escribe la base del " + tipo + " en centimetros :");
		base = lee.nextDouble();
                System.out.print( "Escribe la altura del " + tipo + " en centimetros :");
		altura = lee.nextDouble();
		double resultado = ( base * altura ) / 2;
		return  resultado += super.area() ;

	} 

	public double perimetro(){
		double resultado = base * 3;
		return resultado += super.perimetro();
	}

	/* public double tiempoProc(){
		return super.tiempoProc() + ;
	} */
}
