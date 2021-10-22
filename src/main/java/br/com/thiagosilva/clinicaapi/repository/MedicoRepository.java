package br.com.thiagosilva.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.thiagosilva.clinicaapi.model.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long>{

}
