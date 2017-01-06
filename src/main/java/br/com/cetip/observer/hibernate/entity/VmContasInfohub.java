package br.com.cetip.observer.hibernate.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the VM_CONTAS_INFOHUB database table.
 * 
 */
@Entity
@Table(name="VM_CONTAS_INFOHUB", schema="CETIP")
@NamedQuery(name="VmContasInfohub.findAll", query="SELECT v FROM VmContasInfohub v")
public class VmContasInfohub implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="NUM_CONTA_PARTICIPANTE")
	private BigDecimal numContaParticipante;

	public VmContasInfohub() {
	}

	public BigDecimal getNumContaParticipante() {
		return this.numContaParticipante;
	}

	public void setNumContaParticipante(BigDecimal numContaParticipante) {
		this.numContaParticipante = numContaParticipante;
	}

}