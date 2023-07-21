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

    public Comentarios(PaisDTO paisDTO){
        this.id = paisDTO.getId();
        this.nome = paisDTO.getNome();
        this.sigla = paisDTO.getSigla();
        this.continente = paisDTO.getContinente();
        this.ddi = paisDTO.getDdi();
    }    
    //Continuar em  casa
}
