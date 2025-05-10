package com.model;

import jakarta.persistence.*;

@Entity
@Table(name = "versiculo")
public class Versiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String versao;
    private String livro;
    private Integer capitulo;
    private Integer versiculo;
    private String texto;

     //Getters e setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getVersao() { return versao; }
    public void setVersao(String versao) { this.versao = versao; }

    public String getLivro() { return livro; }
    public void setLivro(String livro) { this.livro = livro; }

    public Integer getCapitulo() { return capitulo; }
    public void setCapitulo(Integer capitulo) { this.capitulo = capitulo; }

    public Integer getVersiculo() { return versiculo; }
    public void setVersiculo(Integer versiculo) { this.versiculo = versiculo; }

    public String getTexto() { return texto; }
    public void setTexto(String texto) { this.texto = texto; }
}

