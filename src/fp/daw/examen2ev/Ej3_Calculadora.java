package fp.daw.examen2ev;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Ej3_Calculadora {
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("calculadora > ");
		String linea;
		while (!(linea=in.readLine()).equalsIgnoreCase("fin")) {
			calcular(linea);
			System.out.print("calculadora > ");
		}
	}
	static void calcular(String linea) {
		Scanner s=new Scanner(linea);
		try {
			//Nota: HAY QUE INTRODUCIR LOS DECIMALES CON COMA Y NO CON PUNTO PARA QUE LOS RECONOZCA COMO N�MEROS.
			double n1=s.nextDouble();
			String oper=s.next("[\\+\\-\\*/]").trim();
			double n2=s.nextDouble();
				
			switch(oper) {
			case "+":
				System.out.println("El resultado es "+(n1+n2));	break;
			case "-":
				System.out.println("El resultado es "+(n1-n2));	break;
			case "*":
				System.out.println("El resultado es "+(n1*n2));	break;
			case "/":
				System.out.println("El resultado es "+(n1/n2));	break;
			}
		} catch (InputMismatchException e) {
			//Tanto nextDouble como next de Scanner arrojan InputMismatchException.
			// Si quisiesemos separar los errores habr�a quee hacer 3 bloques try catch capturando
			// la excepcion InputMismatchExcxetion y en funci�n del try correspondiente habr�a que
			// enviar un mensaje u otro al usuario.
			System.out.println("Alguno de los n�meros o el operador introducidos no son correctos.");
		} catch (Exception e) {
			System.out.println("Ha habido otro error"+e.getClass());
		}
		s.close();
	}
				
		
}
