package br.com.cetip.observer.dto;

import java.math.BigDecimal;


public class VolumeFinanceiroDiarioDTO {
	private Long totalOperacoes;
	private BigDecimal volFinanceiro;
	private String desSituacaoOperacao;
	private String codTipoIF;
	
	
	
	public VolumeFinanceiroDiarioDTO(Long totalOperacoes, BigDecimal volFinanceiro, String desSituacaoOperacao,
			String codTipoIF) {
		super();
		this.totalOperacoes = totalOperacoes;
		this.volFinanceiro = volFinanceiro;
		this.desSituacaoOperacao = desSituacaoOperacao;
		this.codTipoIF = codTipoIF;
	}



	public Long getTotalOperacoes() {
		return totalOperacoes;
	}



	public BigDecimal getVolFinanceiro() {
		return volFinanceiro;
	}



	public String getDesSituacaoOperacao() {
		return desSituacaoOperacao;
	}



	public String getCodTipoIF() {
		return codTipoIF;
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
