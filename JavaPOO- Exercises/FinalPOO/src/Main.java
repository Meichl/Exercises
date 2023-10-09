public class Main {
    public static void main(String[] args) {
        Video v[] = new Video [3];
        v[0] = new Video ("Aula POO");
        v[1] = new Video("Aula JS");
        v[2] = new Video("Aula CSS");

        Inscrito i1 = new Inscrito("Jub",15, "M", "jub123");

        System.out.println(v[0].toString());
        System.out.println(i1.toString());

        Visualizacao vis[] = new Visualizacao[1];
        vis[0] = new Visualizacao(i1, v[0]);
        vis[0].avaliar(100.0f);
        System.out.println(vis[0].toString());
    }
}