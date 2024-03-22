package src.main.trabalho.repositories;

import src.main.trabalho.domain.SolicitacaoPessoaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface SolicitacaoJuridicaRepository extends JpaRepository<SolicitacaoPessoaJuridica, Long> {

}
