public class Peixe extends Animal{
    private String corPeixe;
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    public String getCorPeixe() {
        return corPeixe;
    }

    public void setCorPeixe(String corPeixe) {
        this.corPeixe = corPeixe;
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    public void soltarBolha(){
        System.out.println("Soltando bolha");
    }
}
