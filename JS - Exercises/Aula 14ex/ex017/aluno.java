import java.util.List;

public class aluno{
    //atributos ------------
     private String nome, cpf, signo;
     private List<String> disciplinas;

    //construtor

    //metodos
    public void print(){
        System.out.println("*******************");
        System.out.println("Nome: "+nome);
        System.out.println("Cpf: "+cpf);
        System.out.println("Signo: "+signo);
        System.out.println("Disciplinas: "+disciplinas);
        for(int i=0; i<disciplinas.size(); i++){
            System.out.println("-> "+disciplinas.get(i));
        }
    }
}