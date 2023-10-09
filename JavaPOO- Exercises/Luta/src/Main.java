public class Main {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Ryu","BR", 24,1.67f, 77.2f,11,2,1 );
        l[1] = new Lutador("Ken", "NA", 25,1.88f,88.9f,16,2,12);
        l[2] = new Lutador("Tesla","EU",22,1.80f, 75f,0,0,1);
        l[3] = new Lutador("Belz","Desconhecido",0,1.75f,70f,0,0,1);
        l[4] = new Lutador("Adam","Desconhecido",100,1.67f,68f,0,1,0);
        l[5] = new Lutador("Zeus","EU",300,1.90f,96.6f,1,0,0);

        Luta UEC = new Luta();
        UEC.marcarLuta(l[0], l[2]);
        UEC.lutar();
        l[0].Status();
        l[2].Status();
    }
}