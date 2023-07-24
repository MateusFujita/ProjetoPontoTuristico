package br.com.juridico.totvs.fullstack.Backend.domain;

import br.com.juridico.totvs.fullstack.Backend.service.dto.PaisDTO;

public class PontoTuristico {
    private long id;
    private String nome;
    private Pais pais;
    private List<Comentario> comentarios;


    public PontoTuristico(Long id, String nome, Pais pais, Comentario comentario){
        this.id = id;
        this.nome = nome;
        this.pais = pais;
        this.comentario = new ArrayList<>();
    }

    public Pais(PontoTuristico pontoTuristico){
        this.id = pontoTuristicoDTO.getId();
        this.nome = pontoTuristicoDTO.getNome();
        this.pais = pontoTuristicoDTO.getPais();
        this.comentario  = pontoTuristicoDTO.getComentarios();
    }


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pais getPais() {
        return this.pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Comentario> getComentarios() {
        return this.comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

}
