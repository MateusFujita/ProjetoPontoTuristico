package br.com.juridico.totvs.fullstack.Backend.service.dto;


public class ComentariosCreateUpdateDTO {

    private long id;
    private String nome;
    private String cidade;
    private String comentarios;
    private boolean aprovacao;


    public ComentariosCreateUpdateDTO() {
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

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComentarios() {
        return this.comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public boolean isAprovacao() {
        return this.aprovacao;
    }

    public boolean getAprovacao() {
        return this.aprovacao;
    }

    public void setAprovacao(boolean aprovacao) {
        this.aprovacao = aprovacao;
    }

}
