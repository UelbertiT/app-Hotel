package br.unipar.programacaointernet.TrabalhoSub.repository;

import br.unipar.programacaointernet.TrabalhoSub.model.Quarto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuartoRepository extends JpaRepository<Quarto, Integer> {
        List<Quarto> findByStNomeQuarto(String stNomeQuarto);
        List<Quarto> findBystStatusQuarto(String stStatusQuarto);
        List<Quarto> findByBoVistaMar(Boolean boVistaMar);

}
