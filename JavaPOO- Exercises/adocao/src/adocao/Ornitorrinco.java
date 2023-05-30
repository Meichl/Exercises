
package adocao;

public class Ornitorrinco {
    private boolean gravido;
    private int peso;
    private int idade;

    public void Tabela(){
        System.out.println("Peso: " + this.getPeso());
    }
    public Ornitorrinco(boolean gravido, int peso, int idade) {
        this.gravido = gravido;
        this.peso = peso;
        this.idade = idade;
    }
    
    public boolean getGravido(){
        return gravido;
    }
    
    public void setGravido(boolean gravido){
        this.gravido = gravido;
    }
    
    public int getPeso(){
        return peso;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    public int idade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }

    public void Comer(int comida){
        setPeso(getPeso() + comida);
    }
}
