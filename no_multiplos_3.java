import java.util.Scanner;

public class no_multiplos_3 {
	public static void main(String args[]) {
		System.out.println("Programa que muestra los no multiplos de 3...");

		/*
		for (int i = 0; i < 101; i++)
        {	
        	double num = (double)i;
        	double val = 0.;

        	val = (num/3.0) - (Math.floor(num/3.0));

        	if (val != 0.0){
        		System.out.println(i);
        	}
            
        }
        */

        int i = 0;

        do
        {
            double num = (double)i;
        	double val = 0.;

        	val = (num/3.0) - (Math.floor(num/3.0));

        	if (val != 0.0){
        		System.out.println(i);
        	}
        	i++;
        }

        while (i < 101);

	}
}