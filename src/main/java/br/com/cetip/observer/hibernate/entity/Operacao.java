package br.com.cetip.observer.hibernate.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * The persistent class for the OPERACAO database table.
 * 
 */
@Entity
@Table(name="OPERACAO", schema="CETIP")
@NamedQuery(name="Operacao.findAll", query="SELECT o FROM Operacao o")
public class Operacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="NUM_ID_OPERACAO")
	private long numIdOperacao;

	@Column(name="COD_ANTIGO_IF")
	private String codAntigoIf;

	@Column(name="COD_CONTA_CONTRAPARTE")
	private String codContaContraparte;

	@Column(name="COD_CONTA_PARTE")
	private String codContaParte;

	@Column(name="COD_CONV_PERM")
	private String codConvPerm;

	@Column(name="COD_CTL_PROCESSAMENTO")
	private String codCtlProcessamento;

	@Column(name="COD_ID_CANAL_P1")
	private String codIdCanalP1;

	@Column(name="COD_ID_CANAL_P2")
	private String codIdCanalP2;

	@Column(name="COD_IF")
	private String codIf;

	@Column(name="COD_NU_OPER_CONTRAPARTE")
	private String codNuOperContraparte;

	@Column(name="COD_NU_OPER_PARTE")
	private String codNuOperParte;

	@Column(name="COD_OPERACAO")
	private String codOperacao;

	@Column(name="COD_OPERACAO_CONSOLIDA")
	private String codOperacaoConsolida;

	@Column(name="COD_OPERACAO_ORIGINAL")
	private String codOperacaoOriginal;

	@Column(name="COD_PARTIC_ISPB_CONTRAPARTE")
	private String codParticIspbContraparte;

	@Column(name="COD_PARTIC_ISPB_PARTE")
	private String codParticIspbParte;

	@Column(name="COD_SITUACAO_OPERACAO")
	private BigDecimal codSituacaoOperacao;

	@Column(name="COD_TIPO_DEBITO_P1")
	private BigDecimal codTipoDebitoP1;

	@Column(name="COD_TIPO_DEBITO_P2")
	private BigDecimal codTipoDebitoP2;

	@Column(name="COD_TIPO_IF_OP")
	private String codTipoIfOp;

	@Temporal(TemporalType.DATE)
	@Column(name="DAT_ALTERACAO")
	private Calendar datAlteracao;

	@Temporal(TemporalType.DATE)
	@Column(name="DAT_AQUISICAO")
	private Calendar datAquisicao;

	@Temporal(TemporalType.DATE)
	@Column(name="DAT_EXCLUSAO")
	private Calendar datExclusao;

	@Temporal(TemporalType.DATE)
	@Column(name="DAT_EXPURGO")
	private Calendar datExpurgo;

	@Temporal(TemporalType.DATE)
	@Column(name="DAT_FINANCEIRO")
	private Calendar datFinanceiro;

	@Temporal(TemporalType.DATE)
	@Column(name="DAT_INCLUSAO")
	private Calendar datInclusao;

	@Temporal(TemporalType.DATE)
	@Column(name="DAT_OPERACAO")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private Calendar datOperacao;

	@Temporal(TemporalType.DATE)
	@Column(name="DAT_OPERACAO_ORIGINAL")
	private Calendar datOperacaoOriginal;

	@Temporal(TemporalType.DATE)
	@Column(name="DAT_PU_CALCULADO")
	private Calendar datPuCalculado;

	@Column(name="IND_ACEITA_IF_INADIMPLENTE")
	private String indAceitaIfInadimplente;

	@Column(name="IND_ANALISADA")
	private String indAnalisada;

	@Column(name="IND_ASSOCIACAO",columnDefinition = "char")
	private String indAssociacao;

	@Column(name="IND_CALCULA_PU")
	private String indCalculaPu;

	@Column(name="IND_CIENCIA_AUSENCIA_AUT_CVM")
	private String indCienciaAusenciaAutCvm;

	@Column(name="IND_CORTE_APURACAO",columnDefinition = "char")
	private String indCorteApuracao;

	@Column(name="IND_CTL_INCLUSAO")
	private String indCtlInclusao;

	@Column(name="IND_DIREITO_CAUCIONANTE")
	private String indDireitoCaucionante;

	@Column(name="IND_EVENTOS_CURSADOS_CETIP")
	private String indEventosCursadosCetip;

	@Column(name="IND_IDENTIFICACAO_AUTOMATICA")
	private String indIdentificacaoAutomatica;

	@Column(name="IND_LANCADO_P1")
	private String indLancadoP1;

	@Column(name="IND_LANCADO_P2")
	private String indLancadoP2;

	@Column(name="IND_OPERACAO_COMPLEMENTAR")
	private String indOperacaoComplementar;

	@Column(name="IND_ORIGEM_CETIPNET")
	private String indOrigemCetipnet;

	@Column(name="NOM_ENTIDADE_CONTRAPARTE")
	private String nomEntidadeContraparte;

	@Column(name="NOM_ENTIDADE_PARTE")
	private String nomEntidadeParte;

	@Column(name="NOM_LIQUIDANTE_CONTRAPARTE")
	private String nomLiquidanteContraparte;

	@Column(name="NOM_LIQUIDANTE_PARTE")
	private String nomLiquidanteParte;

	@Column(name="NOM_SIMPL_LIQ_CONTRAPARTE")
	private String nomSimplLiqContraparte;

	@Column(name="NOM_SIMPL_LIQ_PARTE")
	private String nomSimplLiqParte;

	@Column(name="NOM_SIMPLIFICADO_CONTRAPARTE")
	private String nomSimplificadoContraparte;

	@Column(name="NOM_SIMPLIFICADO_PARTE")
	private String nomSimplificadoParte;

	@Column(name="NOM_ST_CONTA_CONTRAPARTE")
	private String nomStContaContraparte;

	@Column(name="NOM_ST_CONTA_PARTE")
	private String nomStContaParte;

	@Column(name="NUM_ASSOCIACAO")
	private BigDecimal numAssociacao;

	@Column(name="NUM_ASSOCIACAO_LANC_P1")
	private BigDecimal numAssociacaoLancP1;

	@Column(name="NUM_ASSOCIACAO_LANC_P2")
	private BigDecimal numAssociacaoLancP2;

	@Column(name="NUM_CONTA_CUSTODIANTE")
	private BigDecimal numContaCustodiante;

	@Column(name="NUM_CONTA_ESCRITURADOR")
	private BigDecimal numContaEscriturador;

	@Column(name="NUM_CONTA_PARTICIPANTE_P1")
	private BigDecimal numContaParticipanteP1;

	@Column(name="NUM_CONTA_PARTICIPANTE_P2")
	private BigDecimal numContaParticipanteP2;

	@Column(name="NUM_CONTROLE_LANC_ORIGINAL_P1")
	private String numControleLancOriginalP1;

	@Column(name="NUM_CONTROLE_LANC_ORIGINAL_P2")
	private String numControleLancOriginalP2;

	@Column(name="NUM_CONTROLE_LANCAMENTO_P1")
	private String numControleLancamentoP1;

	@Column(name="NUM_CONTROLE_LANCAMENTO_P2")
	private String numControleLancamentoP2;

	@Column(name="NUM_EVENTO")
	private BigDecimal numEvento;

	@Column(name="NUM_ID_CESTA_GARANTIAS")
	private BigDecimal numIdCestaGarantias;

	@Column(name="NUM_ID_CONTRAPARTE")
	private BigDecimal numIdContraparte;

	@Column(name="NUM_ID_CTX_MSG_P1")
	private BigDecimal numIdCtxMsgP1;

	@Column(name="NUM_ID_CTX_MSG_P2")
	private BigDecimal numIdCtxMsgP2;

	@Column(name="NUM_ID_ENTIDADE_MCC_P1")
	private BigDecimal numIdEntidadeMccP1;

	@Column(name="NUM_ID_ENTIDADE_MCC_P2")
	private BigDecimal numIdEntidadeMccP2;

	@Column(name="NUM_ID_ENTIDADE_P1")
	private BigDecimal numIdEntidadeP1;

	@Column(name="NUM_ID_ENTIDADE_P2")
	private BigDecimal numIdEntidadeP2;

	@Column(name="NUM_ID_MODALIDADE_LIQUIDACAO")
	private BigDecimal numIdModalidadeLiquidacao;

	@Column(name="NUM_ID_PARAMETRO_PONTA_P1")
	private BigDecimal numIdParametroPontaP1;

	@Column(name="NUM_ID_PARAMETRO_PONTA_P2")
	private BigDecimal numIdParametroPontaP2;

	@Column(name="NUM_ID_PARTE")
	private BigDecimal numIdParte;

	@Column(name="NUM_ID_POSICAO_FINANCEIRA_P1")
	private BigDecimal numIdPosicaoFinanceiraP1;

	@Column(name="NUM_ID_POSICAO_FINANCEIRA_P2")
	private BigDecimal numIdPosicaoFinanceiraP2;

	@Column(name="NUM_ID_TIPO_OPER_OBJETO_SERV")
	private BigDecimal numIdTipoOperObjetoServ;

	@Column(name="NUM_ID_TIPO_REGIME_TITULO")
	private BigDecimal numIdTipoRegimeTitulo;

	@Column(name="NUM_ID_TRANSF_ARQ_P1")
	private BigDecimal numIdTransfArqP1;

	@Column(name="NUM_ID_TRANSF_ARQ_P2")
	private BigDecimal numIdTransfArqP2;

	@Column(name="NUM_IF")
	private BigDecimal numIf;

	@Column(name="NUM_IF_PERTENCE")
	private BigDecimal numIfPertence;

	@Column(name="NUM_INDICE_VALORIZACAO")
	private BigDecimal numIndiceValorizacao;

	@Column(name="NUM_LEILAO")
	private BigDecimal numLeilao;

	@Column(name="NUM_NEGOCIO")
	private BigDecimal numNegocio;

	@Column(name="NUM_ORDEM_ASSOCIACAO")
	private BigDecimal numOrdemAssociacao;

	@Column(name="NUM_TENTATIVAS_SUBIDA")
	private BigDecimal numTentativasSubida;

	@Column(name="QTD_MEMBROS_ASSOCIACAO")
	private BigDecimal qtdMembrosAssociacao;

	@Column(name="QTD_OPERACAO")
	private BigDecimal qtdOperacao;

	@Column(name="QTD_OPERACAO_ORIGINAL")
	private BigDecimal qtdOperacaoOriginal;

	@Temporal(TemporalType.DATE)
	@Column(name="TSP_SITUACAO")
	private Calendar tspSituacao;

	@Column(name="TXT_HISTORICO")
	private String txtHistorico;

	@Column(name="VAL_COTACAO")
	private BigDecimal valCotacao;

	@Column(name="VAL_FINANCEIRO")
	private BigDecimal valFinanceiro;

	@Column(name="VAL_PRECO_UNITARIO")
	private BigDecimal valPrecoUnitario;

	@Column(name="VAL_PU_AQUISICAO")
	private BigDecimal valPuAquisicao;

	@Column(name="VAL_PU_CALCULADO")
	private BigDecimal valPuCalculado;

	@Column(name="VAL_PU_OPERACAO_ORIGINAL")
	private BigDecimal valPuOperacaoOriginal;

	@Column(name="VAL_TAXA_COLOCACAO")
	private BigDecimal valTaxaColocacao;

	@Column(name="VAL_TIME_STAMP_ATUALIZACAO")
	private String valTimeStampAtualizacao;

	public Operacao() {
	}

	public long getNumIdOperacao() {
		return this.numIdOperacao;
	}

	public void setNumIdOperacao(long numIdOperacao) {
		this.numIdOperacao = numIdOperacao;
	}

	public String getCodAntigoIf() {
		return this.codAntigoIf;
	}

	public void setCodAntigoIf(String codAntigoIf) {
		this.codAntigoIf = codAntigoIf;
	}

	public String getCodContaContraparte() {
		return this.codContaContraparte;
	}

	public void setCodContaContraparte(String codContaContraparte) {
		this.codContaContraparte = codContaContraparte;
	}

	public String getCodContaParte() {
		return this.codContaParte;
	}

	public void setCodContaParte(String codContaParte) {
		this.codContaParte = codContaParte;
	}

	public String getCodConvPerm() {
		return this.codConvPerm;
	}

	public void setCodConvPerm(String codConvPerm) {
		this.codConvPerm = codConvPerm;
	}

	public String getCodCtlProcessamento() {
		return this.codCtlProcessamento;
	}

	public void setCodCtlProcessamento(String codCtlProcessamento) {
		this.codCtlProcessamento = codCtlProcessamento;
	}

	public String getCodIdCanalP1() {
		return this.codIdCanalP1;
	}

	public void setCodIdCanalP1(String codIdCanalP1) {
		this.codIdCanalP1 = codIdCanalP1;
	}

	public String getCodIdCanalP2() {
		return this.codIdCanalP2;
	}

	public void setCodIdCanalP2(String codIdCanalP2) {
		this.codIdCanalP2 = codIdCanalP2;
	}

	public String getCodIf() {
		return this.codIf;
	}

	public void setCodIf(String codIf) {
		this.codIf = codIf;
	}

	public String getCodNuOperContraparte() {
		return this.codNuOperContraparte;
	}

	public void setCodNuOperContraparte(String codNuOperContraparte) {
		this.codNuOperContraparte = codNuOperContraparte;
	}

	public String getCodNuOperParte() {
		return this.codNuOperParte;
	}

	public void setCodNuOperParte(String codNuOperParte) {
		this.codNuOperParte = codNuOperParte;
	}

	public String getCodOperacao() {
		return this.codOperacao;
	}

	public void setCodOperacao(String codOperacao) {
		this.codOperacao = codOperacao;
	}

	public String getCodOperacaoConsolida() {
		return this.codOperacaoConsolida;
	}

	public void setCodOperacaoConsolida(String codOperacaoConsolida) {
		this.codOperacaoConsolida = codOperacaoConsolida;
	}

	public String getCodOperacaoOriginal() {
		return this.codOperacaoOriginal;
	}

	public void setCodOperacaoOriginal(String codOperacaoOriginal) {
		this.codOperacaoOriginal = codOperacaoOriginal;
	}

	public String getCodParticIspbContraparte() {
		return this.codParticIspbContraparte;
	}

	public void setCodParticIspbContraparte(String codParticIspbContraparte) {
		this.codParticIspbContraparte = codParticIspbContraparte;
	}

	public String getCodParticIspbParte() {
		return this.codParticIspbParte;
	}

	public void setCodParticIspbParte(String codParticIspbParte) {
		this.codParticIspbParte = codParticIspbParte;
	}

	public BigDecimal getCodSituacaoOperacao() {
		return this.codSituacaoOperacao;
	}

	public void setCodSituacaoOperacao(BigDecimal codSituacaoOperacao) {
		this.codSituacaoOperacao = codSituacaoOperacao;
	}

	public BigDecimal getCodTipoDebitoP1() {
		return this.codTipoDebitoP1;
	}

	public void setCodTipoDebitoP1(BigDecimal codTipoDebitoP1) {
		this.codTipoDebitoP1 = codTipoDebitoP1;
	}

	public BigDecimal getCodTipoDebitoP2() {
		return this.codTipoDebitoP2;
	}

	public void setCodTipoDebitoP2(BigDecimal codTipoDebitoP2) {
		this.codTipoDebitoP2 = codTipoDebitoP2;
	}

	public String getCodTipoIfOp() {
		return this.codTipoIfOp;
	}

	public void setCodTipoIfOp(String codTipoIfOp) {
		this.codTipoIfOp = codTipoIfOp;
	}

	public Calendar getDatAlteracao() {
		return this.datAlteracao;
	}

	public void setDatAlteracao(Calendar datAlteracao) {
		this.datAlteracao = datAlteracao;
	}

	public Calendar getDatAquisicao() {
		return this.datAquisicao;
	}

	public void setDatAquisicao(Calendar datAquisicao) {
		this.datAquisicao = datAquisicao;
	}

	public Calendar getDatExclusao() {
		return this.datExclusao;
	}

	public void setDatExclusao(Calendar datExclusao) {
		this.datExclusao = datExclusao;
	}

	public Calendar getDatExpurgo() {
		return this.datExpurgo;
	}

	public void setDatExpurgo(Calendar datExpurgo) {
		this.datExpurgo = datExpurgo;
	}

	public Calendar getDatFinanceiro() {
		return this.datFinanceiro;
	}

	public void setDatFinanceiro(Calendar datFinanceiro) {
		this.datFinanceiro = datFinanceiro;
	}

	public Calendar getDatInclusao() {
		return this.datInclusao;
	}

	public void setDatInclusao(Calendar datInclusao) {
		this.datInclusao = datInclusao;
	}

	public Calendar getDatOperacao() {
		return this.datOperacao;
	}

	public void setDatOperacao(Calendar datOperacao) {
		this.datOperacao = datOperacao;
	}

	public Calendar getDatOperacaoOriginal() {
		return this.datOperacaoOriginal;
	}

	public void setDatOperacaoOriginal(Calendar datOperacaoOriginal) {
		this.datOperacaoOriginal = datOperacaoOriginal;
	}

	public Calendar getDatPuCalculado() {
		return this.datPuCalculado;
	}

	public void setDatPuCalculado(Calendar datPuCalculado) {
		this.datPuCalculado = datPuCalculado;
	}

	public String getIndAceitaIfInadimplente() {
		return this.indAceitaIfInadimplente;
	}

	public void setIndAceitaIfInadimplente(String indAceitaIfInadimplente) {
		this.indAceitaIfInadimplente = indAceitaIfInadimplente;
	}

	public String getIndAnalisada() {
		return this.indAnalisada;
	}

	public void setIndAnalisada(String indAnalisada) {
		this.indAnalisada = indAnalisada;
	}

	public String getIndAssociacao() {
		return this.indAssociacao;
	}

	public void setIndAssociacao(String indAssociacao) {
		this.indAssociacao = indAssociacao;
	}

	public String getIndCalculaPu() {
		return this.indCalculaPu;
	}

	public void setIndCalculaPu(String indCalculaPu) {
		this.indCalculaPu = indCalculaPu;
	}

	public String getIndCienciaAusenciaAutCvm() {
		return this.indCienciaAusenciaAutCvm;
	}

	public void setIndCienciaAusenciaAutCvm(String indCienciaAusenciaAutCvm) {
		this.indCienciaAusenciaAutCvm = indCienciaAusenciaAutCvm;
	}

	public String getIndCorteApuracao() {
		return this.indCorteApuracao;
	}

	public void setIndCorteApuracao(String indCorteApuracao) {
		this.indCorteApuracao = indCorteApuracao;
	}

	public String getIndCtlInclusao() {
		return this.indCtlInclusao;
	}

	public void setIndCtlInclusao(String indCtlInclusao) {
		this.indCtlInclusao = indCtlInclusao;
	}

	public String getIndDireitoCaucionante() {
		return this.indDireitoCaucionante;
	}

	public void setIndDireitoCaucionante(String indDireitoCaucionante) {
		this.indDireitoCaucionante = indDireitoCaucionante;
	}

	public String getIndEventosCursadosCetip() {
		return this.indEventosCursadosCetip;
	}

	public void setIndEventosCursadosCetip(String indEventosCursadosCetip) {
		this.indEventosCursadosCetip = indEventosCursadosCetip;
	}

	public String getIndIdentificacaoAutomatica() {
		return this.indIdentificacaoAutomatica;
	}

	public void setIndIdentificacaoAutomatica(String indIdentificacaoAutomatica) {
		this.indIdentificacaoAutomatica = indIdentificacaoAutomatica;
	}

	public String getIndLancadoP1() {
		return this.indLancadoP1;
	}

	public void setIndLancadoP1(String indLancadoP1) {
		this.indLancadoP1 = indLancadoP1;
	}

	public String getIndLancadoP2() {
		return this.indLancadoP2;
	}

	public void setIndLancadoP2(String indLancadoP2) {
		this.indLancadoP2 = indLancadoP2;
	}

	public String getIndOperacaoComplementar() {
		return this.indOperacaoComplementar;
	}

	public void setIndOperacaoComplementar(String indOperacaoComplementar) {
		this.indOperacaoComplementar = indOperacaoComplementar;
	}

	public String getIndOrigemCetipnet() {
		return this.indOrigemCetipnet;
	}

	public void setIndOrigemCetipnet(String indOrigemCetipnet) {
		this.indOrigemCetipnet = indOrigemCetipnet;
	}

	public String getNomEntidadeContraparte() {
		return this.nomEntidadeContraparte;
	}

	public void setNomEntidadeContraparte(String nomEntidadeContraparte) {
		this.nomEntidadeContraparte = nomEntidadeContraparte;
	}

	public String getNomEntidadeParte() {
		return this.nomEntidadeParte;
	}

	public void setNomEntidadeParte(String nomEntidadeParte) {
		this.nomEntidadeParte = nomEntidadeParte;
	}

	public String getNomLiquidanteContraparte() {
		return this.nomLiquidanteContraparte;
	}

	public void setNomLiquidanteContraparte(String nomLiquidanteContraparte) {
		this.nomLiquidanteContraparte = nomLiquidanteContraparte;
	}

	public String getNomLiquidanteParte() {
		return this.nomLiquidanteParte;
	}

	public void setNomLiquidanteParte(String nomLiquidanteParte) {
		this.nomLiquidanteParte = nomLiquidanteParte;
	}

	public String getNomSimplLiqContraparte() {
		return this.nomSimplLiqContraparte;
	}

	public void setNomSimplLiqContraparte(String nomSimplLiqContraparte) {
		this.nomSimplLiqContraparte = nomSimplLiqContraparte;
	}

	public String getNomSimplLiqParte() {
		return this.nomSimplLiqParte;
	}

	public void setNomSimplLiqParte(String nomSimplLiqParte) {
		this.nomSimplLiqParte = nomSimplLiqParte;
	}

	public String getNomSimplificadoContraparte() {
		return this.nomSimplificadoContraparte;
	}

	public void setNomSimplificadoContraparte(String nomSimplificadoContraparte) {
		this.nomSimplificadoContraparte = nomSimplificadoContraparte;
	}

	public String getNomSimplificadoParte() {
		return this.nomSimplificadoParte;
	}

	public void setNomSimplificadoParte(String nomSimplificadoParte) {
		this.nomSimplificadoParte = nomSimplificadoParte;
	}

	public String getNomStContaContraparte() {
		return this.nomStContaContraparte;
	}

	public void setNomStContaContraparte(String nomStContaContraparte) {
		this.nomStContaContraparte = nomStContaContraparte;
	}

	public String getNomStContaParte() {
		return this.nomStContaParte;
	}

	public void setNomStContaParte(String nomStContaParte) {
		this.nomStContaParte = nomStContaParte;
	}

	public BigDecimal getNumAssociacao() {
		return this.numAssociacao;
	}

	public void setNumAssociacao(BigDecimal numAssociacao) {
		this.numAssociacao = numAssociacao;
	}

	public BigDecimal getNumAssociacaoLancP1() {
		return this.numAssociacaoLancP1;
	}

	public void setNumAssociacaoLancP1(BigDecimal numAssociacaoLancP1) {
		this.numAssociacaoLancP1 = numAssociacaoLancP1;
	}

	public BigDecimal getNumAssociacaoLancP2() {
		return this.numAssociacaoLancP2;
	}

	public void setNumAssociacaoLancP2(BigDecimal numAssociacaoLancP2) {
		this.numAssociacaoLancP2 = numAssociacaoLancP2;
	}

	public BigDecimal getNumContaCustodiante() {
		return this.numContaCustodiante;
	}

	public void setNumContaCustodiante(BigDecimal numContaCustodiante) {
		this.numContaCustodiante = numContaCustodiante;
	}

	public BigDecimal getNumContaEscriturador() {
		return this.numContaEscriturador;
	}

	public void setNumContaEscriturador(BigDecimal numContaEscriturador) {
		this.numContaEscriturador = numContaEscriturador;
	}

	public BigDecimal getNumContaParticipanteP1() {
		return this.numContaParticipanteP1;
	}

	public void setNumContaParticipanteP1(BigDecimal numContaParticipanteP1) {
		this.numContaParticipanteP1 = numContaParticipanteP1;
	}

	public BigDecimal getNumContaParticipanteP2() {
		return this.numContaParticipanteP2;
	}

	public void setNumContaParticipanteP2(BigDecimal numContaParticipanteP2) {
		this.numContaParticipanteP2 = numContaParticipanteP2;
	}

	public String getNumControleLancOriginalP1() {
		return this.numControleLancOriginalP1;
	}

	public void setNumControleLancOriginalP1(String numControleLancOriginalP1) {
		this.numControleLancOriginalP1 = numControleLancOriginalP1;
	}

	public String getNumControleLancOriginalP2() {
		return this.numControleLancOriginalP2;
	}

	public void setNumControleLancOriginalP2(String numControleLancOriginalP2) {
		this.numControleLancOriginalP2 = numControleLancOriginalP2;
	}

	public String getNumControleLancamentoP1() {
		return this.numControleLancamentoP1;
	}

	public void setNumControleLancamentoP1(String numControleLancamentoP1) {
		this.numControleLancamentoP1 = numControleLancamentoP1;
	}

	public String getNumControleLancamentoP2() {
		return this.numControleLancamentoP2;
	}

	public void setNumControleLancamentoP2(String numControleLancamentoP2) {
		this.numControleLancamentoP2 = numControleLancamentoP2;
	}

	public BigDecimal getNumEvento() {
		return this.numEvento;
	}

	public void setNumEvento(BigDecimal numEvento) {
		this.numEvento = numEvento;
	}

	public BigDecimal getNumIdCestaGarantias() {
		return this.numIdCestaGarantias;
	}

	public void setNumIdCestaGarantias(BigDecimal numIdCestaGarantias) {
		this.numIdCestaGarantias = numIdCestaGarantias;
	}

	public BigDecimal getNumIdContraparte() {
		return this.numIdContraparte;
	}

	public void setNumIdContraparte(BigDecimal numIdContraparte) {
		this.numIdContraparte = numIdContraparte;
	}

	public BigDecimal getNumIdCtxMsgP1() {
		return this.numIdCtxMsgP1;
	}

	public void setNumIdCtxMsgP1(BigDecimal numIdCtxMsgP1) {
		this.numIdCtxMsgP1 = numIdCtxMsgP1;
	}

	public BigDecimal getNumIdCtxMsgP2() {
		return this.numIdCtxMsgP2;
	}

	public void setNumIdCtxMsgP2(BigDecimal numIdCtxMsgP2) {
		this.numIdCtxMsgP2 = numIdCtxMsgP2;
	}

	public BigDecimal getNumIdEntidadeMccP1() {
		return this.numIdEntidadeMccP1;
	}

	public void setNumIdEntidadeMccP1(BigDecimal numIdEntidadeMccP1) {
		this.numIdEntidadeMccP1 = numIdEntidadeMccP1;
	}

	public BigDecimal getNumIdEntidadeMccP2() {
		return this.numIdEntidadeMccP2;
	}

	public void setNumIdEntidadeMccP2(BigDecimal numIdEntidadeMccP2) {
		this.numIdEntidadeMccP2 = numIdEntidadeMccP2;
	}

	public BigDecimal getNumIdEntidadeP1() {
		return this.numIdEntidadeP1;
	}

	public void setNumIdEntidadeP1(BigDecimal numIdEntidadeP1) {
		this.numIdEntidadeP1 = numIdEntidadeP1;
	}

	public BigDecimal getNumIdEntidadeP2() {
		return this.numIdEntidadeP2;
	}

	public void setNumIdEntidadeP2(BigDecimal numIdEntidadeP2) {
		this.numIdEntidadeP2 = numIdEntidadeP2;
	}

	public BigDecimal getNumIdModalidadeLiquidacao() {
		return this.numIdModalidadeLiquidacao;
	}

	public void setNumIdModalidadeLiquidacao(BigDecimal numIdModalidadeLiquidacao) {
		this.numIdModalidadeLiquidacao = numIdModalidadeLiquidacao;
	}

	public BigDecimal getNumIdParametroPontaP1() {
		return this.numIdParametroPontaP1;
	}

	public void setNumIdParametroPontaP1(BigDecimal numIdParametroPontaP1) {
		this.numIdParametroPontaP1 = numIdParametroPontaP1;
	}

	public BigDecimal getNumIdParametroPontaP2() {
		return this.numIdParametroPontaP2;
	}

	public void setNumIdParametroPontaP2(BigDecimal numIdParametroPontaP2) {
		this.numIdParametroPontaP2 = numIdParametroPontaP2;
	}

	public BigDecimal getNumIdParte() {
		return this.numIdParte;
	}

	public void setNumIdParte(BigDecimal numIdParte) {
		this.numIdParte = numIdParte;
	}

	public BigDecimal getNumIdPosicaoFinanceiraP1() {
		return this.numIdPosicaoFinanceiraP1;
	}

	public void setNumIdPosicaoFinanceiraP1(BigDecimal numIdPosicaoFinanceiraP1) {
		this.numIdPosicaoFinanceiraP1 = numIdPosicaoFinanceiraP1;
	}

	public BigDecimal getNumIdPosicaoFinanceiraP2() {
		return this.numIdPosicaoFinanceiraP2;
	}

	public void setNumIdPosicaoFinanceiraP2(BigDecimal numIdPosicaoFinanceiraP2) {
		this.numIdPosicaoFinanceiraP2 = numIdPosicaoFinanceiraP2;
	}

	public BigDecimal getNumIdTipoOperObjetoServ() {
		return this.numIdTipoOperObjetoServ;
	}

	public void setNumIdTipoOperObjetoServ(BigDecimal numIdTipoOperObjetoServ) {
		this.numIdTipoOperObjetoServ = numIdTipoOperObjetoServ;
	}

	public BigDecimal getNumIdTipoRegimeTitulo() {
		return this.numIdTipoRegimeTitulo;
	}

	public void setNumIdTipoRegimeTitulo(BigDecimal numIdTipoRegimeTitulo) {
		this.numIdTipoRegimeTitulo = numIdTipoRegimeTitulo;
	}

	public BigDecimal getNumIdTransfArqP1() {
		return this.numIdTransfArqP1;
	}

	public void setNumIdTransfArqP1(BigDecimal numIdTransfArqP1) {
		this.numIdTransfArqP1 = numIdTransfArqP1;
	}

	public BigDecimal getNumIdTransfArqP2() {
		return this.numIdTransfArqP2;
	}

	public void setNumIdTransfArqP2(BigDecimal numIdTransfArqP2) {
		this.numIdTransfArqP2 = numIdTransfArqP2;
	}

	public BigDecimal getNumIf() {
		return this.numIf;
	}

	public void setNumIf(BigDecimal numIf) {
		this.numIf = numIf;
	}

	public BigDecimal getNumIfPertence() {
		return this.numIfPertence;
	}

	public void setNumIfPertence(BigDecimal numIfPertence) {
		this.numIfPertence = numIfPertence;
	}

	public BigDecimal getNumIndiceValorizacao() {
		return this.numIndiceValorizacao;
	}

	public void setNumIndiceValorizacao(BigDecimal numIndiceValorizacao) {
		this.numIndiceValorizacao = numIndiceValorizacao;
	}

	public BigDecimal getNumLeilao() {
		return this.numLeilao;
	}

	public void setNumLeilao(BigDecimal numLeilao) {
		this.numLeilao = numLeilao;
	}

	public BigDecimal getNumNegocio() {
		return this.numNegocio;
	}

	public void setNumNegocio(BigDecimal numNegocio) {
		this.numNegocio = numNegocio;
	}

	public BigDecimal getNumOrdemAssociacao() {
		return this.numOrdemAssociacao;
	}

	public void setNumOrdemAssociacao(BigDecimal numOrdemAssociacao) {
		this.numOrdemAssociacao = numOrdemAssociacao;
	}

	public BigDecimal getNumTentativasSubida() {
		return this.numTentativasSubida;
	}

	public void setNumTentativasSubida(BigDecimal numTentativasSubida) {
		this.numTentativasSubida = numTentativasSubida;
	}

	public BigDecimal getQtdMembrosAssociacao() {
		return this.qtdMembrosAssociacao;
	}

	public void setQtdMembrosAssociacao(BigDecimal qtdMembrosAssociacao) {
		this.qtdMembrosAssociacao = qtdMembrosAssociacao;
	}

	public BigDecimal getQtdOperacao() {
		return this.qtdOperacao;
	}

	public void setQtdOperacao(BigDecimal qtdOperacao) {
		this.qtdOperacao = qtdOperacao;
	}

	public BigDecimal getQtdOperacaoOriginal() {
		return this.qtdOperacaoOriginal;
	}

	public void setQtdOperacaoOriginal(BigDecimal qtdOperacaoOriginal) {
		this.qtdOperacaoOriginal = qtdOperacaoOriginal;
	}

	public Calendar getTspSituacao() {
		return this.tspSituacao;
	}

	public void setTspSituacao(Calendar tspSituacao) {
		this.tspSituacao = tspSituacao;
	}

	public String getTxtHistorico() {
		return this.txtHistorico;
	}

	public void setTxtHistorico(String txtHistorico) {
		this.txtHistorico = txtHistorico;
	}

	public BigDecimal getValCotacao() {
		return this.valCotacao;
	}

	public void setValCotacao(BigDecimal valCotacao) {
		this.valCotacao = valCotacao;
	}

	public BigDecimal getValFinanceiro() {
		return this.valFinanceiro;
	}

	public void setValFinanceiro(BigDecimal valFinanceiro) {
		this.valFinanceiro = valFinanceiro;
	}

	public BigDecimal getValPrecoUnitario() {
		return this.valPrecoUnitario;
	}

	public void setValPrecoUnitario(BigDecimal valPrecoUnitario) {
		this.valPrecoUnitario = valPrecoUnitario;
	}

	public BigDecimal getValPuAquisicao() {
		return this.valPuAquisicao;
	}

	public void setValPuAquisicao(BigDecimal valPuAquisicao) {
		this.valPuAquisicao = valPuAquisicao;
	}

	public BigDecimal getValPuCalculado() {
		return this.valPuCalculado;
	}

	public void setValPuCalculado(BigDecimal valPuCalculado) {
		this.valPuCalculado = valPuCalculado;
	}

	public BigDecimal getValPuOperacaoOriginal() {
		return this.valPuOperacaoOriginal;
	}

	public void setValPuOperacaoOriginal(BigDecimal valPuOperacaoOriginal) {
		this.valPuOperacaoOriginal = valPuOperacaoOriginal;
	}

	public BigDecimal getValTaxaColocacao() {
		return this.valTaxaColocacao;
	}

	public void setValTaxaColocacao(BigDecimal valTaxaColocacao) {
		this.valTaxaColocacao = valTaxaColocacao;
	}

	public String getValTimeStampAtualizacao() {
		return this.valTimeStampAtualizacao;
	}

	public void setValTimeStampAtualizacao(String valTimeStampAtualizacao) {
		this.valTimeStampAtualizacao = valTimeStampAtualizacao;
	}

}