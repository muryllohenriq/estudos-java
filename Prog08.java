import javax.swing.*;

class Prog08 {
    public static int soma (int x, int y[]) {
        int r = 0;

        while (x < y.length) {
            r = r + y[x];
            x++;
        }

        return r;
    }

    public static int produto (int x, int y[]) {
        int r = 1;

        while (x < y.length) {
            r = r * y[x];
            x++;
        } 

        return r;
    }

    public static void main (String entrada[]) {
        int indice = 0, vet[] = {1, 2, 3, 4, 5};
        
        
        int result1 = soma(indice, vet);
        int result2 = produto(indice, vet);

        JOptionPane.showMessageDialog(null, "Os resultados da somatoria e produtoria respectivamente são " + result1 + " e " + result2);
    }
}
