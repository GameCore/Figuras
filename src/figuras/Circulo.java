
package figuras;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */

public class Circulo extends Figuras{
    private double radio;

	public double area(){
            tipo = "Circulo";
		Scanner lee = new Scanner( System.in );
		System.out.print( "Escribe el radio del " + tipo + " en centimetros :");
                radio = lee.nextDouble();
		double resultado = Math.PI * Math.pow( radio, 2 );
		return resultado + super.area() ; 
	}

	public double perimetro(){
		double resultado = Math.PI * (radio + radio) ;
		return super.perimetro() + resultado;
	}
    public double tiempoProc(){
		return super.tiempoProc(); 
	} 
}
