package nuevomayor;

import java.util.Scanner;

public class NuevoMayor {

	public static void main(String[] args) {
		int edad;
		boolean mayorEdad;
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca su edad: ");
		edad = sc.nextInt();
		
		mayorEdad = edad >=18;
		
		System.out.println("Usted es mayor de edad: " + (edad>=18));
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
