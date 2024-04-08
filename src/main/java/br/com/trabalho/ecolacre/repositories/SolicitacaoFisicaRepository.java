package br.com.trabalho.ecolacre.repositories;

import br.com.trabalho.ecolacre.domain.SolicitacaoPessoaFisica;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface SolicitacaoFisicaRepository extends JpaRepository<SolicitacaoPessoaFisica, Long> {
    List<SolicitacaoPessoaFisica> findByCpf(String cpf);
}
