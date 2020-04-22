package mansfoot;
import mansfoot.posicoes.*;

public class Principal {
    public static void main(String[] args) {
        /*
        Atributo(int idade, String nacionalidade, int fama, int velocidade, 
        int chute, int forca, int salto, int passe, int cabeceio, 
        int cruzamento, int resistenciaLesao)
        */
        
        Goleiro g = new Goleiro("Eymael", 100.5, new Atributo(25, "Brasil", 50, 60, 50, 60, 70, 45, 40, 40, 60), 70, 70, 85);
        Defensivo d = new Defensivo("Puyol", 200000, new Atributo(25, "Brasil", 50, 60, 50, 60, 70, 45, 40, 40, 60), 95, 98, 97);
        Meio m = new Meio("Pirlo", 170000, new Atributo(25, "Brasil", 50, 60, 50, 60, 70, 45, 40, 40, 60), 90, 95, 98, 99);
        Atacante a = new Atacante("Ronaldo", 500000, new Atributo(25, "Brasil", 50, 60, 50, 60, 70, 45, 40, 40, 60), 99, 100);
        
        System.out.println(g.toString());
        System.out.println("");
        System.out.println(d.toString());
        System.out.println("");
        System.out.println(m.toString());
        System.out.println("");
        System.out.println(a.toString());
        System.out.println("");
    }
}
