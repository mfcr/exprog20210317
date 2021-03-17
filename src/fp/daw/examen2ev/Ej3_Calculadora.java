package fp.daw.examen2ev;

import java.awt.datatransfer.SystemFlavorMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		String palabras[]=s.nextLine().trim().split(" ");
		if (palabras.length!=3) {
			System.out.println("Ha de introducir numero-espacio-operador-numero. Error de datos");
		} else {

			double n1;
			double n2;
			String oper=palabras[1];
			try {
				//Control de introducción de números correcto
				n1=Double.parseDouble(palabras[0]);
				n2=Double.parseDouble(palabras[2]);
				//Control de introduccion de operador ok.
				switch(oper) {
				case "+":
					System.out.println("El resultado es "+(n1+n2));	break;
				case "-":
					System.out.println("El resultado es "+(n1-n2));	break;
				case "*":
					System.out.println("El resultado es "+(n1*n2));	break;
				case "/":
					System.out.println("El resultado es "+(n1/n2));	break;
				default:
					System.out.println("El operador es incorrecto."); 
				}
			} catch (NumberFormatException e) {
				System.out.println("Alguno de los números introducidos no es correcto.");
			} catch (Exception e) {
				System.out.println("El operador no es correcto.");
			}
		}
		s.close();
	}
				
		
}
