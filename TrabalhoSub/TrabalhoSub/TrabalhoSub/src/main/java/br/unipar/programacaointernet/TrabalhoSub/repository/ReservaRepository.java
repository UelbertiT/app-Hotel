package br.unipar.programacaointernet.TrabalhoSub.repository;


import br.unipar.programacaointernet.TrabalhoSub.model.Hospede;
import br.unipar.programacaointernet.TrabalhoSub.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

    //Quary para buscar o hospere pela reserva
    List<Reserva> findByHospede(Hospede hospede);

}

