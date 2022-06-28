import java.util.Scanner;

public class restador_digitos {
	public static void main(String args[]) {
		System.out.println("Programa que quita los digitos introducidos...");

		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor ingrese el numero a tratar:");
		Integer numero = sc.nextInt();

		Boolean flag = true;

		String num = numero.toString();
		int l = num.length();

		int quitar = 0;

		while(flag)
		{
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Por favor ingrese la cantidad de digitos a quitar:");
			quitar = sc2.nextInt();

			if (l<quitar){
				System.out.println("La cantidad de digitos a quitar es mayor que la cantidad de digitos del numero:");
			}
			else{
				flag = false;
			}
		}

		int count = quitar;

		while(count>0){
			numero/=10;
			count--;
		}
	
		System.out.println("Su nuevo numero es: "+numero);
	}
}