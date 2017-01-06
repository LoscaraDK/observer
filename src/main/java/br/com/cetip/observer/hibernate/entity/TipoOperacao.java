package br.com.cetip.observer.hibernate.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the TIPO_OPERACAO database table.
 * 
 */
@Entity
@Table(name="TIPO_OPERACAO", schema="CETIP")
@NamedQuery(name="TipoOperacao.findAll", query="SELECT t FROM TipoOperacao t")
public class TipoOperacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="NUM_ID_TIPO_OPERACAO")
	private long numIdTipoOperacao;
	
	@Column(name="NOM_TIPO_OPERACAO")
	private String nomTipoOperacao;
	
	@OneToMany(mappedBy = "tipoOperacao",fetch=FetchType.LAZY)
	private List<TipoOperObjetoServ> tipoOpersObjetoServ;
	
	public long getNumIdTipoOperacao() {
		return this.numIdTipoOperacao;
	}

	public void setNumIdTipoOperacao(long numIdTipoOperacao) {
		this.numIdTipoOperacao = numIdTipoOperacao;
	}

	public String getNomTipoOperacao() {
		return this.nomTipoOperacao;
	}

	public void setNomTipoOperacao(String nomTipoOperacao) {
		this.nomTipoOperacao = nomTipoOperacao;
	}

	public List<TipoOperObjetoServ> getTipoOpersObjetoServ() {
		return tipoOpersObjetoServ;
	}

	public void setTipoOpersObjetoServ(List<TipoOperObjetoServ> tipoOpersObjetoServ) {
		this.tipoOpersObjetoServ = tipoOpersObjetoServ;
	}

	
}