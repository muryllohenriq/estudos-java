import javax.swing.*;

class Swing2 {
    public static void main (String entrada[]) {
        
        int n1, n2;
        double quo, pot;
        String msg = "";

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro", "Entrada de dados"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro", "Entrada de dados"));

        quo = n1 / n2;
        pot = Math.pow(n1, n2);

        msg = msg + "O quociente da divisão de " + n1 + " por " + n2 + " é igual a " + quo + "\n";
        msg = msg + "A potencia de " + n1 + " por " + n2 + " é igual a " + pot;
        JOptionPane.showMessageDialog(null, msg);

        System.exit(0);
    }
}
