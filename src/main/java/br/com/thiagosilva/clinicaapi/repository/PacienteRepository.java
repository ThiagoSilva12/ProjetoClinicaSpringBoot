package br.com.thiagosilva.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.thiagosilva.clinicaapi.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente , Long>{

}
