package grupos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Grupos {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {

            System.out.println("=================================================== <[Entrada]> ==================================================");
            System.out.print("Escriba el numero de participantes en el \"Grupo pequeño\": ");
            int participantes = scan.nextInt();

            int conexiones = participantes - 1;
            int relaciones = participantes * conexiones;

            System.out.println("=================================================== <[Salida]> ===================================================");
            if (participantes <= 2) {
                System.out.println("Necesitas mas personas para considerarse un grupo pequeño, por el momento solo son " + participantes);
            } else if (participantes <= 12) {
                System.out.println("En un grupo de " + participantes + " participantes, existen " + relaciones + " relaciones en total\nCada uno debe formar " + conexiones + " relaciones con los demas");
            } else if (participantes <= 15) {
                System.out.println("Un grupo de " + participantes + " participantes, ya es un poco grande, pero aun se concidera \"Grupo pequeño\"  \nTiene un total de " + relaciones
                        + " relaciones \nCada uno debe formar " + conexiones + " relaciones con los demas");
            } else {
                System.out.println("El grupo ya es demaciado grande, debe dividirlo en mas grupos\nYa que un grupo con " + participantes + " participantes ya no es considerado un grupo pequeño\n"
                        + "El tamaño ideal de un grupo queño es menor a doce, aunque de 15 todavia es considerado un grupo pequeño\n"
                        + "cada participantes tendria que formar " + conexiones + " con los demas participantes y el total de relaciones es de " + relaciones);
            }
            System.out.println("==================================================================================================================");

        } catch (InputMismatchException e) {
            System.out.println("=================================================== <[Error]> ====================================================");
            System.err.println("Error, solo se admiten numeros");
            System.out.println("==================================================================================================================");
        }
    }

}
