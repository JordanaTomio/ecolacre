package com.trabalho.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "solicitacoes_juridicas")
public class SolicitacaoPessoaJuridica {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;

    @JsonProperty("razao_social")
    @Column
    public String razaoSocial;

    @JsonProperty("nome_fantasia")
    @Column
    public String nomeFantasia;

    @JsonProperty("cnpj")
    @Column
    public String cnpj;

    @JsonProperty("endereco")
    @Column
    public String endereco;

    @JsonProperty("cidade")
    @Column
    public String cidade;

    @JsonProperty("telefone")
    @Column
    public String telefone;

    @JsonProperty("uf")
    @Column
    public String uf;

    @JsonProperty("cep")
    @Column
    public String cep;

    @JsonProperty("email")
    @Column
    public String email;

    @JsonProperty("atividades_desempenhadas")
    @Column
    public String atividadesDesempenhadas;

    @JsonProperty("incentivo_financeiro")
    @Column
    public String incentivoFinanceiro;

    @JsonProperty("media_pessoas_benef_mensal")
    @Column
    public String mediaPessoasBeneficiadasMensalmente;

    @JsonProperty("qtd_cadeira_rodas_instituicao")
    @Column
    public int qtdCadeiraRodasInstituicao;

    @JsonProperty("cadeira_rodas_emprestadas")
    @Column
    public boolean cadeiraRodasSaoEmprestadas; //checar possibilidade de ser bool

    @JsonProperty("desc_modelo_cadeira_rodas")
    @Column
    public String DescricaoModeloCadeiraRodas;


    @JsonProperty("responsavel_nome")
    @Column
    public int responsavelNome;

    @JsonProperty("responsavel_telefone")
    @Column
    public int responsavelTelefone;

    @JsonProperty("responsavel_email")
    @Column
    public int responsavelEmail;

    @JsonProperty("concorda_termos_projeto")
    @Column
    public boolean concordaComTermosDoProjeto;

    @JsonProperty("razao_cadeira_rodas")
    @Column
    public String razaoCadeiraDeRodas;

    public SolicitacaoPessoaJuridica() {
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAtividadesDesempenhadas() {
        return atividadesDesempenhadas;
    }

    public void setAtividadesDesempenhadas(String atividadesDesempenhadas) {
        this.atividadesDesempenhadas = atividadesDesempenhadas;
    }

    public String getIncentivoFinanceiro() {
        return incentivoFinanceiro;
    }

    public void setIncentivoFinanceiro(String incentivoFinanceiro) {
        this.incentivoFinanceiro = incentivoFinanceiro;
    }

    public String getMediaPessoasBeneficiadasMensalmente() {
        return mediaPessoasBeneficiadasMensalmente;
    }

    public void setMediaPessoasBeneficiadasMensalmente(String mediaPessoasBeneficiadasMensalmente) {
        this.mediaPessoasBeneficiadasMensalmente = mediaPessoasBeneficiadasMensalmente;
    }

    public int getQtdCadeiraRodasInstituicao() {
        return qtdCadeiraRodasInstituicao;
    }

    public void setQtdCadeiraRodasInstituicao(int qtdCadeiraRodasInstituicao) {
        this.qtdCadeiraRodasInstituicao = qtdCadeiraRodasInstituicao;
    }

    public boolean isCadeiraRodasSaoEmprestadas() {
        return cadeiraRodasSaoEmprestadas;
    }

    public void setCadeiraRodasSaoEmprestadas(boolean cadeiraRodasSaoEmprestadas) {
        this.cadeiraRodasSaoEmprestadas = cadeiraRodasSaoEmprestadas;
    }

    public String getDescricaoModeloCadeiraRodas() {
        return DescricaoModeloCadeiraRodas;
    }

    public void setDescricaoModeloCadeiraRodas(String descricaoModeloCadeiraRodas) {
        DescricaoModeloCadeiraRodas = descricaoModeloCadeiraRodas;
    }

    public int getResponsavelNome() {
        return responsavelNome;
    }

    public void setResponsavelNome(int responsavelNome) {
        this.responsavelNome = responsavelNome;
    }

    public int getResponsavelTelefone() {
        return responsavelTelefone;
    }

    public void setResponsavelTelefone(int responsavelTelefone) {
        this.responsavelTelefone = responsavelTelefone;
    }

    public int getResponsavelEmail() {
        return responsavelEmail;
    }

    public void setResponsavelEmail(int responsavelEmail) {
        this.responsavelEmail = responsavelEmail;
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
}
