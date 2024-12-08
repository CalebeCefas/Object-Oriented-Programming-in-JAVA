package Constantes;

public class NovaRadianoUtils extends RadianoUtils{
    public double pi = 3.14;

    public double converterRadianos(double graus, double pi){
        return 3*((graus*pi)/180);
    }
}