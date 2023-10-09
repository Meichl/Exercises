public class Main {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Juve");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Eu");
        a1.setMatri(1111);
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Eu 2");
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();

    }
}