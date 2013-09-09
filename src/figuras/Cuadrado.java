

package figuras;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Cuadrado extends Figuras{
    private  double lado;


	public double area (){
		tipo = "Cuadrado";
		Scanner lee = new Scanner( System.in );
		System.out.print( "Escribe el lado del " + tipo + " en centimetros :");
		lado = lee.nextDouble();
		double resultado = lado * lado;
		return  resultado += super.area() ;
	}

	public double perimetro(){
		double resultado = lado * 4;
		return resultado += super.perimetro();
	}

	public double tiempoProc(){

		return super.tiempoProc(); 
        }
    
}
