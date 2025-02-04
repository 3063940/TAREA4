package ut4ejerc1;

public class Fecha {
    private int dia;
    private EnumMes mes;
    private int anio;

    public Fecha (int dia, EnumMes mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Fecha () {
        this.dia = 29;
        this.mes = EnumMes.JULIO;
        this.anio = 1997;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public EnumMes getMes() {
        return mes;
    }

    public void setMes(EnumMes mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isSummer() {
        return mes == EnumMes.JUNIO || mes == EnumMes.JULIO || mes == EnumMes.AGOSTO || mes == EnumMes.SEPTIEMBRE;
    }

    //he utilizado un if/else porque así si no cumple la funcion puede terminar en un falso.

    @Override

    public String toString() {
        return dia + " de " + mes + " de " + anio;
    }
}


