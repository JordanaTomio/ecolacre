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

    @GetMapping("/fisica/cpf/{cpf}")
    ResponseEntity<List<SolicitacaoPessoaFisica>> findByCpfPF(@PathVariable String cpf) {
        List<SolicitacaoPessoaFisica> list = repositoryPessoaFisica.findByCpf(cpf);
        return ResponseEntity.ok(list);
    }

    @GetMapping("/fisica/id/{id}")
    ResponseEntity<Optional<SolicitacaoPessoaFisica>> findByIdPF(@PathVariable Long id) {
        Optional<SolicitacaoPessoaFisica> pessoaFisica = repositoryPessoaFisica.findById(id);
        return ResponseEntity.ok(pessoaFisica);
    }

    @GetMapping("/juridica/cpf/{cpf}")
    ResponseEntity<List<SolicitacaoPessoaJuridica>> findByCpfPJ(@PathVariable String cpf) {
        List<SolicitacaoPessoaJuridica> list = repositoryPessoaJuridica.findByCpf(cpf);
        return ResponseEntity.ok(list);
    }

    @GetMapping("/juridica/id/{id}")
    ResponseEntity<Optional<SolicitacaoPessoaJuridica>> findByIdPJ(@PathVariable Long id) {
        Optional<SolicitacaoPessoaJuridica> pessoaFisica = repositoryPessoaJuridica.findById(id);
        return ResponseEntity.ok(pessoaFisica);
    }

}
