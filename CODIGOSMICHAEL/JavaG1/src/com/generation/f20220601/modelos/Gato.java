package com.generation.f20220601.modelos;

public class Gato extends Mascota {


        private Boolean garrasRetractil;
        private Boolean visionNocturna;
        private String sonidoVocal;

        public Gato() {
                super();
                this.garrasRetractil = garrasRetractil;
                this.visionNocturna = visionNocturna;
                this.sonidoVocal = sonidoVocal;

        }

        public Gato(Boolean garrasRetractil, Boolean visionNocturna, String sonidoVocal) {
                this.garrasRetractil = garrasRetractil;
                this.visionNocturna = visionNocturna;
                this.sonidoVocal = sonidoVocal;
        }

        public Boolean getGarrasRetractil(){
                return garrasRetractil;
        }

        public void setGarrasRetractil(Boolean garrasRetractil) {
                this.garrasRetractil = garrasRetractil;
        }

        public Boolean getVisionNocturna() {
                return visionNocturna;
        }

        public void setVisionNocturna(Boolean visionNocturna) {
                this.visionNocturna = visionNocturna;
        }

        public String getSonidoVocal() {
                return sonidoVocal;
        }

        public void setSonidoVocal(String sonidoVocal) {
                this.sonidoVocal = sonidoVocal;
        }
        public void hacerSonido() {
                System.out.println("Miau, miau");
        }


/*@Override
        public String toString() {
                return "Gato[" +
                        "garrasRetractil=" + garrasRetractil +
                        ", visionNocturna=" + visionNocturna +
                        ", sonidoVocal='" + sonidoVocal + super.toString() +
                        ']';*/
        }

