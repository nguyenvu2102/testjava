package Java;

import javax.swing.JOptionPane;
public class solve_equa {
    public static String solveLinearEquation(double a, double b) {
        if(a==0) {
            return "No solution";
        }else if (b == 0){
            return "Infinite solutions";
        }
        return "Solution: x = " + (-b / a);
    }
    public static String solveLinearsystem(double a11, double a12, double b1, double a21, double a22, double b2) {
        double D = a11 * a22 - a21 * a12; 
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0){
            double x1 = D1 / D;
            double x2 = D2/D;
            return "Solution: x1 = " + x1 + ", x2 = " + x2;
        }
        return null;
    }
    public static String solveQuadratic(double a, double b, double c) {
        if (a==0){
            return solveLinearEquation(b, c);
        }
        double delta = b * b + 4 * a * c;
        if (delta < 0){
           return "No solution";
        }else if( delta == 0){
            double root = -b / (2 * a);
            return "x1 = x2 = " + root;
        }else{
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "Solution: x1 = " + root1 + ", x2 = " + root2;
        }
    }

public static void main(String[] args) {
    String[] options = { "Linear equation", "Linear System", "Quadratic equation"};
    int choice = JOptionPane.showOptionDialog(null, "Choose type of equation:", "Equation Solve", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

    switch (choice){
        case 0:
            double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a: "));
            double b = Double.parseDouble(JOptionPane.showInputDialog("Enter: b "));
            JOptionPane.showMessageDialog(null, solveLinearEquation(a, b));
            break;

        case 1:
            double a11 = Double.parseDouble(JOptionPane.showInputDialog("Enter a11: "));
            double a12 = Double.parseDouble(JOptionPane.showInputDialog("Enter a12: "));
            double a21 = Double.parseDouble(JOptionPane.showInputDialog("Enter a21: "));
            double a22 = Double.parseDouble(JOptionPane.showInputDialog("Enter a22: "));
            double b1 = Double.parseDouble(JOptionPane.showInputDialog("Enter b1: "));
            double b2 = Double.parseDouble(JOptionPane.showInputDialog("Enter b2: "));
            JOptionPane.showMessageDialog(null, solveLinearsystem(a11, a12, b1, a21, a22, b2));
            break;

        case 2:
            double aquad= Double.parseDouble(JOptionPane.showInputDialog("Enter a: "));
            double bquad = Double.parseDouble(JOptionPane.showInputDialog("Enter b: "));
            double cquad = Double.parseDouble(JOptionPane.showInputDialog("Enter c: "));
            JOptionPane.showMessageDialog(null, solveQuadratic(aquad, bquad, cquad));
            break;

        }
    }
}

