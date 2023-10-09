public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru ca = new Canguru();
        Cachorro cach = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga tar = new Tartaruga();
        GoldFish gf = new GoldFish();
        Arara ar = new Arara();

        ca.locomover();
        cach.locomover();
        cach.emitirSom();
        ca.emitirSom();

    }
}