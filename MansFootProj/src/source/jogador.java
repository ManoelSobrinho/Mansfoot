package source;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Manoel Cleonaldo
 */
public class jogador {
    
    private int id;
    
    private String nome;                            // get, set, show;
    private int idade;                              // get, set, show;
    private float estatura;                         // get, set, show;
    private int overall;                            // get, set, show;
    private float salario;                          // get, set, show;
    private String nacionalidade;                   // get, set, show;
    private int apegoClube;                         // get, set;
    private int fama;                               // get, set, show;
    private int golsCampeonato;                     // get, set, show;        
    private int golsAno;                            // get, set, show; 
    private int golsCarreira;                       // get, set, show; 
    private int assistenciasCampeonato;             // get, set, show;
    private int assistenciasAno;                    // get, set, show;
    private int assistenciasCarreira;               // get, set, show;
    private float notaJogo;                         // get, set, show;
    private float notaCampeonato;                   // get, set, show;
    private float notaAno;                          // get, set, show;
    private boolean suspenso[];
    private int cartoesAmarelosCampeonato;
    private int cartoesAmarelosCarreira;
    private int cartoesVermelhosCampeonato;
    private int cartoesVermelhosCarreira;
    private boolean lesionado;
    private int tempoLesao;
    
    private int velocidade;
    private int chute;
    private int forcaFisica;
    private int salto;
    private int passe;
    private int cabeceio;
    private int cruzamento;
    private int resistenciaLesao;
    
    private int habilidadeGoleiro;
    private int reflexo;
    private int saidaDeBola;
    
    private int habilidadeDefensiva;
    private int marcacao; 
    private int desarme;
    
    private int habilidadeOfensiva;
    private int finalizacao;
    
    // Métodos nome;
    
    public String getNome() {
        return nome;
    }
            
    public void setNome(String nome) {
	this.nome = nome;	
    }
    
    public void showNome() {
        System.out.printf("%s", getNome());
    }
    
    // Métodos idade;
    
    public int getIdade() {
        return idade;
    }
            
    public void setIdade(int idade) {
	this.idade = idade;	
    }
    
    public void showIdade() {
        System.out.printf("%d", getIdade());
    }
    
    // Métodos estatura;
    
    public float getEstatura() {
        return estatura;
    }
            
    public void setEstatura(float estatura) {
	this.estatura = estatura;	
    }
    
    public void showEstatura() {
        System.out.printf("%f", getEstatura());
    }
    
    // Métodos overall;
    
    public int getOverall() {
        return overall;
    }
            
    public void setOverall(int overall) {
	this.overall = overall;	
    }
    
    public void showOverall() {
        System.out.printf("%d", getOverall());
    }
    
    // Métodos salario;
    
    public float getSalario() {
        return salario;
    }
            
    public void setSalario(float salario) {
	this.salario = salario;	
    }
    
    public void showSalario() {
        System.out.printf("%f", getSalario());
    }
    
    // Métodos nacionalidade;
    
    public String getNacionalidade() {
        return nacionalidade;
    }
            
    public void setNacionalidade(String nacionalidade) {
	this.nacionalidade = nacionalidade;	
    }
    
    public void showNacionalidade() {
        System.out.printf("%s", getNacionalidade());
    }
    
    // Métodos apegoClube;
    
    public int getApegoClube() {
        return apegoClube;
    }
            
    public void setApegoClube(int apegoClube) {
	this.apegoClube = apegoClube;	
    }
    
    // Métodos fama;
    
    public int getFama() {
        return fama;
    }
            
    public void setFama(int fama) {
	this.fama = fama;	
    }
    
    public void showFama() {
        System.out.printf("%d", getFama());
    }
    
    // Métodos golsCampeonato;
    
    public int getGolsCampeonato() {
        return golsCampeonato;
    }
            
    public void setGolsCampeonato(int golsCampeonato) {
	this.golsCampeonato = golsCampeonato;	
    }
    
    public void showGolsCampeonato() {
        System.out.printf("%d", getGolsCampeonato());
    }
    
    // Métodos golsAno;
    
    public int getGolsAno() {
        return golsAno;
    }
            
    public void setGolsAno(int golsAno) {
	this.golsAno = golsAno;	
    }
    
    public void showGolsAno() {
        System.out.printf("%d", getGolsAno());
    }
    
    // Métodos golsCarreira;
    
    public int getGolsCarreira() {
        return golsCarreira;
    }
            
    public void setGolsCarreira(int golsCarreira) {
	this.golsCarreira = golsCarreira;	
    }
    
    public void showGolsCarreira() {
        System.out.printf("%d", getGolsCarreira());
    }
    
    // Métodos assistenciasCampeonato;
    
    public int getAssistenciasCampeonato() {
        return assistenciasCampeonato;
    }
            
    public void setAssistenciasCampeonato(int assistenciasCampeonato) {
	this.assistenciasCampeonato = assistenciasCampeonato;	
    }
    
    public void showAssistenciasCampeonato() {
        System.out.printf("%d", getAssistenciasCampeonato());
    }
    
    // Métodos assistenciasAno;
    
    public int getAssistenciasAno() {
        return assistenciasAno;
    }
            
    public void setAssistenciasAno(int assistenciasAno) {
	this.assistenciasAno = assistenciasAno;	
    }
    
    public void showAssistenciasAno() {
        System.out.printf("%d", getAssistenciasAno());
    }
    
    // Métodos assistenciasCarreira;
    
    public int getAssistenciasCarreira() {
        return assistenciasCarreira;
    }
            
    public void setAssistenciasCarreira(int assistenciasCarreira) {
	this.assistenciasCarreira = assistenciasCarreira;	
    }
    
    public void showAssistenciasCarreira() {
        System.out.printf("%d", getAssistenciasCarreira());
    }
    
    // Métodos notaJogo;
    
    public float getNotaJogo() {
        return notaJogo;
    }
            
    public void setNotaJogo(float notaJogo) {
	this.notaJogo = notaJogo;	
    }
    
    public void showNotaJogo() {
        System.out.printf("%f", getNotaJogo());
    }
    
    // Métodos notaCampeonato;
    
    public float getNotaCampeonato() {
        return notaCampeonato;
    }
            
    public void setNotaCampeonato(float notaCampeonato) {
	this.notaCampeonato = notaCampeonato;	
    }
    
    public void showNotaCampeonato() {
        System.out.printf("%f", getNotaCampeonato());
    }
    
    // Métodos notaAno;
    
    public float getNotaAno() {
        return notaAno;
    }
            
    public void setNotaAno(float notaAno) {
	this.notaAno = notaAno;	
    }
    
    public void showNotaAno() {
        System.out.printf("%f", getNotaAno());
    }
            
}
