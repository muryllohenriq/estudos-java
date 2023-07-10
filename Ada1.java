import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

public class Ada1 {
    public static void main(String[] args) {
        
        Cachorro cachorro1 = new Cachorro("Rex", "Preto", 180, 50.7, 60, "nada");
        Gato gato1 = new Gato("betim", "Cinza", 4.7);
        Passaro passaro1 = new Passaro("calopsita", "Preta", 10.7);

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();
    }
}
