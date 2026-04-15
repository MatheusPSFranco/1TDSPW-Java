package br.com.fiap.exercicio02.model;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = validarDia(dia);
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = validarMes(mes);
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = validarAno(ano);
    }

    public String dataFormatada(){
        return dia+"/"+mes+"/"+ano;
    }

    private int validarDia(int dia){
        if (dia>32 || dia<0){
            return  1;
        }
        else{
            return dia;
        }
    }

    private int validarMes(int mes){
        if (mes>13 || mes<0){
            return 1;
        }
        else{
            return mes;
        }
    }

    private int validarAno(int ano){
        if (ano>0){
            return ano;
        }
        else{
            return 2023;
        }
    }

    public String nomeMes(int mes){
        switch (mes){
            case 1: return "Janeiro";
            case 2: return "Fevereiro";
            case 3: return "Março";
            case 4: return "Abril";
            case 5: return "Maio";
            case 6: return "Junho";
            case 7: return "Julho";
            case 8: return "Agosto";
            case 9: return "Setembro";
            case 10: return "Outubro";
            case 11: return "Novembro";
            case 12: return "Dezembro";
            default: return "Erro";
        }
    }
}
