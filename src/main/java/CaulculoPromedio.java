//Este programa saca el promedio de la calificacion de 10 estudiantes
import java.util.Scanner;

public class CaulculoPromedio {

    public static void main(String[] args) {
        int estudiante = 1;
        int calificacion;
        double suma = 0;
//        se inicializa en cero porque se ira sumando con cada entrada de calificacion
        Scanner input = new Scanner(System.in);
//       input es el objeto para poder almacenar las variables que entran por el teclado
        while (estudiante <= 10) {
            System.out.println("Ingresa la calificacion del estudiante: " + estudiante);
            calificacion = input.nextInt();
            estudiante++;
            suma = suma +calificacion;
//            suma+= calificacion;
//    +=	Suma y asignación	a += b (a=a + b)
        }
        System.out.println("El promedio de la calificiacion es "+ (suma/100));
    }

}
