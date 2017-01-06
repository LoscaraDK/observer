package br.com.cetip.observer.hibernate.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SITUACAO_OPERACAO database table.
 * 
 */
@Entity
@Table(name="SITUACAO_OPERACAO", schema="CETIP")
@NamedQuery(name="SituacaoOperacao.findAll", query="SELECT s FROM SituacaoOperacao s")
public class SituacaoOperacao implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="COD_SITUACAO_OPERACAO")
	private Integer codSituacaoOperacao;
	@Column(name="DES_SITUACAO_OPERACAO")
	private String desSituacaoOperacao;
	
	public Integer getCodSituacaoOperacao() {
		return codSituacaoOperacao;
	}
	public void setCodSituacaoOperacao(Integer codSituacaoOperacao) {
		this.codSituacaoOperacao = codSituacaoOperacao;
	}
	public String getDesSituacaoOperacao() {
		return desSituacaoOperacao;
	}
	public void setDesSituacaoOperacao(String desSituacaoOperacao) {
		this.desSituacaoOperacao = desSituacaoOperacao;
	}

}