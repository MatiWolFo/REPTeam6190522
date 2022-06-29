package com.generationg6.models;

public class ValidacionRespuestasEtapa {

    private boolean respuestaVerdaderaFalsaEtapa;
    private int idPreguntaEtapa;
    private int idRespuestaEtapa;
    private int idValidacionRespuestaEtapa;
    private AlternativasEtapa alternativasEtapa;

    public ValidacionRespuestasEtapa() {
    }

    public ValidacionRespuestasEtapa(boolean respuestaVerdaderaFalsaEtapa, int idPreguntaEtapa, int idRespuestaEtapa, int idValidacionRespuestaEtapa, AlternativasEtapa alternativasEtapa) {
        this.respuestaVerdaderaFalsaEtapa = respuestaVerdaderaFalsaEtapa;
        this.idPreguntaEtapa = idPreguntaEtapa;
        this.idRespuestaEtapa = idRespuestaEtapa;
        this.idValidacionRespuestaEtapa = idValidacionRespuestaEtapa;
        this.alternativasEtapa = alternativasEtapa;
    }

    public boolean isRespuestaVerdaderaFalsaEtapa() {
        return respuestaVerdaderaFalsaEtapa;
    }

    public void setRespuestaVerdaderaFalsaEtapa(boolean respuestaVerdaderaFalsaEtapa) {
        this.respuestaVerdaderaFalsaEtapa = respuestaVerdaderaFalsaEtapa;
    }

    public int getIdPreguntaEtapa() {
        return idPreguntaEtapa;
    }

    public void setIdPreguntaEtapa(int idPreguntaEtapa) {
        this.idPreguntaEtapa = idPreguntaEtapa;
    }

    public int getIdRespuestaEtapa() {
        return idRespuestaEtapa;
    }

    public void setIdRespuestaEtapa(int idRespuestaEtapa) {
        this.idRespuestaEtapa = idRespuestaEtapa;
    }

    public int getIdValidacionRespuestaEtapa() {
        return idValidacionRespuestaEtapa;
    }

    public void setIdValidacionRespuestaEtapa(int idValidacionRespuestaEtapa) {
        this.idValidacionRespuestaEtapa = idValidacionRespuestaEtapa;
    }

    public AlternativasEtapa getRespuestasEtapa() {
        return alternativasEtapa;
    }

    public void setRespuestasEtapa(AlternativasEtapa alternativasEtapa) {
        this.alternativasEtapa = alternativasEtapa;
    }
}
