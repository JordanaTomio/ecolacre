package com.trabalho.controllers;

import com.trabalho.domain.SolicitacaoPessoaFisica;
import com.trabalho.domain.SolicitacaoPessoaJuridica;
import com.trabalho.repositories.SolicitacaoFisicaRepository;
import com.trabalho.repositories.SolicitacaoJuridicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
@Transactional
public class SolicitacaoController {

    @Autowired
    private final SolicitacaoFisicaRepository repositoryPessoaFisica;
    private final SolicitacaoJuridicaRepository repositoryPessoaJuridica;

    public SolicitacaoController(SolicitacaoFisicaRepository repositoryPessoaFisica, SolicitacaoJuridicaRepository repositoryPessoaJuridica) {
        this.repositoryPessoaFisica = repositoryPessoaFisica;
        this.repositoryPessoaJuridica = repositoryPessoaJuridica;
    }


    @PostMapping("/solicitacoes/fisica")
    Integer saveUser(@RequestBody SolicitacaoPessoaFisica solicitacao) {
        try {
            repositoryPessoaFisica.save(solicitacao);
            return HttpStatus.OK.value();
        } catch (Exception e) {
            return HttpStatus.UNPROCESSABLE_ENTITY.value();
        }
    }

    @PostMapping("/solicitacoes/juridica")
    Integer saveUser(@RequestBody SolicitacaoPessoaJuridica solicitacao) {
        try {
            repositoryPessoaJuridica.save(solicitacao);
            return HttpStatus.OK.value();
        } catch (Exception e) {
            return HttpStatus.UNPROCESSABLE_ENTITY.value();
        }
    }
}
