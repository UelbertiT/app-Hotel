package br.unipar.programacaointernet.TrabalhoSub.repository;

import br.unipar.programacaointernet.TrabalhoSub.model.Hospede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospedeRepository extends JpaRepository<Hospede, Integer> {

}
