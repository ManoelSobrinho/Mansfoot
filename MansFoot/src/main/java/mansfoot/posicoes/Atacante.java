package mansfoot.posicoes;
import mansfoot.Clube;

public class Atacante extends Jogador {
    private int hab;
    private int finalizacao;
    
    public Atacante(String nome, double salario, Atributo atributos, Clube clube, 
                    int hab, int finalizacao) {
        
        super(nome, salario, atributos, clube);
        this.hab = hab;
        this.finalizacao = finalizacao;
        
        geraOverall();
    }
        
    public Atacante(String nome, double salario, Atributo atributos, int hab, int finalizacao) {
        super(nome, salario, atributos);
        this.hab = hab;
        this.finalizacao = finalizacao;
        
        geraOverall();
    }
    
    @Override
    public void geraOverall() {
        int aux = getAtributos().getOverall();
        int ovr = (hab + finalizacao) * getPeso();
        
        int p = getAtributos().getPeso() * 8 + getPeso() * 2;
        
        getAtributos().setOverall((aux+ovr)/p);
    }
    
    public String toString() {
        return super.toString() + "\nHabilidade Ofensiva: " + hab + "\nFinalização: " + finalizacao;
    }
}
