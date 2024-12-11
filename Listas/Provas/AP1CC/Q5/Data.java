package Listas.Provas.AP1CC.Q5;

public class Data {
    public int dia, mes, ano;

    public int getDia(){
        return dia;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public int getMes(){
        return mes;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public boolean valida() {
        if (mes < 1 || mes > 12) {
            return false;
        }
    
        if (mes == 2) {
            if (dia < 1 || (dia > 29 || (dia == 29 && !isAnoBissexto()))) {
                return false;
            }
        }
    
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            return false;
        }
    
        if (dia < 1 || dia > 31) {
            return false;
        }
    
        return true;
    }
    
    private boolean isAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public String formata() {
        if (this.valida()) {
            return String.format("%02d/%02d/%04d", dia, mes, ano);
        } else {
            return "Data Inválida!";
        }
    }

    public static void main(String args[]){
        Data data = new Data();
        data.setDia(29);
        data.setMes(2);
        data.setAno(2024);

        System.out.println("Data válida? " + data.valida());

        data.setDia(30);
        System.out.println("Data válida? " + data.valida());
    }
}
