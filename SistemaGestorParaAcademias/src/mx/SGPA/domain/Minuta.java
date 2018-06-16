package mx.SGPA.domain;

public class Minuta {

    private int idMinuta;
    private String carrera;
    private String academia;
    private int hora;
    private int periodo;
    private int fecha;
    private String lugar;
    private TemasTratar temasTratar;
    private AspectoAgenda aspectosAgenda;
    private ConclucionesAcuerdos conclusionesAcuerdos;
    private Participantes pasticipantes;

    public Minuta(int idMinuta, String carrera, String academia, int hora, int periodo, int fecha, String lugar) {

        this.idMinuta = idMinuta;
        this.carrera = carrera;
        this.academia = academia;
        this.hora = hora;
        this.periodo = periodo;
        this.fecha = fecha;
        this.lugar = lugar;
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

    public String getLugar() {
        return lugar;
    }

    public TemasTratar getTemasTratar() {
        return temasTratar;
    }

    public AspectoAgenda getAspectosAgenda() {
        return aspectosAgenda;
    }

    public ConclucionesAcuerdos getConclusionesAcuerdos() {
        return conclusionesAcuerdos;
    }

    public Participantes getPasticipantes() {
        return pasticipantes;
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

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    public void setTemasTratar(TemasTratar temasTratar) {
        this.temasTratar = temasTratar;
    }

    public void setAspectosAgenda(AspectoAgenda aspectosAgenda) {
        this.aspectosAgenda = aspectosAgenda;
    }

    public void setConclusionesAcuerdos(ConclucionesAcuerdos conclusionesAcuerdos) {
        this.conclusionesAcuerdos = conclusionesAcuerdos;
    }

    public void setPasticipantes(Participantes pasticipantes) {
        this.pasticipantes = pasticipantes;
    }
}
