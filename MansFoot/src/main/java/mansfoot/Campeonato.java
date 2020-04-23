package mansfoot;

import java.util.ArrayList;
import java.util.LinkedList;

public class Campeonato {
    private String nome;
    private ArrayList<String> tabela = new ArrayList<>();
    private LinkedList<String> premiacao = new LinkedList<>();
    private ArrayList<String> artilharia = new ArrayList<>();
    private ArrayList<String> assistencias = new ArrayList<>();
    private ArrayList<String> melhorCamp = new ArrayList<>();
    private ArrayList<String> melhorGol = new ArrayList<>();
    private ArrayList<String> melhorZag = new ArrayList<>();
    private ArrayList<String> melhorLat = new ArrayList<>();
    private ArrayList<String> melhorVol = new ArrayList<>();
    private ArrayList<String> melhorMc = new ArrayList<>();
    private ArrayList<String> melhorPt = new ArrayList<>();
    private ArrayList<String> melhorCa = new ArrayList<>();
    
    public Campeonato(String nome, LinkedList<String> premiacao) {
        this.nome = nome;
        this.premiacao = premiacao;   
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getTabela() {
        return tabela;
    }

    public void setTabela(ArrayList<String> tabela) {
        this.tabela = tabela;
    }

    public LinkedList<String> getPremiacao() {
        return premiacao;
    }

    public void setPremiacao(LinkedList<String> premiacao) {
        this.premiacao = premiacao;
    }

    public ArrayList<String> getArtilharia() {
        return artilharia;
    }

    public void setArtilharia(ArrayList<String> artilharia) {
        this.artilharia = artilharia;
    }

    public ArrayList<String> getAssistencias() {
        return assistencias;
    }

    public void setAssistencias(ArrayList<String> assistencias) {
        this.assistencias = assistencias;
    }

    public ArrayList<String> getMelhorCamp() {
        return melhorCamp;
    }

    public void setMelhorCamp(ArrayList<String> melhorCamp) {
        this.melhorCamp = melhorCamp;
    }

    public ArrayList<String> getMelhorGol() {
        return melhorGol;
    }

    public void setMelhorGol(ArrayList<String> melhorGol) {
        this.melhorGol = melhorGol;
    }

    public ArrayList<String> getMelhorZag() {
        return melhorZag;
    }

    public void setMelhorZag(ArrayList<String> melhorZag) {
        this.melhorZag = melhorZag;
    }

    public ArrayList<String> getMelhorLat() {
        return melhorLat;
    }

    public void setMelhorLat(ArrayList<String> melhorLat) {
        this.melhorLat = melhorLat;
    }

    public ArrayList<String> getMelhorVol() {
        return melhorVol;
    }

    public void setMelhorVol(ArrayList<String> melhorVol) {
        this.melhorVol = melhorVol;
    }

    public ArrayList<String> getMelhorMc() {
        return melhorMc;
    }

    public void setMelhorMc(ArrayList<String> melhorMc) {
        this.melhorMc = melhorMc;
    }

    public ArrayList<String> getMelhorPt() {
        return melhorPt;
    }

    public void setMelhorPt(ArrayList<String> melhorPt) {
        this.melhorPt = melhorPt;
    }

    public ArrayList<String> getMelhorCa() {
        return melhorCa;
    }

    public void setMelhorCa(ArrayList<String> melhorCa) {
        this.melhorCa = melhorCa;
    }
    
    // ToString;
    
}
