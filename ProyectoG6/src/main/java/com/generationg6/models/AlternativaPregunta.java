package com.generationg6.models;
@Entity
@Table(name = "alternativas_preguntas")
public class AlternativaPregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean correcta;

    /* VARIAS RESPUESTAS TIENEN 1 PREGUNTA MANY TO ONE */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pregunta")
    /* ATRIBUTO FK COLABORATIVO */
    private Pregunta pregunta;

    /* VARIAS Alternativas TIENEN 1 USUARIO MANY TO ONE */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_alternativa")
    /* ATRIBUTO FK COLABORATIVO */
    private Alternativa alternativa;

    public AlternativaPregunta() {
    }

    public AlternativaPregunta(Long id, Boolean correcta) {
        this.id = id;
        this.correcta = correcta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getCorrecta() {
        return correcta;
    }

    public void setCorrecta(Boolean correcta) {
        this.correcta = correcta;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public Alternativa getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(Alternativa alternativa) {
        this.alternativa = alternativa;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }
}
