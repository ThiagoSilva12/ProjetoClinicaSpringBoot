package br.com.thiagosilva.clinicaapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.thiagosilva.clinicaapi.model.Agenda;
import br.com.thiagosilva.clinicaapi.repository.AgendaRepository;

@RestController
@RequestMapping("/agenda")
public class AgendaController {

	@Autowired
	private AgendaRepository ar;
	
	@GetMapping("/listar")
	public List<Agenda> listar(){
		return ar.findAll();
	}
	@PostMapping("/cadastro")
	public String cadastro(@RequestBody Agenda agenda) {
		ar.save(agenda);
		return "Cadastro realizado com sucesso";
	}
	
	public String atualizar (@PathVariable Long id,@RequestBody Agenda agenda) {
		Optional<Agenda> ag = ar.findById(id);
		
		if(!ag.isPresent()) {
			return "Agendamento não localizado";
		}
		agenda.setIdAgenda(id);
		ar.save(agenda);
		return "Agenda atualizada";
	}
}
