package mansfoot.posicoes;

public class Atributo {
    private final int peso = 100;
    private int idade;
    private String nacionalidade;
    private int fama;
    private int velocidade;
    private int chute;
    private int forca;
    private int salto;
    private int passe;
    private int cabeceio;
    private int cruzamento;
    private int resistenciaLesao;
    private int overall = 0;
    
    public Atributo(int idade, String nacionalidade, int fama, int velocidade, 
                    int chute, int forca, int salto, int passe, int cabeceio, 
                    int cruzamento, int resistenciaLesao) {
        
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.fama = fama;
        this.velocidade = velocidade;
        this.chute = chute;
        this.forca = forca;
        this.salto = salto;
        this.passe = passe;
        this.cabeceio = cabeceio;
        this.cruzamento = cruzamento;
        this.resistenciaLesao = resistenciaLesao;
        overall = (velocidade + chute + forca + salto + passe + cabeceio + cruzamento + resistenciaLesao)*peso;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    public int getFama() {
        return fama;
    }

    public void setFama(int fama) {
        this.fama = fama;
    }
    
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getChute() {
        return chute;
    }

    public void setChute(int chute) {
        this.chute = chute;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getSalto() {
        return salto;
    }

    public void setSalto(int salto) {
        this.salto = salto;
    }

    public int getPasse() {
        return passe;
    }

    public void setPasse(int passe) {
        this.passe = passe;
    }

    public int getCabeceio() {
        return cabeceio;
    }

    public void setCabeceio(int cabeceio) {
        this.cabeceio = cabeceio;
    }

    public int getCruzamento() {
        return cruzamento;
    }

    public void setCruzamento(int cruzamento) {
        this.cruzamento = cruzamento;
    }
    
    public int getResistenciaLesao() {
        return resistenciaLesao;
    }

    public void setResistenciaLesao(int resistenciaLesao) {
        this.resistenciaLesao = resistenciaLesao;
    }

    public int getOverall() {
        return overall;
    }
    
    public void setOverall(int overall) {
        this.overall = overall;
    }
    
    public int getPeso() {
        return peso;
    }
    
    public String toString() {
        return "Idade: " + idade + "\nNacionalidade: " + nacionalidade + "\nFama: " 
               + fama + "\nVelocidade: " + velocidade + "\nChute: " + chute + 
               "\nForça: " + forca + "\nSalto: " + salto + "\nPasse: " + passe 
               + "\nCabeceio: " + cabeceio + "\nCruzamento: " + cruzamento + 
               "\nResistência à Lesão: " + resistenciaLesao;
    }
}
