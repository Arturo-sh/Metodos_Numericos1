
import javax.swing.JOptionPane;

public class biseccion {

    public void pedirDatos2() {
        int i = 1, n = 0;
        double xa = 0, xb = 0, xr = 0, xrold = 0, fxa, fxr, ea = 0, test;

        xa = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor XA: "));
        xb = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor XB: "));
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero maximo de iteraciones que desea realizar: "));

        if (f(xa) * f(xb) > 0) {
            JOptionPane.showMessageDialog(null, "No se puede aplicar el Metodo de Biseccion del Intervalo\nPorque f(" + (int) xa + ") y f(" + (int) xb + ") tienen el mismo signo");
        } else {
            System.out.println("Iter.  XA     XB     XR    F(XA)    F(XR)    F(XA)*F(XR)   ER");
            while (i <= n) {
                xr = (xa + xb) / 2;
                fxa = f(xa);
                fxr = f(xb);
                test = fxa * fxr;
                if (i == 1) {
                    ea = 0;
                } else {
                    ea = Math.abs((xr - xrold) / xr) * 100;
                }
                xrold = xr;
                System.out.printf(" " + i + "    %.2f   %.2f   %.2f   %.2f    %.2f        %.2f      %.2f %n", xa, xb, xr, fxa, fxr, test, ea);
                if (test < 0) {
                    xb = xr;
                } else {
                    xa = xr;
                }
                i++;
            }
        }
    }

    public double f(double x) { //Para obtener los resultados de una funcion f(x) determinada, debemos de declararla dentro de esta funcion
//        return Math.pow(x, 4) + (3 * Math.pow(x, 3)) - 2; // Esta es la primera funcion f(x) vista en clase
//        return (4 * Math.pow(x, 2)) - 5 * x; // Esta es la segunda funcion f(x) vista en clase
//        return Math.pow(x, 10) - 5; // Esta es la tercera funcion f(x) vista en clase
        return Math.pow(x, 10) - 1; // Esta es la cuarta funcion f(x) vista en clase
    }
}