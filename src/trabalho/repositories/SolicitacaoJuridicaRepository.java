package src.trabalho.repositories;

import src.trabalho.domain.SolicitacaoPessoaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface SolicitacaoJuridicaRepository extends JpaRepository<SolicitacaoPessoaJuridica, Long> {

}
