package br.com.cetip.observer.hibernate.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;


/**
 * The persistent class for the REL_GRP_TP_OP_OBJ_SERV database table.
 * 
 */
@Entity
@Table(name="REL_GRP_TP_OP_OBJ_SERV", schema="CETIP")
@NamedQuery(name="RelGrpTpOpObjServ.findAll", query="SELECT r FROM RelGrpTpOpObjServ r")
public class RelGrpTpOpObjServ implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="NUM_ID_REL_GRP_TP_OP_OBJ_SERV")
	private long numIdRelGrpTpOpObjServ;

	@Temporal(TemporalType.DATE)
	@Column(name="DAT_EXCLUSAO")
	private Date datExclusao;

	@Temporal(TemporalType.DATE)
	@Column(name="DAT_INCLUSAO")
	private Date datInclusao;

	@Column(name="NUM_ID_GRP_TOP_OBJSERV_DIFUSAO")
	private java.math.BigDecimal numIdGrpTopObjservDifusao;

	//bi-directional many-to-one association to TipoOperObjetoServ
	@Column(name="NUM_ID_TIPO_OPER_OBJETO_SERV")
	private long numIdTipoOperObjetoServ;

	public RelGrpTpOpObjServ() {
	}

	public long getNumIdRelGrpTpOpObjServ() {
		return this.numIdRelGrpTpOpObjServ;
	}

	public void setNumIdRelGrpTpOpObjServ(long numIdRelGrpTpOpObjServ) {
		this.numIdRelGrpTpOpObjServ = numIdRelGrpTpOpObjServ;
	}

	public Date getDatExclusao() {
		return this.datExclusao;
	}

	public void setDatExclusao(Date datExclusao) {
		this.datExclusao = datExclusao;
	}

	public Date getDatInclusao() {
		return this.datInclusao;
	}

	public void setDatInclusao(Date datInclusao) {
		this.datInclusao = datInclusao;
	}

	public java.math.BigDecimal getNumIdGrpTopObjservDifusao() {
		return this.numIdGrpTopObjservDifusao;
	}

	public void setNumIdGrpTopObjservDifusao(java.math.BigDecimal numIdGrpTopObjservDifusao) {
		this.numIdGrpTopObjservDifusao = numIdGrpTopObjservDifusao;
	}

	public long getNumIdTipoOperObjetoServ() {
		return numIdTipoOperObjetoServ;
	}

	public void setNumIdTipoOperObjetoServ(long numIdTipoOperObjetoServ) {
		this.numIdTipoOperObjetoServ = numIdTipoOperObjetoServ;
	}

	

}