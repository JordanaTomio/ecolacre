package br.com.trabalho.ecolacre.repositories;

import br.com.trabalho.ecolacre.domain.SolicitacaoPessoaJuridica;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Transactional
public interface SolicitacaoJuridicaRepository extends JpaRepository<SolicitacaoPessoaJuridica, Long> {

    List<SolicitacaoPessoaJuridica> findByCpf(String cpf);

}
