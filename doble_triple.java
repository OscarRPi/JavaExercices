import java.util.Scanner;

public class doble_triple {
	public static void main(String args[]) {
		System.out.println("Programa que calcula el doble y triple del numero...");
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor ingrese un numero entero:");
		int numero = sc.nextInt();

		int doble = numero * 2;
		int triple = numero * 3;
		
		System.out.println("El doble es: "+doble);
		System.out.println("El triple es: "+triple);
	}	

}