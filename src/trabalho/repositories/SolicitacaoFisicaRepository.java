package src.trabalho.repositories;

import src.trabalho.domain.SolicitacaoPessoaFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface SolicitacaoFisicaRepository extends JpaRepository<SolicitacaoPessoaFisica, Long> {

}
