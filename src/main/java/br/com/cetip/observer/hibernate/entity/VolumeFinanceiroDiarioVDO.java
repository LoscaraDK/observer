package br.com.cetip.observer.hibernate.entity;

import java.math.BigDecimal;


public class VolumeFinanceiroDiarioVDO {
	private Long totalOperacoes;
	private BigDecimal volFinanceiro;
	private String desSituacaoOperacao;
	private String codTipoIF;
	
	public VolumeFinanceiroDiarioVDO(Long totalOperacoes,BigDecimal volFinanceiro,String desSituacaoOperacao,String codTipoIF) {
		// TODO Auto-generated constructor stub
		setTotalOperacoes(totalOperacoes);
		setVolFinanceiro(volFinanceiro);
		setDesSituacaoOperacao(desSituacaoOperacao);
		setCodTipoIF(codTipoIF);
	}
	
	public Long getTotalOperacoes() {
		return totalOperacoes;
	}
	public void setTotalOperacoes(Long totalOperacoes) {
		this.totalOperacoes = totalOperacoes;
	}
	public BigDecimal getVolFinanceiro() {
		return volFinanceiro;
	}
	public void setVolFinanceiro(BigDecimal volFinanceiro) {
		this.volFinanceiro = volFinanceiro;
	}
	public String getDesSituacaoOperacao() {
		return desSituacaoOperacao;
	}
	public void setDesSituacaoOperacao(String desSituacaoOperacao) {
		this.desSituacaoOperacao = desSituacaoOperacao;
	}
	public String getCodTipoIF() {
		return codTipoIF;
	}
	public void setCodTipoIF(String codTipoIF) {
		this.codTipoIF = codTipoIF;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{totalOperacoes:" + totalOperacoes + "," +
				"volFinanceiro:" + volFinanceiro + "," +
				"desSituacaoOperacao:" + desSituacaoOperacao + "," +
				"codTipoIF:" + codTipoIF + " }";
	}
}
