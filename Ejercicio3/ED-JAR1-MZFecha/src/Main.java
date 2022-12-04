import java.util.Scanner;

public class Main {

        static Scanner sc;

        public static void main(String[] args) {
            int dia = 0;
            int mes = 0;
            int anyo = 0;
            int eleccion;

            sc = new Scanner(System.in);
            MZFecha Fecha = new MZFecha(1, 1, 2000);
            MZFecha Fecha2 = new MZFecha(1, 1, 2000);
            do {
                System.out.println("Elija un número para ejecutar un ejercicio.");
                System.out.println("\t1. Fijar Fecha");
                System.out.println("\t2. Escribir Fecha");
                System.out.println("\t3. Diferencia Fecha");
                System.out.println("\t4. Salir");

                eleccion = sc.nextInt();
                sc.nextLine(); //borrar buffer
                switch (eleccion) {
                    case 1:
                        System.out.println("Indique un dia");
                        Fecha.setDia(sc.nextInt());
                        System.out.println("Indique un mes");
                        Fecha.setMes(sc.nextInt());
                        System.out.println("Indique un año");
                        Fecha.setAnyo(sc.nextInt());
                        break;
                    case 2:
                        System.out.println("La fecha indicada es: " + Fecha.getDia() + "/" + Fecha.getMes() + "/" + Fecha.getAnyo());
                        break;

                    case 3:
                        System.out.println("Indique primera fecha");
                        System.out.println("Indique un dia");
                        Fecha.setDia(sc.nextInt());
                        System.out.println("Indique un mes");
                        Fecha.setMes(sc.nextInt());
                        System.out.println("Indique un año");
                        Fecha.setAnyo(sc.nextInt());

                        System.out.println("Indique una segunda fecha");
                        System.out.println("Indique un dia");
                        Fecha2.setDia(sc.nextInt());
                        System.out.println("Indique un mes");
                        Fecha2.setMes(sc.nextInt());
                        System.out.println("Indique un año");
                        Fecha2.setAnyo(sc.nextInt());

                        if (Fecha.getDia() > Fecha2.getDia()){
                            dia = Fecha.getDia() - Fecha2.getDia();
                        } else {
                            dia = Fecha2.getDia() - Fecha.getDia();
                        }

                        if (Fecha.getMes() > Fecha2.getMes()) {
                            mes = Fecha.getMes() - Fecha2.getMes();
                        } else {
                            mes = Fecha2.getMes() - Fecha.getMes();
                        }

                        if (Fecha.getAnyo() > Fecha2.getAnyo()){
                            anyo = Fecha.getAnyo() - Fecha2.getAnyo();
                        } else {
                            anyo = Fecha2.getAnyo() - Fecha.getAnyo();
                        }
                        System.out.printf("La diferencia es de " + dia + " dia/s " + mes + " mes/es " + anyo + " año/s");


                    case 4:
                        System.out.println("Sayonara");
                        break;

                }
            } while (eleccion != 4);
    }
}