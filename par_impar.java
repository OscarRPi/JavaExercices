import java.util.Scanner;

public class par_impar {
	public static void main(String args[]) {
		System.out.println("Programa que calcula si el numero es par o impar...");

		boolean flag = true;
		boolean par = false;

		while(flag){

			Scanner sc = new Scanner(System.in);
			System.out.println("Por favor ingrese un numero entero mayor que cero:");
			int numero = sc.nextInt();
			if (numero>=0){
				flag = false;
				par=(numero%2==1)?false:true;
				if(par){
					System.out.println("El numero es par");
				}
				else{
					System.out.println("El numero es impar");
				}
			}
			else{
				System.out.println("Escriba un numero mayor o igual que cero");
			}

/*
			if (numero>=0){
				flag = false;
				if (numero%2==1){
					System.out.println("El numero es impar");
				}
				else{
					System.out.println("El numero es par");
				}
			}
			else{
				System.out.println("Escriba un numero mayor o igual que cero");
			}
*/
		}
	}	
}