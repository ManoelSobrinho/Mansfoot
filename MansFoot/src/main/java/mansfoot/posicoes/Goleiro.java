package mansfoot.posicoes;
import mansfoot.Clube;

public class Goleiro extends Jogador {
    private int hab;
    private int reflexo;
    private int saidaDeBola;
    
    public Goleiro(String nome, double salario, Atributo atributos, Clube clube, 
                   int hab, int reflexo, int saidaDeBola) {
        
        super(nome, salario, atributos, clube);
        this.hab = hab;
        this.reflexo = reflexo;
        this.saidaDeBola = saidaDeBola;
        
        geraOverall();
    }
    
    public Goleiro(String nome, double salario, Atributo atributos, int hab,
                   int reflexo, int saidaDeBola) {
        
        super(nome, salario, atributos);
        this.hab = hab;
        this.reflexo = reflexo;
        this.saidaDeBola = saidaDeBola;
        
        geraOverall();
    }
    
    @Override
    public void geraOverall() {
        int aux = getAtributos().getOverall();
        int ovr = (hab + reflexo + saidaDeBola) * getPeso();
        
        int p = getAtributos().getPeso() * 8 + getPeso() * 3;
        
        getAtributos().setOverall((aux+ovr)/p);
    }
    
    public String toString() {
        return super.toString() + "\nHabilidade de Goleiro: " + hab + "\nReflexo: " 
               + reflexo + "\nSaída de Bola: " + saidaDeBola + '\n';
    }
}
