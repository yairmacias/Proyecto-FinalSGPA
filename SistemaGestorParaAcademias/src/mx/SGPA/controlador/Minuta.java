package mx.SGPA.controlador;

public class Minuta {

    private int idMinuta;
    private String carrera;
    private String academia;
    private int hora;
    private int periodo;
    private int fecha;

    public Minuta(int idMinuta, String carrera, String academia, int hora, int periodo, int fecha) {

        this.idMinuta = idMinuta; 
        this.carrera = carrera;
        this.academia = academia;
        this.hora = hora;
        this.periodo = periodo;
        this.fecha = fecha;
    }

    public int getIdMinuta() {
        return idMinuta;
    }

    public String getCarrea() {
        return carrera;
    }

    public String getAcademia() {
        return academia;
    }

    public int getHora() {
        return hora;
    }

    public int getPeriodo() {
        return periodo;
    }

    public int getFecha() {
        return fecha;
    }

    public void setMinuta(int idMinuta) {
        this.idMinuta = idMinuta;
    }

    public void setCarrea(String carrera) {
        this.carrera = carrera;
    }

    public void setAcademia(String academia) {
        this.academia = academia;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

}
