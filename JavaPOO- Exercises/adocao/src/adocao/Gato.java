
package adocao;

public class Gato {
    //atributos - caracteristicas
    private float peso;
    private int idade;
    private String nome;
    private String raca;
    private int felicidade;
    private boolean Status;
    
    public Gato(){
        this.idade = 1;
        this.felicidade = 1;
        this.nome = "None";
    }
    // metodos - acoes
    
    public float getPeso(){
        return peso;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
}
