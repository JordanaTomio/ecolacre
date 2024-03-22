package src.main.trabalho.controllers;

import src.main.trabalho.domain.SolicitacaoPessoaJuridica;
import src.main.trabalho.repositories.SolicitacaoFisicaRepository;
import src.main.trabalho.repositories.SolicitacaoJuridicaRepository;
import src.main.trabalho.domain.SolicitacaoPessoaFisica;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

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
