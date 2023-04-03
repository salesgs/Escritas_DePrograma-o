package arithmeticException;

import javax.swing.*;

public class Program {
    public static void main(String[] args) {
        int number;
        int divsion;
        number = Integer.parseInt(JOptionPane.showInputDialog("Enter number"));
        divsion = number / 0;
        System.out.println(divsion);


    }
}

