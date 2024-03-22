package br.com.trabalho.ecolacre.controllers;

import br.com.trabalho.ecolacre.domain.SolicitacaoPessoaFisica;
import br.com.trabalho.ecolacre.domain.SolicitacaoPessoaJuridica;
import br.com.trabalho.ecolacre.repositories.SolicitacaoFisicaRepository;
import br.com.trabalho.ecolacre.repositories.SolicitacaoJuridicaRepository;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Transactional
public class SolicitacaoController {

    private SolicitacaoFisicaRepository repositoryPessoaFisica;

    private SolicitacaoJuridicaRepository repositoryPessoaJuridica;

    @PostMapping("/solicitacoes/fisica")
    Integer saveUser(@RequestBody SolicitacaoPessoaFisica solicitacao) {
        try {
            repositoryPessoaFisica.save(solicitacao);
            return HttpStatus.OK.value();
        } catch (Exception e) {
            return HttpStatus.BAD_REQUEST.value();
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
