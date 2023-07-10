package Animais;

public class Passaro extends Animal {

    public Passaro(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    static int numeroDePassaros;

    @Override
    public void soar() {
        System.out.println("PIU!");
    }
}
