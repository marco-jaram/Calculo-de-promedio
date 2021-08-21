//Este programa saca el promedio de la calificacion de 10 estudiantes

import java.util.Scanner;

public class CaulculoPromedio {

    public static void main(String[] args) {
        int estudiante = 1;
        int calificacion;
        double suma = 0;
        Scanner input = new Scanner(System.in);
        while (estudiante <= 10) {
            System.out.println("Ingresa la calificacion del estudiante: " + estudiante);
            calificacion = input.nextInt();
            if (calificacion <= 100 && calificacion >= 0) {
                estudiante++;
                suma = suma + calificacion;
            } else {
                System.out.println("Ingresa la calificacion del estudiante en un rango del 0 - 100: ");
            }
        }
        System.out.println("El promedio de la calificiacion es " + (suma / 100));
    }

}
