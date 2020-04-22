package mansfoot;

public class Patrocinio {  
    private String nome;
    private double valor;
    private boolean contrato;
    private int tContrato;
    private Clube clube;
    
    Patrocinio(String nome, double valor, int tContrato, Clube clube) {
        this.nome = nome;
        this.valor = valor;
        contrato = true;
        this.tContrato = tContrato;
        this.clube = clube;
    }
    
    Patrocinio(String nome, double valor, int tContrato) {
        this.nome = nome;
        this.valor = valor;
        contrato = true;
        this.tContrato = tContrato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isContrato() {
        return contrato;
    }

    public void setContrato(boolean contrato) {
        this.contrato = contrato;
    }

    public int getTContrato() {
        return tContrato;
    }

    public void setTContrato(int tContrato) {
        this.tContrato = tContrato;
    }

    public Clube getClube() {
        return clube;
    }

    public void setClube(Clube clube) {
        this.clube = clube;
    } 
    
    public String toString() {
        return nome + "\nValor: R$ " + valor + "\nContrato: " + contrato 
               + "\nTempo Contrato: " + tContrato + " anos\nClube: " + clube.getNome();
    }
}
