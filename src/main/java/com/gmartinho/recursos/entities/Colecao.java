package com.gmartinho.recursos.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance (strategy = InheritanceType.JOINED)
@Table (name = "colecao")
public class Colecao {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @Column (nullable = false, length = 1024)
    private String titulo;

    @Column (nullable = false, length = 4096)
    private String descricao;

    @Lob
    @Column (nullable = false)
    private String imagem;

    @OrderBy ("titulo asc")
    @OneToMany (mappedBy = "colecao")
    private List<Recurso> recursos;

    public Colecao() {
    }

    public Colecao(Long id, String titulo, String descricao, String imagem, List<Recurso> recursos) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.imagem = imagem;
        this.recursos = recursos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public List<Recurso> getRecursos() {
        return recursos;
    }

    public void setRecursos(List<Recurso> recursos) {
        this.recursos = recursos;
    }
}
