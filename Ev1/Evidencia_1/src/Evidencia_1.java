import java.util.Scanner;
public class Evidencia_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = "";
		double a = 0;
		double b = 0;
		
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Ingresa tu nombre");
	    nombre = reader.nextLine();				
		System.out.println("Ingresa un numero entero");
		a = reader.nextInt();	
		System.out.println("Ingresa un numero decimal");
		b = reader.nextDouble();
		
		System.out.println("Hola " +nombre+" el resultado es: " + (a+b));
		
	}

}
