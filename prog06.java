import javax.swing.*;

class prog06 {
    public static void main (String entrada[]) {
        int n1, n2, p = 1;
        char op = 0;
        String msg = "", msgEntr = "Digite 1 para produto\nDigite 2 para produtória";

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite Outro número inteiro"));
        op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);

        switch (op) {
            case '1':
            {
                if (n1 > 0 && n2 > 0)
                {
                    p = n1 * n2;                  
                }
                msg = msg + "O produto de " + n1 + " por " + n2 + " = " + p;
                break;
            }
            case '2':
            {
                for(int i = 1; i <= n2; i++)
                {
                    p = p * n1;               
                }
                msg = msg + "A produtória de " + n1 + " pela quantidade de " + n2 + " = " + p;
                break;
            }
            default: JOptionPane.showMessageDialog(null, "Opcao inválida, cálculos nao realizados");
        }
        JOptionPane.showMessageDialog(null, msg);
        System.exit(0);
    }
}
