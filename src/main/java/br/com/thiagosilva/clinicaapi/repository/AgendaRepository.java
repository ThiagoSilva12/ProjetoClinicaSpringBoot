package br.com.thiagosilva.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.thiagosilva.clinicaapi.model.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long>{

}
