package br.com.thiagosilva.clinicaapi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Agenda {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAgenda;
@Column
	private String nomeAgenda;
@Column
	private String idMedico;
@Column(nullable = false)
	private Date dataConsulta;
@Column(nullable = false)
	private Date horaConsulta;
@Column(nullable = false)
	private String especialidade;
public Agenda() {
}
public Long getIdAgenda() {
	return idAgenda;
}
public void setIdAgenda(Long idAgenda) {
	this.idAgenda = idAgenda;
}
public String getNomeAgenda() {
	return nomeAgenda;
}
public void setNomeAgenda(String nomeAgenda) {
	this.nomeAgenda = nomeAgenda;
}
public String getIdMedico() {
	return idMedico;
}
public void setIdMedico(String idMedico) {
	this.idMedico = idMedico;
}
public Date getDataConsulta() {
	return dataConsulta;
}
public void setDataConsulta(Date dataConsulta) {
	this.dataConsulta = dataConsulta;
}
public Date getHoraConsulta() {
	return horaConsulta;
}
public void setHoraConsulta(Date horaConsulta) {
	this.horaConsulta = horaConsulta;
}
public String getEspecialidade() {
	return especialidade;
}
public void setEspecialidade(String especialidade) {
	this.especialidade = especialidade;
}
public Agenda(Long idAgenda, String nomeAgenda, String idMedico, Date dataConsulta, Date horaConsulta,
		String especialidade) {
	this.idAgenda = idAgenda;
	this.nomeAgenda = nomeAgenda;
	this.idMedico = idMedico;
	this.dataConsulta = dataConsulta;
	this.horaConsulta = horaConsulta;
	this.especialidade = especialidade;
}
	
}
