package mansfoot.posicoes;
import mansfoot.Clube;

public abstract class Jogador {
    private String nome;
    private double salario;
    private int apegoClube = 0;
    private int golsJogo = 0;      
    private int golsAno = 0; 
    private int golsCarreira = 0; 
    private int assistJogo = 0;
    private int assistAno = 0;
    private int assistCarreira = 0;
    private double notaJogo = 0;
    private double notaCampeonato = 0;
    private double notaAno = 0;
    private int cartAmarelos = 0;
    private int cartVermelhos = 0;
    private boolean lesionado = false;
    private int tempoLesao = 0;
    private Atributo atributos;
    private final int peso = 60;
    private Clube clube;
    
    public Jogador(String nome, double salario, Atributo atributos, Clube clube) {
        this.nome = nome;
        this.salario = salario;
        this.atributos = atributos;
        this.clube = clube;
    }
    
    public Jogador(String nome, double salario, Atributo atributos) {
        this.nome = nome;
        this.salario = salario;
        this.atributos = atributos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void geraOverall();

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getApegoClube() {
        return apegoClube;
    }

    public void setApegoClube(int apegoClube) {
        this.apegoClube = apegoClube;
    }
    
    public int getGolsJogo() {
        return golsJogo;
    }

    public void setGolsJogo(int golsJogo) {
        this.golsJogo = golsJogo;
    }
    
    public void incGolJogo() {
        golsJogo++;
        incGolAno();
        incGolCarreira();
    }

    public int getGolsAno() {
        return golsAno;
    }

    public void setGolsAno(int golsAno) {
        this.golsAno = golsAno;
    }
    
    public void incGolAno() {
        golsAno++;
    }

    public int getGolsCarreira() {
        return golsCarreira;
    }

    public void setGolsCarreira(int golsCarreira) {
        this.golsCarreira = golsCarreira;
    }
    
    public void incGolCarreira() {
        golsCarreira++;
    }

    public int getAssistJogo() {
        return assistJogo;
    }

    public void setAssistJogo(int assistJogo) {
        this.assistJogo = assistJogo;
    }
    
    public void incAssistJogo() {
        assistJogo++;
        incAssistAno();
        incAssistCarreira();
    }

    public int getAssistAno() {
        return assistAno;
    }

    public void setAssistAno(int assistAno) {
        this.assistAno = assistAno;
    }
    
    public void incAssistAno() {
        assistAno++;
    }

    public int getAssistCarreira() {
        return assistCarreira;
    }

    public void setAssisCarreira(int assistCarreira) {
        this.assistCarreira = assistCarreira;
    }
    
    public void incAssistCarreira() {
        assistCarreira++;
    }

    public double getNotaJogo() {
        return notaJogo;
    }

    public void setNotaJogo(double notaJogo) {
        this.notaJogo = notaJogo;
    }

    public double getNotaAno() {
        return notaAno;
    }

    public void setNotaAno(double notaAno) {
        this.notaAno = notaAno;
    }

    public int getCartAmarelos() {
        return cartAmarelos;
    }

    public void setCartAmarelos(int cartAmarelos) {
        this.cartAmarelos = cartAmarelos;
    }
    
    public void incCartAmarelo() {
        cartAmarelos++;
    }

    public int getCartVermelhos() {
        return cartVermelhos;
    }

    public void setCartVermelhos(int cartVermelhos) {
        this.cartVermelhos = cartVermelhos;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public int getTempoLesao() {
        return tempoLesao;
    }

    public void setTempoLesao(int tempoLesao) {
        this.tempoLesao = tempoLesao;
    }

    public Atributo getAtributos() {
        return atributos;
    }

    public void setAtributos(Atributo atributos) {
        this.atributos = atributos;
    }
    
    public int getPeso() {
        return peso;
    }
    
    public String toString() {
        String s = "";
        
        if(clube != null)
            s = clube.getNome();
        else
            s = "Sem clube";
            
        return nome + " : " + atributos.getOverall() + "\nClube: " + s + 
               '\n' + atributos.toString();
    }
}
