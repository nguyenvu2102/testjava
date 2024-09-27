package Java;

import javax.swing.JOptionPane;
public class calculate {
    public static void main(String[] args){
        String strNum1, strNum2;
        String strNotification = "You've just entered: ";

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ","Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";
        double num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null,"Please input the second number: ","Input the second number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;
        double num2 = Double.parseDouble(strNum2);
        
        double sum = num1 + num2;
        double different = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Sum of two interger: " + sum, "Sum of two numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Different of two interger: " + different, "Different of two numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Product of two interger: " + product, "Product of two numbers", JOptionPane.INFORMATION_MESSAGE);
        if (num2 == 0){
            JOptionPane.showMessageDialog(null, "Can't proceed 0", "Error", JOptionPane.INFORMATION_MESSAGE);
         }else{
            JOptionPane.showMessageDialog(null, "Quotient of two interger: " + quotient, "Quotient of two numbers", JOptionPane.INFORMATION_MESSAGE);

         }
        System.exit(0);
    }
}