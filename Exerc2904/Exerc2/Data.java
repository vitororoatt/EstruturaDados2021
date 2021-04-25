public class Data{
    private int mes;
    private int dia;
    private int ano;

    public Data(int dia, int mes, int ano){
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    // getter/setter dia
    public int getDia() {
		return dia;
	}
    public void setDia(int dia) {
		this.dia = dia;
	}

    // getter/setter mes
    public int getMes() {
		return mes;
	}
    public void setMes(int mes) {
		this.mes = mes;
	}

    // getter/setter mes
    public int getAno() {
		return ano;
	}
    public void setAno(int ano) {
		this.ano = ano;
	}

    @Override
    public String toString(){
        return dia + "/" + mes + "/" + ano;
    }

    void diaSeguinte(){
        if(dia != 30){
            System.out.print((dia+1) + "/" + mes + "/" + ano);
        }
        else{
            if(mes != 12){
                System.out.print(01 + "/" + (mes + 1) + "/" + ano);
            }
            else{
                System.out.print(01 + "/" + 01 + "/" + (ano + 1));
            }
        }
    }

    void diaAnterior(){
        if(dia != 1){
            System.out.print((dia - 1) + "/" + mes + "/" + ano);
        }
        else{
            if(mes != 1){
                System.out.print(30 + "/" + (mes - 1) + "/" + ano);
            }
            else{
                System.out.print(30 + "/" + 12 + "/" + ano);
            }
        }
    }

}