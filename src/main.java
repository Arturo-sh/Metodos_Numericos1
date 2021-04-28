
/** *******************************************************************
 *    Programa para la resolucion de ecuaciones (Metodos numericos)   *
 *    Fecha: 28-Abril-2021    hora: 15:30                             *
 *    Autor: Arturo Salas Hernández                                   *
 ******************************************************************** */
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        int opc = 0;
        char salida;
        try {
            do {
                do {
                    opc = Integer.parseInt(JOptionPane.showInputDialog(null, "## MENÚ ##\n"
                            + "1.- Método de Intervalos\n"
                            + "2.- Método de Bisección\n"
                            + "3.- Método de Aproximaciones Sucesivas\n"
                            + "\n"
                            + "Selecciona una opcion del menú: ")
                    );
                } while (opc < 1 || opc > 3);

                switch (opc) {
                    case 1:
                        intervalos objeto1 = new intervalos();
                        objeto1.pedirDatos1();
                        break;

                    case 2:
                        biseccion objeto2 = new biseccion();
                        objeto2.pedirDatos2();
                        break;

                    case 3:
                        aprox_sucesivas objeto3 = new aprox_sucesivas();
                        objeto3.pedirDatos3();
                        break;
                }

                salida = JOptionPane.showInputDialog(null, "Desea seguir usando el programa? (s/n): ").charAt(0);

                if (salida != 's' || salida != 'S') {
                    JOptionPane.showMessageDialog(null, "Gracias por usar este software :) ");
                }
            } while (salida == 's' || salida == 'S');
        } catch (NumberFormatException e) {
            System.err.println("Excepcion de tipo: " + e);
        } finally {
            System.out.println("Programa finalizado con exito!");
        }
    }
}
