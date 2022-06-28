import java.util.Scanner;

public class clase_math {
	public static void main(String args[]) {
		System.out.println("Revisando la clase Math");

		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor ingrese un numero entero mayor que cero:");
		int numero = sc.nextInt();

		System.out.println(Math.PI);

		System.out.println(Math.abs(numero));

		System.out.println(Math.sin(numero));

		System.out.println(Math.cos(numero));

		System.out.println(Math.tan(numero));

		System.out.println(Math.exp(numero));

		System.out.println(Math.log(numero));

		System.out.println(Math.pow(numero,3));

		System.out.println(Math.round(numero));

		System.out.println(Math.floor(numero));

		System.out.println(Math.ceil(numero));

	}
}