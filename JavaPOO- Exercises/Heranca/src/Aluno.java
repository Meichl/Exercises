public class Aluno extends Pessoa{
    private int matri;
    private String curso;

    public int getMatri() {
        return matri;
    }

    public void setMatri(int matri) {
        this.matri = matri;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void pagarMensalidade(){
        System.out.println("Mensalidade paga do aluno: " + this.getNome());
    }
}
