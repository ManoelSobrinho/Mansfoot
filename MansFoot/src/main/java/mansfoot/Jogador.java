package mansfoot;

public abstract class Jogador {
    private String nome;
    private int idade;
    private float estatura;
    private int overall;
    private float salario;
    private String nacionalidade;
    private int apegoClube;
    private int fama;
    private int golsCampeonato;        
    private int golsAno; 
    private int golsCarreira; 
    private int assistenciasCampeonato;
    private int assistenciasAno;
    private int assistenciasCarreira;
    private float notaJogo;
    private float notaCampeonato;
    private float notaAno;
    private boolean suspenso[];
    private int cartoesAmarelosCampeonato;
    private int cartoesAmarelosCarreira;
    private int cartoesVermelhosCampeonato;
    private int cartoesVermelhosCarreira;
    private int resistenciaLesao;
    private boolean lesionado;
    private int tempoLesao;
    
    private int velocidade;
    private int chute;
    private int forcaFisica;
    private int salto;
    private int passe;
    private int cabeceio;
    private int cruzamento;
    
    private int habilidadeGoleiro;
    private int reflexo;
    private int saidaDeBola;
    
    private int habilidadeDefensiva;
    private int marcacao; 
    private int desarme;
    
    private int habilidadeOfensiva;
    private int finalizacao;  
    
    public abstract void geraOverall();
}
