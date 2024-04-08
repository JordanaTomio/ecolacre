package br.com.trabalho.ecolacre.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "solicitacoes_fisicas")
public class SolicitacaoPessoaFisica {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;

    @JsonProperty("nome")
    @Column
    public String nome;

    @JsonProperty("cpf")
    @Column
    public String cpf;

    @JsonProperty("endereco")
    @Column
    public String endereco;

    @JsonProperty("cidade")
    @Column
    public String cidade;

    @JsonProperty("telefone")
    @Column
    public String telefone;

    @JsonProperty("data_nascimento")
    @Column
    public Date dataNascimento;

    @JsonProperty("rg")
    @Column
    public String rg;

    @JsonProperty("uf")
    @Column
    public String uf;

    @JsonProperty("email")
    @Column
    public String email;

    @JsonProperty("renda_familiar_media")
    @Column
    public String rendaFamiliarMedia;


    @JsonProperty("estuda")
    @Column
    public boolean estuda;

    @JsonProperty("trabalha")
    @Column
    public boolean trabalha;

    @JsonProperty("concorda_termos_projeto")
    @Column
    public boolean concordaComTermosDoProjeto;


    @JsonProperty("razao_cadeira_rodas")
    @Column
    public String razaoCadeiraDeRodas;


    @JsonProperty("largura_costas_cm")
    @Column
    public int larguraCostasCm;

    @JsonProperty("peso_kg")
    @Column
    public int pesoKg;

    @JsonProperty("quadril_cm")
    @Column
    public int quadrilCm;

    @JsonProperty("altura_cm")
    @Column
    public int alturaCm;

    @JsonProperty("menor_largura_porta_cm")
    @Column
    public int menorLarguraPortaCasaCm;

    @JsonProperty("largura_assento_cm")
    @Column
    public int larguraAssentoCm;

    @JsonProperty("responsavel_nome")
    @Column
    public String responsavelNome;

    @JsonProperty("responsavel_telefone")
    @Column
    public String responsavelTelefone;

    @JsonProperty("responsavel_email")
    @Column
    public String responsavelEmail;

    public SolicitacaoPessoaFisica() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRendaFamiliarMedia() {
        return rendaFamiliarMedia;
    }

    public void setRendaFamiliarMedia(String rendaFamiliarMedia) {
        this.rendaFamiliarMedia = rendaFamiliarMedia;
    }

    public boolean isEstuda() {
        return estuda;
    }

    public void setEstuda(boolean estuda) {
        this.estuda = estuda;
    }

    public boolean isTrabalha() {
        return trabalha;
    }

    public void setTrabalha(boolean trabalha) {
        this.trabalha = trabalha;
    }

    public boolean isConcordaComTermosDoProjeto() {
        return concordaComTermosDoProjeto;
    }

    public void setConcordaComTermosDoProjeto(boolean concordaComTermosDoProjeto) {
        this.concordaComTermosDoProjeto = concordaComTermosDoProjeto;
    }

    public String getRazaoCadeiraDeRodas() {
        return razaoCadeiraDeRodas;
    }

    public void setRazaoCadeiraDeRodas(String razaoCadeiraDeRodas) {
        this.razaoCadeiraDeRodas = razaoCadeiraDeRodas;
    }

    public int getLarguraCostasCm() {
        return larguraCostasCm;
    }

    public void setLarguraCostasCm(int larguraCostasCm) {
        this.larguraCostasCm = larguraCostasCm;
    }

    public int getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(int pesoKg) {
        this.pesoKg = pesoKg;
    }

    public int getQuadrilCm() {
        return quadrilCm;
    }

    public void setQuadrilCm(int quadrilCm) {
        this.quadrilCm = quadrilCm;
    }

    public int getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(int alturaCm) {
        this.alturaCm = alturaCm;
    }

    public int getMenorLarguraPortaCasaCm() {
        return menorLarguraPortaCasaCm;
    }

    public void setMenorLarguraPortaCasaCm(int menorLarguraPortaCasaCm) {
        this.menorLarguraPortaCasaCm = menorLarguraPortaCasaCm;
    }

    public int getLarguraAssentoCm() {
        return larguraAssentoCm;
    }

    public void setLarguraAssentoCm(int larguraAssentoCm) {
        this.larguraAssentoCm = larguraAssentoCm;
    }

    public String getResponsavelNome() {
        return responsavelNome;
    }

    public void setResponsavelNome(String responsavelNome) {
        this.responsavelNome = responsavelNome;
    }

    public String getResponsavelTelefone() {
        return responsavelTelefone;
    }

    public void setResponsavelTelefone(String responsavelTelefone) {
        this.responsavelTelefone = responsavelTelefone;
    }

    public String getResponsavelEmail() {
        return responsavelEmail;
    }

    public void setResponsavelEmail(String responsavelEmail) {
        this.responsavelEmail = responsavelEmail;
    }
}
