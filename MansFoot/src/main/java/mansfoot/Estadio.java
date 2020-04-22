package mansfoot;

public class Estadio {
    private String nome;
    private int capacidade;
    private int camarote;
    private int vCamarote;
    private int cadeira;
    private int vCadeira;
    private Clube clube;
    
    public Estadio(String nome, int camarote, int vCamarote, int cadeira, int vCadeira, Clube clube) {
        this.nome = nome;
        this.camarote = camarote;
        this.vCamarote = camarote;
        this.cadeira = cadeira;
        this.vCadeira = vCadeira;
        this.clube = clube;
        
        capacidade = camarote + cadeira;
    }
    
    public Estadio(String nome, int camarote, int vCamarote, int cadeira, int vCadeira) {
        this.nome = nome;
        this.camarote = camarote;
        this.vCamarote = camarote;
        this.cadeira = cadeira;
        this.vCadeira = vCadeira;
        
        capacidade = camarote + cadeira;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getCapacidade() {
        return capacidade;
    }
    
    public void setCapacidade() {
        capacidade = cadeira + camarote; 
    }
    
    public int getCamarote() {
        return camarote;
    }
    
    public void setCamarote(int camarote) {
        this.camarote = camarote;
        setCapacidade();
    }
    
    public int getVCamarote() {
        return vCamarote;
    }
    
    public void setVCamarote(int vCamarote) {
        this.vCamarote = vCamarote;
    }
    
    public int getCadeira() {
        return cadeira;
    }
    
    public void setCadeira(int cadeira) {
        this.cadeira = cadeira;
        setCapacidade();
    }
    
    public int getVCadeira() {
        return vCadeira;
    }
    
    public void setVCadeira(int vCadeira) {
        this.vCadeira = vCadeira;
    }
    
    public Clube getClube() {
        return clube;
    }
    
    public void setClube(Clube clube) {
        this.clube = clube;
    }
}
