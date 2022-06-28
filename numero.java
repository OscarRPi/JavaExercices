import java.util.Scanner;

public class numero {

	public static void main(String args[]) {
		System.out.println("Programa que calcula cantidad de cifras...");
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor ingrese un numero entero:");
		int numero = sc.nextInt();

		int Digitos = numeroDigitos(numero);

		if (Digitos == 0){
			Digitos += 1;
			System.out.println("Su numero tiene "+Digitos+" digitos");	
			System.out.println("Pero su numero es 0");	
		}
		else{
			System.out.println("Su numero tiene "+Digitos+" digitos");
		}
		
	}

	public static int numeroDigitos(int numero){
		
		int cifras = 0;

		if(numero==0){
			cifras = 0;
		}
		
		else{
			while(numero!=0){
				numero=numero/10;
				cifras++;	
			}
		}
		return cifras;
	}
}