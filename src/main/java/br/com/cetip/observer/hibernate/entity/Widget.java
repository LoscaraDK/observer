package br.com.cetip.observer.hibernate.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Calendar;


/**
 * The persistent class for the WIDGET database table.
 * 
 */
@Entity
@NamedQuery(name="Widget.findAll", query="SELECT w FROM Widget w")
public class Widget implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public Widget() {
	}
	
	public Widget(int col,int row, int sizex, int sizey, String title, String type, Calendar datInclusao, long numIdUsuario, 
			Chart chart) {
		super();
		this.col = col;
		this.datInclusao = datInclusao;
		this.numIdUsuario = numIdUsuario;
		this.row = row;
		this.sizex = sizex;
		this.sizey = sizey;
		this.title = title;
		this.type = type;
		this.chart = chart;
	}

	@Id
	@SequenceGenerator(name="WIDGET_NUMIDWIDGET_GENERATOR", sequenceName="S_WIDGET")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="WIDGET_NUMIDWIDGET_GENERATOR")
	@Column(name="NUM_ID_WIDGET")
	private long numIdWidget;

	private int col;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	@Temporal(TemporalType.DATE)
	@Column(name="DAT_ALTERACAO")
	private Calendar datAlteracao;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	@Temporal(TemporalType.DATE)
	@Column(name="DAT_EXCLUSAO")
	private Calendar datExclusao;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	@Temporal(TemporalType.DATE)
	@Column(name="DAT_INCLUSAO")
	private Calendar datInclusao;

	@Column(name="NUM_ID_ENTIDADE_ATUALIZ")
	private long numIdEntidadeAtualiz;

	@Column(name="NUM_ID_USUARIO")
	private long numIdUsuario;

	@Column(name="\"ROW\"")
	private int row;

	private int sizex;

	private int sizey;

	private String title;

	@Column(name="\"TYPE\"")
	private String type;

	//bi-directional many-to-one association to Chart
	@ManyToOne
	@JoinColumn(name="NUM_ID_CHART")
	private Chart chart;

	public long getNumIdWidget() {
		return this.numIdWidget;
	}

	public void setNumIdWidget(long numIdWidget) {
		this.numIdWidget = numIdWidget;
	}

	public int getCol() {
		return this.col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public Calendar getDatAlteracao() {
		return this.datAlteracao;
	}

	public void setDatAlteracao(Calendar datAlteracao) {
		this.datAlteracao = datAlteracao;
	}

	public Calendar getDatExclusao() {
		return this.datExclusao;
	}

	public void setDatExclusao(Calendar datExclusao) {
		this.datExclusao = datExclusao;
	}

	public Calendar getDatInclusao() {
		return this.datInclusao;
	}

	public void setDatInclusao(Calendar datInclusao) {
		this.datInclusao = datInclusao;
	}

	public long getNumIdEntidadeAtualiz() {
		return this.numIdEntidadeAtualiz;
	}

	public void setNumIdEntidadeAtualiz(long numIdEntidadeAtualiz) {
		this.numIdEntidadeAtualiz = numIdEntidadeAtualiz;
	}

	public long getNumIdUsuario() {
		return this.numIdUsuario;
	}

	public void setNumIdUsuario(long numIdUsuario) {
		this.numIdUsuario = numIdUsuario;
	}

	public int getRow() {
		return this.row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getSizex() {
		return this.sizex;
	}

	public void setSizex(int sizex) {
		this.sizex = sizex;
	}

	public int getSizey() {
		return this.sizey;
	}

	public void setSizey(int sizey) {
		this.sizey = sizey;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Chart getChart() {
		return this.chart;
	}

	public void setChart(Chart chart) {
		this.chart = chart;
	}

}