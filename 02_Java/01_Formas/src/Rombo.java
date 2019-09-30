import java.util.Scanner;

public class Rombo {

    public static void main(String[] args)	{

        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int i, j, k;
        // Si el valor recibido es par, le añadimos uno

        if (max % 2 == 0) {
            max+=1;
        }

        // parte superior del rombo
        for (i = 1; i <= max; i = i + 2){
            // Añadimos los espacios necesarios delante de cada linea
            for (k = max + 1; k >= i; k = k - 2) {
                System.out.print("  ");
            }

            // Mostramos los asteriscos
            for (j = 0; j < i; j++)	{
                System.out.print("* ");
            }

            System.out.println();
        }
        // parte inferior del rombo

        for (i = max; i >= 1; i = i - 2){
            // Añadimos los espacios necesarios delante de cada linea
            for (k = i; k <= max + 2; k = k + 2)			{
                System.out.print("  ");
            }
            // Mostramos los asteriscos
            for (j = i - 2; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
Salida:
        *
      * * *
    * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
 */