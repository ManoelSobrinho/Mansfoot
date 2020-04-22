package mansfoot.posicoes;
import mansfoot.Clube;

public class Meio extends Jogador {
    private int habDf;
    private int habOf;
    private int marcacao; 
    private int desarme;
    
    public Meio(String nome, double salario, Atributo atributos, Clube clube, 
                int habDf, int habOf, int marcacao, int desarme) {
        
        super(nome, salario, atributos, clube);
        this.habDf = habDf;
        this.habOf = habOf;
        this.marcacao = marcacao;
        this.desarme = desarme;
        
        geraOverall();
    }
    
    public Meio(String nome, double salario, Atributo atributos, int habDf, 
                int habOf, int marcacao, int desarme) {
        
        super(nome, salario, atributos);
        this.habDf = habDf;
        this.habOf = habOf;
        this.marcacao = marcacao;
        this.desarme = desarme;
        
        geraOverall();
    }
    
    @Override
    public void geraOverall() {
        int aux = getAtributos().getOverall();
        int ovr = (habDf + habOf + marcacao + desarme) * getPeso();
        
        int p = getAtributos().getPeso() * 8 + getPeso() * 4;
        
        getAtributos().setOverall((aux+ovr)/p);
    }
    
    public String toString() {
        return super.toString() + "\nHabilidade Defensiva: " + habDf + "\nHabilidade Ofensiva: " + 
               habOf + "\nMarcação: " + marcacao + "\nDesarme: " + desarme;
    }
}
