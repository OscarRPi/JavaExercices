import java.util.Scanner;

public class clase_string {
	public static void main(String args[]) {
		System.out.println("Revisando la clase string");
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor ingrese una cadena de texto:");
		String str = sc.nextLine();

		System.out.println(str.length());

		System.out.println(str.substring(1,2));

		int N = 3;
		String int_to_str = "";
		int_to_str = int_to_str.valueOf(N);
		System.out.println(int_to_str);
	}
}