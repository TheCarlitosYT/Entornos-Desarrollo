import es.iesmz.prueba.Coche;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

        static Scanner sc;

        public static void main(String[] args) {

            int eleccion;
            Coche Coche1 = new Coche("Honda", "Azure","Blanco");

            sc = new Scanner(System.in);
            do {
                System.out.println("Elija un número para ejecutar un ejercicio.");
                System.out.println("\t1 a 9. Ejercicios nivel Jedi (Ejercicios 1 - 9)");
                System.out.println("\t10 a 16. Ejercicios nivel Jedi (Ejercicios 10 - 16)");
                System.out.println("\t17. Salir");

                eleccion = sc.nextInt();
                sc.nextLine(); //borrar buffer
                switch (eleccion) {
                    case 1:
                        System.out.print(Coche1);
                        break;
                    case 2:
                        System.out.println("La velocidad es:");
                        System.out.println(Coche1.getVelocidad());
                        break;
                    case 3:
                        System.out.println("Indique Marca de coche");
                        Coche1.setMarca(sc.next());
                        break;
                    case 4:
                        System.out.println("Indique modelo");
                        Coche1.setModelo(sc.next());
                        break;
                    case 5:
                        System.out.println("De que color quieres el coche");
                        Coche1.setColor(sc.next());
                        break;
                    case 6:
                        System.out.println("Indique la velocidad");
                        Coche1.setVelocidad(sc.nextInt());
                        break;

                    case 7:
                        System.out.println("Coche parado");
                        Coche1.setVelocidad(0);
                        break;


                    case 8:
                        System.out.println("Sayonara Baby");
                        break;

                }
            } while (eleccion != 8);
        }
    }
