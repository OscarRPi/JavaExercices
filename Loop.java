// Programa Java para ilustrar el bucle for.
public class Loop
{
    public static void main(String args[])
    {
        for (int x = 2; x <= 4; x++)
            System.out.println("Valor de x: " + x);

        String array[] = {"Ron", "Harry", "Hermoine"};

        for (String x:array)
        {
            System.out.println(x);
        }

        /*bucle for para la misma función
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
        */

        int x = 0;
        do
        {
            //El código dentro del do se imprime incluso
            //si la condición es falsa
            System.out.println("Valor de x :" + x);
            x++;
        }
        while (x < 20);

    }
}