package dibujos;

public class Triangulo {

    public static void main(String[] args) {

        int numLineas = 5;
        System.out.println("Hacia abajo:");
        for(int i=0; i < numLineas; i++){
            for(int j=i; j < numLineas; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Hacia arriba:");
        for(int i=numLineas; i >= 0; i--){
            for(int j=i; j < numLineas; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
/*
Salida:

Hacia abajo:
* * * * *
* * * *
* * *
* *
*
Hacia arriba:

*
* *
* * *
* * * *
* * * * *

 */
