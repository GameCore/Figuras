
package figuras;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class Rectangulo extends Figuras{
    private double base;
    private double altura;
    
    public double area(){
        tipo = "Rectangulo";
        Scanner lee = new Scanner( System.in );
		System.out.print( "Escribe la base del " + tipo + " en centimetros :");
		base = lee.nextDouble();
                System.out.print( "Escribe la altura del " + tipo + " en centimetros :");
		altura = lee.nextDouble();
		double resultado = base * altura;
		return super.area() + resultado;
	}

	public double perimetro(){
		double resultado = base * 2 + altura * 2;
		return super.perimetro() + resultado;
	}
        
public double tiempoProc(){
		return super.tiempoProc(); 
	} 
    
}
