package br.com.cetip.observer.hibernate.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * The persistent class for the CHART database table.
 * 
 */
@Entity
@NamedQuery(name="Chart.findAll", query="SELECT c FROM Chart c")
public class Chart implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public Chart() {
		// TODO Auto-generated constructor stub
	}
	
	public Chart(String options, String data, String api,Calendar datInclusao) {
		this.options = options;
		this.data = data;
		this.api = api;
		this.datInclusao = datInclusao;
	}
	
	@Id
	@SequenceGenerator(name="CHART_NUMIDCHART_GENERATOR", sequenceName="S_CHART")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CHART_NUMIDCHART_GENERATOR")
	@Column(name="NUM_ID_CHART")
	private long numIdChart;

	private String api;
	
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

	@Column(name="\"DATA\"")
	private String data;

	private String options;

	//bi-directional many-to-one association to Widget
	@OneToMany(mappedBy="chart",fetch=FetchType.LAZY)
	private List<Widget> widgets;

	public long getNumIdChart() {
		return this.numIdChart;
	}

	public void setNumIdChart(long numIdChart) {
		this.numIdChart = numIdChart;
	}

	public String getApi() {
		return this.api;
	}

	public void setApi(String api) {
		this.api = api;
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

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getOptions() {
		return this.options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public List<Widget> getWidgets() {
		return this.widgets;
	}

	public void setWidgets(List<Widget> widgets) {
		this.widgets = widgets;
	}

	public Widget addWidget(Widget widget) {
		getWidgets().add(widget);
		widget.setChart(this);

		return widget;
	}

	public Widget removeWidget(Widget widget) {
		getWidgets().remove(widget);
		widget.setChart(null);

		return widget;
	}

}