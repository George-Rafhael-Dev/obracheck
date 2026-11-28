
package com.obracheck.config.model;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Obra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private String endereco;
    private String bairro;
    private String status;
    private String tipoObra;
    private Double percentualConclusao;
    private LocalDate dataInicio;
    private LocalDate previsaoConclusao;
    private String orgaoResponsavel;

    // Construtor vazio
    public Obra() {
    }

    // Construtor completo
    public Obra(Long id, String nome, String descricao,
                String endereco, String bairro, String status,
                String tipoObra, Double percentualConclusao,
                LocalDate dataInicio, LocalDate previsaoConclusao,
                String orgaoResponsavel) {

        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.endereco = endereco;
        this.bairro = bairro;
        this.status = status;
        this.tipoObra = tipoObra;
        this.percentualConclusao = percentualConclusao;
        this.dataInicio = dataInicio;
        this.previsaoConclusao = previsaoConclusao;
        this.orgaoResponsavel = orgaoResponsavel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipoObra() {
        return tipoObra;
    }

    public void setTipoObra(String tipoObra) {
        this.tipoObra = tipoObra;
    }

    public Double getPercentualConclusao() {
        return percentualConclusao;
    }

    public void setPercentualConclusao(Double percentualConclusao) {
        this.percentualConclusao = percentualConclusao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getPrevisaoConclusao() {
        return previsaoConclusao;
    }

    public void setPrevisaoConclusao(LocalDate previsaoConclusao) {
        this.previsaoConclusao = previsaoConclusao;
    }

    public String getOrgaoResponsavel() {
        return orgaoResponsavel;
    }

    public void setOrgaoResponsavel(String orgaoResponsavel) {
        this.orgaoResponsavel = orgaoResponsavel;
    }
}
