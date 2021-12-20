package com.gmartinho.recursos.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import java.util.List;


@Entity
@Table (name = "autor")
public class Autor {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @Email
    @Column (nullable = false)
    private String email;

    @Column (length = 64, nullable = false)
    private String nome;

    @Column (length = 64, nullable = false)
    private String sobrenome;

    @Column (length = 256, nullable = false)
    private String afiliacao;

    @Pattern (regexp = "\\d{4}-\\d{4}-\\d{4}-\\d{4}")
    @Column (name = "orc_id")
    private String orcId;

    @ManyToMany
    @JoinTable (name = "autor_recurso", joinColumns = @JoinColumn(name = "fk_autor"), inverseJoinColumns = @JoinColumn(name = "fk_recurso"))
    private List<Recurso> recursos;

    public Autor() {

    }

    public Autor(Long id, String email, String nome, String sobrenome, String afiliacao, String orcId, List<Recurso> recursos) {
        this.id = id;
        this.email = email;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.afiliacao = afiliacao;
        this.orcId = orcId;
        this.recursos = recursos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getAfiliacao() {
        return afiliacao;
    }

    public void setAfiliacao(String afiliacao) {
        this.afiliacao = afiliacao;
    }

    public String getOrcId() {
        return orcId;
    }

    public void setOrcId(String orcId) {
        this.orcId = orcId;
    }

    public List<Recurso> getRecursos() {
        return recursos;
    }

    public void setRecursos(List<Recurso> recursos) {
        this.recursos = recursos;
    }
}
