package com.generationg6.models;

public class EtapaPreguntaEtapa {

    private int idEtapa;
    private int idPreguntaEtapa;
    private PreguntasEtapa preguntasEtapa;

    public EtapaPreguntaEtapa() {
    }

    public EtapaPreguntaEtapa(int idEtapa, int idPreguntaEtapa) {
        this.idEtapa = idEtapa;
        this.idPreguntaEtapa = idPreguntaEtapa;
    }

    public int getIdEtapa() {
        return idEtapa;
    }

    public void setIdEtapa(int idEtapa) {
        this.idEtapa = idEtapa;
    }

    public int getIdPreguntaEtapa() {
        return idPreguntaEtapa;
    }

    public void setIdPreguntaEtapa(int idPreguntaEtapa) {
        this.idPreguntaEtapa = idPreguntaEtapa;
    }

    public PreguntasEtapa getPreguntasEtapa() {
        return preguntasEtapa;
    }

    public void setPreguntasEtapa(PreguntasEtapa preguntasEtapa) {
        this.preguntasEtapa = preguntasEtapa;
    }
}
