package mansfoot.posicoes;
import mansfoot.Clube;

public class Defensivo extends Jogador {
    private int hab;
    private int marcacao; 
    private int desarme;
    
    public Defensivo(String nome, double salario, Atributo atributos, Clube clube, 
                     int hab, int marcacao, int desarme) {
        
        super(nome, salario, atributos, clube);
        this.hab = hab;
        this.marcacao = marcacao;
        this.desarme = desarme;
        
        geraOverall();
    }
        
    public Defensivo(String nome, double salario, Atributo atributos, int hab, 
                     int marcacao, int desarme) {
        
        super(nome, salario, atributos);
        this.hab = hab;
        this.marcacao = marcacao;
        this.desarme = desarme;
        
        geraOverall();
    }
    
    @Override
    public void geraOverall() {
        int aux = getAtributos().getOverall();
        int ovr = (hab + marcacao + desarme) * getPeso();
        
        int p = getAtributos().getPeso() * 8 + getPeso() * 3;
        
        getAtributos().setOverall((aux+ovr)/p);
    }
    
    public String toString() {
        return super.toString() + "\nHabilidade Defensiva: " + hab + "\nMarcação: " +
               marcacao + "\nDesarme: " + desarme;
    }
}
