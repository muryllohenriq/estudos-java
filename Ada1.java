import Animais.Cachorro;

public class Ada1 {
    public static void main(String[] args) {
        
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro("Puppy", "Preto", 180, 50.7, 60, "nada");

        System.out.println(cachorro1.getNumeroDeCachorros());
        
        Cachorro cachorro3 = new Cachorro("Rex", "Preto", 180, 50.7, 60, "nada");

        System.out.println(cachorro2.getNumeroDeCachorros());
        System.out.println(cachorro1.getNumeroDeCachorros());

        System.out.println(cachorro2.toString());
        System.out.println(cachorro3.toString());
        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getPeso());
        System.out.println("O cachorro está " + cachorro1.interagir("dormir"));
        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro está " + cachorro1.interagir(""));
    }
}
