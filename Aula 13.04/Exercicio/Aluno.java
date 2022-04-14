package Exercicio;

public class Aluno{

    public static char[] toString;
    private int RGM;
    private String nome;
    private int anoIngresso;

    public Aluno(int RGM, String nome, int anoIngresso){
        this.RGM = RGM;
        this.nome = nome;
        this.anoIngresso = anoIngresso;
    }

    public int getRGM(){
        return this.RGM;
    }
    
    public String getnome(){
        return this.nome;
    }
    
    public int getanoIngresso(){
        return this.anoIngresso;
    }
    
    public void setRGM(int RGM){
        this.RGM = RGM;
    }
    
    public void setnome(String nome){
        this.nome = nome;
    }
    
    public void setanoIngresso(int anoIngresso){
        this.anoIngresso = anoIngresso;
    }
    
    @Override
    public String toString(){
        return super.toString() + ":\n"
        + String.format("RGM: %d\nNome: %s\nAnoIngresso: %d", this.RGM, this.nome, this.anoIngresso);
    }
}
