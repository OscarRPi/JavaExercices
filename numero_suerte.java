import java.util.Scanner;

public class numero_suerte {
	public static void main(String args[]) {

		Boolean flag = true;
		int año = 0;
		int mes = 0;
		int dia = 0;

		while(flag){
			Scanner sc = new Scanner(System.in);
			System.out.println("Por favor ingrese su año de nacimiento:");
			año = sc.nextInt();
			if((año>0)&(año<2023)){
				flag=false;
			}
			else{
				System.out.println("Escriba un numero entero entre 0 y 2022");
			}
		}

		flag = true;

		while(flag){
			Scanner sc = new Scanner(System.in);
			System.out.println("Por favor ingrese su mes de nacimiento:");
			mes = sc.nextInt();
			if((mes>0)&(mes<13)){
				flag=false;
			}
			else{
				System.out.println("Escriba un numero entero entre 0 y 12");
			}
		}

		flag = true;

		while(flag){
			Scanner sc = new Scanner(System.in);
			System.out.println("Por favor ingrese su dia de nacimiento:");
			dia = sc.nextInt();
			if((dia>0)&(dia<32)){
				flag=false;
			}
			else{
				System.out.println("Escriba un numero entero entre 0 y 31");
			}
		}

		int numero_suerte = año + mes + dia;
		int sum_parcial = numero_suerte;
		int cuenta = numero_suerte;
		int num = 0;

		while(cuenta >0){

			if (cuenta<10){
				num += cuenta;
				cuenta = 0;
			}
			else{
				cuenta = numero_suerte/10;
				num += numero_suerte - (cuenta*10);
				numero_suerte = cuenta;
			}
			
		}

		System.out.println("El numero de su suerte es: "+num);
		System.out.println("La suma parcial fue: "+sum_parcial);
	}
}