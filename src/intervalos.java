
import javax.swing.JOptionPane;

public class intervalos {

    public void pedirDatos1() {
        int A = 0, B = 0, opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "**Menu**\n"
                    + "1.- Intervalo Cerrado = []\n"
                    + "2.- Intervalo Abierto = ()\n"
                    + "3.- Intervalo semiabierto por la izquierda = (]\n"
                    + "4.- Intervalo semiabierto por la derecha = [)\n"
                    + "5.- Intervalo Infinito por la izquierda\n"
                    + "6.- Intervalo Infinito por la derecha\n"
                    + "Selecciona una opcion del menu: "));
            if (opcion <= 0 || opcion > 6) {
                JOptionPane.showMessageDialog(null, "Opcion fuera del menu\nIntentelo de nuevo");
            }
        } while (opcion <= 0 || opcion > 6);

        if (opcion >= 1 && opcion <= 4) {
            do {
                A = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor inicial del intervalo (valor de A): "));
                B = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor final del intervalo (valor de B): "));
                if (A > B || A == B) {
                    JOptionPane.showMessageDialog(null, "El valor de A no debe ser mayor al valor de B y tampoco deben de ser iguales\nIntentelo de nuevo");
                }
            } while (A > B || A == B);

            grafica(A, B, opcion);
        } else {
            A = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor inicial del intervalo (valor de A): "));
            infinito(A, opcion);
        }
    }

    public void grafica(int A, int B, int opc) {
        char izq = 0, der = 0;
        
        switch (opc) {
            case 1:
                izq = der = '•';
                break;
            case 2:
                izq = der = 'o';
                break;
            case 3:
                izq = 'o';
                der = '•';
                break;
            case 4:
                izq = '•';
                der = 'o';
                break;
            default:
                System.out.println("Algo salio mal :( ");
                break;
        }
        
        System.out.println("\nGrafica:");
        for (int j = 0; j < 3; j++) {
            for (int i = A - 1; i <= B + 1; i++) {
                if (j == 0) {
                    if (i == A) {
                        System.out.print(" A");
                    } else if (i == B) {
                        System.out.print(" B");
                    } else {
                        System.out.print(" " + i);
                    }
                }
                if (j == 1) {
                    if (i == A - 1) {
                        System.out.print("<-");
                    } else if (i == B + 1) {
                        System.out.print("-> X");
                    } else {
                        System.out.print("---");
                    }
                }
                if (j == 2) {
                    if (i == A) {
                        System.out.print(" " + izq);
                    } else if (i == B) {
                        System.out.print(" " + der);
                    } else {
                        System.out.print(" " + i);
                    }
                }
            }
            System.out.println();
        }
    }

    public void infinito(int A, int opc) {
        int fin;
        char marca = '•';

        switch (opc) {
            case 5:
                fin = A - 8;
                System.out.println("\nGrafica:");
                for (int j = 0; j < 3; j++) {
                    for (int i = fin; i <= A + 1; i++) {
                        if (j == 0) {
                            if (i == A) {
                                System.out.print(" A");
                            } else {
                                System.out.print(" " + i);
                            }
                        }
                        if (j == 1) {
                            if (i == fin) {
                                System.out.print("<-");
                            } else if (i == A + 1) {
                                System.out.print("-> X");
                            } else {
                                System.out.print("---");
                            }
                        }
                        if (j == 2) {
                            if (i == A) {
                                System.out.print(" " + marca);
                            } else {
                                System.out.print(" " + i);
                            }
                        }
                    }
                    System.out.println();
                }
                break;
            case 6:
                fin = A + 8;
                System.out.println("\nGrafica:");
                for (int j = 0; j < 3; j++) {
                    for (int i = A - 1; i <= fin; i++) {
                        if (j == 0) {
                            if (i == A) {
                                System.out.print(" A");
                            } else {
                                System.out.print(" " + i);
                            }
                        }
                        if (j == 1) {
                            if (i == A - 1) {
                                System.out.print("<-");
                            } else if (i == fin) {
                                System.out.print("-> X");
                            } else {
                                System.out.print("---");
                            }
                        }
                        if (j == 2) {
                            if (i == A) {
                                System.out.print(" " + marca);
                            } else {
                                System.out.print(" " + i);
                            }
                        }
                    }
                    System.out.println();
                }
                break;
        }
    }
}