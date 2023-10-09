public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Michel", 21, "M");
        Livro l1 = new Livro("O nome do vento","Esqueci", 512,p1);
        System.out.println(l1.detalhes());
        l1.abrir();
        l1.avancarPag();
        System.out.println(l1.detalhes());
        l1.folhear(530);
        System.out.println(l1.detalhes());
    }
}