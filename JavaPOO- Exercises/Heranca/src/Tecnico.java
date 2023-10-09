public class Tecnico extends Aluno{
    private boolean registro;

    public boolean isRegistro() {
        return registro;
    }

    public void setRegistro(boolean registro) {
        this.registro = registro;
    }
    public void praticar(){
        System.out.println("Aluno realizou aulas praticas");
    }
}
