
package adocao;

public class Cachorro {
    private float peso;
    private String raca;
    private String nome;
    private int idade;
    private int felicidade;
    private boolean status;
    
    public void tabela(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Raca: " + this.getRaca());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Felicidade: " + this.getFelicidade());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Adotado: " + this.getStatus());
    }
    public Cachorro(){
        this.peso = 5;
        this.felicidade = 1;
        this.idade = 0;
    }
    
    public float getPeso(){
        return peso;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public String getRaca(){
        return raca;
    }
    
    public void setRaca(String raca){
        this.raca = raca;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getFelicidade(){
        return felicidade;
    }
    
    public void setFelicidade(int felicidade){
        this.felicidade = felicidade;
    }
    
    public boolean getStatus(){
        return status;
    }
    
    public void setStatus(boolean status){
        this.status = status;
    }
    
    public void adotar(String r){
        this.setStatus(true);
        if (r == "Grande"){
            this.setPeso(20);
            System.out.println("Parabens por adotar um cachorro grande");
        } else if (r == "Pequeno"){
            System.out.println("Parabens por adotar um cachorro pequeno");
        }
        if (this.getIdade() > 2) {
            System.out.println("Parabens por adotar um cachorro mais velho");
        } else if (this.getIdade() <= 2) {
            System.out.println("Parabens por adotar um cachorro filhote");
        }
    }
    
    
    public void comer(int c){
        if (this.getStatus() == true){
            c += 1;
            this.setPeso(this.getPeso() + c);
        } else {
            System.out.println("Cachorro não encontrado");
        }
    }
    
    public void brincar(int b){
        if (this.getStatus() == true){
            b += 1;
            this.setFelicidade(this.getFelicidade() + b);
            if (this.getFelicidade() < 4){
                System.out.println("Seu cao esta triste, brinque mais");
            } else if (this.getFelicidade() >= 4){
                System.out.println("Seu cao esta bem feliz");
            }
        }
    }
}
