package mansfoot;
import java.util.ArrayList;
import java.util.LinkedList;

public class Clube {
    private String nome;
    private int overall;                
    private String nacionalidade;
    private Estadio estadio;      
    private double salario;
    private double cash;
    private ArrayList<Jogador> elenco = new ArrayList<>();
    private String tecnico;
    private LinkedList<String> titulos = new LinkedList<>();
    private Patrocinio patrocinio;
    private double fama;
    
    public Clube(String nome, String nacionalidade, Estadio estadio, double cash, ArrayList<Jogador> elenco, String tecnico, Patrocinio patrocinio) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.estadio = estadio;
        this.cash = cash;
        this.elenco = elenco;
        this.tecnico = tecnico;
        this.patrocinio = patrocinio;
    }
    
    // Métodos nome;
    public String getNome() {
        return nome;
    }
            
    public void setNome(String nome) {
	this.nome = nome;	
    }
    
    // Métodos overall;
    public int getOverall() {
        return overall;
    }
	
    public void setOverall(int overall) {
	this.overall = overall;	
    }
    
    // Métodos nacionalidade;
    public String getNacionalidade() {
        return nacionalidade;
    }
	
    public void setNacionalidade(String nacionalidade) {
	this.nacionalidade = nacionalidade;	
    }
    
    // Métodos estadio;
    public Estadio getEstadio() {
        return estadio;
    }
	
    public void setEstadio(Estadio estadio) {
	this.estadio = estadio;	
    }
    
    // Métodos salarios;
    public double getSalario() {
        return salario;
    }
	
    public void setSalario(double salario) {
	this.salario = salario;	
    }
    
    // Métodos cash;
    public double getCash() {
        return cash;
    }
	
    public void setCash(double cash) {
	this.cash = cash;	
    }
    
    // Métodos elenco;
    public ArrayList<Jogador> getElenco() {
        return elenco;
    }
	
    public void setElenco(ArrayList<Jogador> elenco) {
	this.elenco = elenco;
    }
    
    // Métodos tecnico;
    public String getTecnico() {
        return tecnico;
    }
	
    public void setTecnico(String tecnico) {
	this.tecnico = tecnico;	
    }
    
    // Métodos títulos;
    public LinkedList<String> getTitulos() {
        return titulos;
    }
    
    public void addTitulo(String titulo) {
        titulos.add(titulo);
    }
    
    // Métodos patrocinio;
    public Patrocinio getPatrocinio() {
        return patrocinio;
    }
    
    public void setPatrocinio(Patrocinio patrocinio) {
        this.patrocinio = patrocinio;
    }
    
    public String toString() {
        String e = "";
        String p = "";
        
        for(int i = 0; i < elenco.size(); i++)
            e += elenco.get(i).getNome() + " [R$ " + elenco.get(i).getSalario() + "]\n";
        
        return nome + '(' + nacionalidade  + ") - " + overall + "\nTécnico: " + tecnico + "\nElenco:\n" +
               e + "Estadio: " + estadio.getNome() + "\nSalario Total: " + salario + "\nCash: " + cash +
               "\nTítulos: " + titulos + "\nPatrocionio:\n" + patrocinio.getNome() + " [R$ " + patrocinio.getValor() + ']';
    }
}  
