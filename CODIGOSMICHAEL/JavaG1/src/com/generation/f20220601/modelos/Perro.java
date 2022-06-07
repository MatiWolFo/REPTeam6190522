package com.generation.f20220601.modelos;

public class Perro extends Mascota{

        //Extends deja dar los atributos de otra clase

        private Integer numPaseos;
        private Float tamanioHocico;
        private String sonidoVocal;

        public Perro() {
        super();

        }
        public Perro(Integer numPaseos, Float tamanioHocico, String sonidoVocal) {
                this.numPaseos = numPaseos;
                this.tamanioHocico = tamanioHocico;
                this.sonidoVocal = sonidoVocal;
        }

        public Integer getNumPaseos() {
                return numPaseos;
        }

        public void setNumPaseos(Integer numPaseos) {
                this.numPaseos = numPaseos;
        }

        public Float getTamanioHocico() {
                return tamanioHocico;
        }

        public void setTamanioHocico(Float tamanioHocico) {
                this.tamanioHocico = tamanioHocico;
        }

        public String getSonidoVocal() {
                return sonidoVocal;
        }

        public void setSonidoVocal(String sonidoVocal) {
                this.sonidoVocal = sonidoVocal;
        }

        @Override
        public void hacerSonido() {
                System.out.println("Guau,guau");
        }

}
