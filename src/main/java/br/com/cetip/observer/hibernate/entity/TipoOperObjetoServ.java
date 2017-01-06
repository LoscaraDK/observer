package br.com.cetip.observer.hibernate.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;


/**
 * The persistent class for the TIPO_OPER_OBJETO_SERV database table.
 * 
 */
@Entity
@Table(name="TIPO_OPER_OBJETO_SERV", schema="CETIP",uniqueConstraints=@UniqueConstraint(columnNames={"NUM_ID_TIPO_OPER_OBJETO_SERV", "NUM_ID_TIPO_OPERACAO","NUM_ID_OBJETO_SERVICO"}))
@NamedQuery(name="TipoOperObjetoServ.findAll", query="SELECT t FROM TipoOperObjetoServ t")
public class TipoOperObjetoServ implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="NUM_ID_TIPO_OPER_OBJETO_SERV")
	private long numIdTipoOperObjetoServ;

	@Column(name="NUM_ID_OBJETO_SERVICO")
	private BigDecimal numIdObjetoServico;

	//bi-directional many-to-one association to TipoOperacao
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="NUM_ID_TIPO_OPERACAO")
	private TipoOperacao tipoOperacao;

	public TipoOperObjetoServ() {
	}

	public long getNumIdTipoOperObjetoServ() {
		return this.numIdTipoOperObjetoServ;
	}

	public void setNumIdTipoOperObjetoServ(long numIdTipoOperObjetoServ) {
		this.numIdTipoOperObjetoServ = numIdTipoOperObjetoServ;
	}

	public BigDecimal getNumIdObjetoServico() {
		return this.numIdObjetoServico;
	}

	public void setNumIdObjetoServico(BigDecimal numIdObjetoServico) {
		this.numIdObjetoServico = numIdObjetoServico;
	}

	public TipoOperacao getTipoOperacao() {
		return tipoOperacao;
	}

	public void setNumIdTipoOperacao(TipoOperacao tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}

}