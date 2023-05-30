
package adocao;

public class Animais {
    private float peso;
    private String tipo;
    private String raca;
    private int idade;
    private boolean adotar;
    
    public Animais(){
        this.peso = 0;
        this.tipo = null;
        this.idade = 0;
        this.raca = null;
    }
    
    public float getPeso(){
        return peso;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getRaca(){
        return raca;
    }
    
    public void setRaca(String raca){
        this.raca = raca;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public boolean getAdotar(){
        return adotar;
    }
    
    public void setAdotar(boolean adotar){
        this.adotar = adotar;
    }
    
    public void adotar(String r){
        
    }
}
