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
public class clube {
    
    private int id;
    private int posicao;
    
    private String nome;                // get, set, show;
    private int overall;                // get, set, show;
    private String nacionalidade;       // get, set, show;
    private String estadio;             // get, set, show;           
    private float salarios;             // get, set, show;
    private float cash;                 // get, set, show;
    private String elenco[];            // 
    private String tecnico;             // get, set, show;
    private String titulos[];
    private String patrocinios[];
    
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
    
    // Métodos estadio;
	
    public String getEstadio() {
        return estadio;
    }
	
    public void setEstadio(String estadio) {
	this.estadio = estadio;	
    }
    
    public void showEstadio() {
        System.out.printf("%s", getEstadio());
    }
    
    // Métodos salarios;
	
    public float getSalarios() {
        return salarios;
    }
	
    public void setSalarios(float salarios) {
	this.salarios = salarios;	
    }
    
    public void showSalarios() {
        System.out.printf("%f", getSalarios());
    }
    
    // Métodos salarios;
	
    public float getCash() {
        return cash;
    }
	
    public void setCash(float cash) {
	this.cash = cash;	
    }
    
    public void showCash() {
        System.out.printf("%f", getCash());
    }
    
    // Métodos elenco;
/*	
    public String getElenco(int posicao) {
        return elenco[posicao];
    }
	
    public void setElenco(String elenco) {
	this.elenco[posicao] = elenco[posicao];
    }
    
    public void showElenco() {
        System.out.printf("%s", getElenco());
    }
*/
    // Métodos tecnico;
	
    public String getTecnico() {
        return tecnico;
    }
	
    public void setTecnico(String tecnico) {
	this.tecnico = tecnico;	
    }
    
    public void showTecnico() {
        System.out.printf("%s", getTecnico());
    }

}
    
