import java.util.Scanner;
import java.io.*;

public class oscar {
	public static void main(String args[]) throws IOException {
		System.out.println("Hello world");

		//Primera forma de leer de consola
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor ingrese su nombre");
		String nombre = sc.nextLine();

		//Segunda forma de leer de consola (Con excepcionIO)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Por favor ingrese su nombre");
		String nombre2 = br.readLine();

		System.out.println("Bienvenido "+ nombre + " " + nombre2);
	}
}