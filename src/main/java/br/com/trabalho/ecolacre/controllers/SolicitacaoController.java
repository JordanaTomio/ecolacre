package br.com.trabalho.ecolacre.controllers;

import br.com.trabalho.ecolacre.domain.SolicitacaoPessoaFisica;
import br.com.trabalho.ecolacre.domain.SolicitacaoPessoaJuridica;
import br.com.trabalho.ecolacre.repositories.SolicitacaoFisicaRepository;
import br.com.trabalho.ecolacre.repositories.SolicitacaoJuridicaRepository;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@Transactional
@RequestMapping("/solicitacoes")
public class SolicitacaoController {

    private SolicitacaoFisicaRepository repositoryPessoaFisica;

    private SolicitacaoJuridicaRepository repositoryPessoaJuridica;

    @PostMapping("/fisica")
    Integer saveUser(@RequestBody SolicitacaoPessoaFisica solicitacao) {
        try {
            repositoryPessoaFisica.save(solicitacao);
            return HttpStatus.OK.value();
        } catch (Exception e) {
            return HttpStatus.BAD_REQUEST.value();
        }
    }

    @PostMapping("/juridica")
    Integer saveUser(@RequestBody SolicitacaoPessoaJuridica solicitacao) {
        try {
            repositoryPessoaJuridica.save(solicitacao);
            return HttpStatus.OK.value();
        } catch (Exception e) {
            return HttpStatus.UNPROCESSABLE_ENTITY.value();
        }
    }

    @GetMapping("/cpf/{cpf}")
    ResponseEntity<List<SolicitacaoPessoaFisica>> findByCpf(@PathVariable String cpf) {
        List<SolicitacaoPessoaFisica> list = repositoryPessoaFisica.findByCpf(cpf);
        return ResponseEntity.ok(list);
    }

    @GetMapping("/id/{id}")
    ResponseEntity<Optional<SolicitacaoPessoaFisica>> findById(@PathVariable Long id) {
        Optional<SolicitacaoPessoaFisica> pessoaFisica = repositoryPessoaFisica.findById(id);
        return ResponseEntity.ok(pessoaFisica);
    }

}
