package br.com.trabalho.ecolacre.controllers;

import br.com.trabalho.ecolacre.application.EmailSenderService;
import br.com.trabalho.ecolacre.domain.SolicitacaoPessoaFisica;
import br.com.trabalho.ecolacre.domain.SolicitacaoPessoaJuridica;
import br.com.trabalho.ecolacre.repositories.SolicitacaoFisicaRepository;
import br.com.trabalho.ecolacre.repositories.SolicitacaoJuridicaRepository;
import jakarta.transaction.Transactional;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Transactional
@RequestMapping("/solicitacoes")
public class SolicitacaoController {
    @Autowired
    private SolicitacaoFisicaRepository repositoryPessoaFisica;

    @Autowired
    private SolicitacaoJuridicaRepository repositoryPessoaJuridica;

    @Autowired
    private EmailSenderService emailSenderService;

    @PostMapping("/fisica")
    ResponseEntity<Integer> saveUser(@RequestBody SolicitacaoPessoaFisica solicitacao) {
        try {
            solicitacao.dataNascimento = DateUtils.addDays(solicitacao.dataNascimento, 1);
            SolicitacaoPessoaFisica solicitacaoPessoaFisica = repositoryPessoaFisica.save(solicitacao);

            emailSenderService.sendEmail(solicitacaoPessoaFisica.getEmail(), "Solicitacao cadeira de rodas", "Codigo para consultar o status do seu pedido: " + solicitacaoPessoaFisica.getId());

            return ResponseEntity.ok(solicitacao.getId());
        } catch (Exception e) {
            return ResponseEntity.ofNullable(solicitacao.getId());
        }
    }

    @PostMapping("/juridica")
    ResponseEntity<Integer> saveUser(@RequestBody SolicitacaoPessoaJuridica solicitacao) {
        try {
            SolicitacaoPessoaJuridica solicitacaoPessoaJuridica = repositoryPessoaJuridica.save(solicitacao);

            emailSenderService.sendEmail(solicitacaoPessoaJuridica.getEmail(), "Solicitacao cadeira de rodas", "Codigo para consultar o status do seu pedido: " + solicitacaoPessoaJuridica.getId());
            return ResponseEntity.ok(solicitacao.getId());
        } catch (Exception e) {
            return ResponseEntity.ofNullable(solicitacao.getId());
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

    @GetMapping("/juridica/cnpj/{cnpj}")
    ResponseEntity<List<SolicitacaoPessoaJuridica>> findByCnpj(@PathVariable String cnpj) {
        List<SolicitacaoPessoaJuridica> list = repositoryPessoaJuridica.findByCnpj(cnpj);
        return ResponseEntity.ok(list);
    }

    @GetMapping("/juridica/id/{id}")
    ResponseEntity<Optional<SolicitacaoPessoaJuridica>> findByIdPJ(@PathVariable Long id) {
        Optional<SolicitacaoPessoaJuridica> pessoaFisica = repositoryPessoaJuridica.findById(id);
        return ResponseEntity.ok(pessoaFisica);
    }

}
