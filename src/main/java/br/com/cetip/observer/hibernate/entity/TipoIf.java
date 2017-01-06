package br.com.cetip.observer.hibernate.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TIPO_IF database table.
 * 
 */
@Entity
@Table(name="TIPO_IF", schema="CETIP")
@NamedQuery(name="TipoIf.findAll", query="SELECT t FROM TipoIf t")
public class TipoIf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="NUM_TIPO_IF")
	private long numTipoIf;
	
	@Column(name="COD_TIPO_IF")
	private String codTipoIf;

	@Column(name="NOM_TIPO_IF")
	private String nomTipoIf;

	@Column(name="NUM_ID_OBJETO_SERVICO")
	private BigDecimal numIdObjetoServico;

	public long getNumTipoIf() {
		return this.numTipoIf;
	}

	public void setNumTipoIf(long numTipoIf) {
		this.numTipoIf = numTipoIf;
	}

	public String getCodTipoIf() {
		return this.codTipoIf;
	}

	public void setCodTipoIf(String codTipoIf) {
		this.codTipoIf = codTipoIf;
	}

	public String getNomTipoIf() {
		return this.nomTipoIf;
	}

	public void setNomTipoIf(String nomTipoIf) {
		this.nomTipoIf = nomTipoIf;
	}

	public BigDecimal getNumIdObjetoServico() {
		return this.numIdObjetoServico;
	}

	public void setNumIdObjetoServico(BigDecimal numIdObjetoServico) {
		this.numIdObjetoServico = numIdObjetoServico;
	}

}