
import javax.swing.JOptionPane;

public class aprox_sucesivas {

    public void pedirDatos3() {
        int n, i = 1;
        double x0 = 0, xii = 0;

        x0 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor inicial (x0): "));
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero maximo de iteraciones que desea realizar: "));

        System.out.println("Iter.   xi       xi+1 ");
        while (i <= n) {
            xii = g(x0);
            System.out.printf(" " + i + "     %.3f     %.3f %n", x0, xii);
            x0 = xii;
            i++;
        }
    }

    public double g(double x) {
        return (Math.pow(x, 2) + 2) / 4; // funcion f(x) presentada en la exposicion
    }
}
