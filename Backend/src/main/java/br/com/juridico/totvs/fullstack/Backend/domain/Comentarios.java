package br.com.juridico.totvs.fullstack.Backend.domain;

import br.com.juridico.totvs.fullstack.Backend.service.dto.PaisDTO;

public class Comentarios {

    private long id;
    private String nome;
    private String cidade;
    private String comentarios;
    private boolean aprovacao;

    public Comentarios(Long id, String nome, String sigla, String continente, int ddi){
        this.id = id;
        this.nome = nome;
        this.estado = estado;
        this.comentarios = comentarios;
        this.aprovacao = aprovacao;
    }    

    public Comentarios(ComentariosDTO ComentariosDTO){
        this.id = ComentariosDTO.getId();
        this.nome = ComentariosDTO.getNome();
        this.estado = ComentariosDTO.getSigla();
        this.comentarios = ComentariosDTO.getContinente();
        this.aprovacao = ComentariosDTO.getDdi();
    }  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(string nome) {
        this.nome = nome;
    }  

    public String getSigla() {
        return sigla;
    }

    public void setSigla(string sigla) {
        this.sigla = sigla;
    }   

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(string comentarios) {
        this.comentarios = comentarios;
    } 

     public String getAprovacao() {
        return aprovacao;
    }

    public void setAprovacao(boolean aprovacao) {
        this.aprovacao = aprovacao;
    }            
    
}
