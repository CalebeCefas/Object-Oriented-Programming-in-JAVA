package Listas.Provas.AP1CC.Q4.Faculdade;

public class Disciplina {
    private String codigo;
    private int cargaHoraria;
    private double mediaHistorica;

    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public int getCargaHoraria(){
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    public double getMediaHistorica(){
        return mediaHistorica;
    }

    public void setMediaHistorica(double mediaHistorica){
        this.mediaHistorica = mediaHistorica;
    }
}