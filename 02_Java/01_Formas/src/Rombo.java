import java.util.Scanner;

public class Rombo {

	public static void main(String[] args) {
		int num = 6;
		if (num % 2 == 0) {
			num++;
		}

		for (int i = 0; i < num; i += 2) {
			for (int j = i + 2; j < num; j += 2) {
				System.out.print("  ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = num; i > 1; i -= 2) {
			for (int j = num + 2; j > i; j -= 2) { // #
				// for (int j = max; j > i; j = j - 2) {
				System.out.print("  ");
			}
			for (int k = i - 2; k > 0; k--) { // #
				// for (int k = i; k > 0; k--) {
				System.out.print("* ");
			}
			System.out.println();
			/* # -> Elimina las primera linea */
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