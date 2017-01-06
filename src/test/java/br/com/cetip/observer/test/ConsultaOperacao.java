package br.com.cetip.observer.test;

import java.sql.Date;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.List;

import org.junit.Test;

import br.com.cetip.observer.hibernate.dao.OperacaoDAO;
import br.com.cetip.observer.hibernate.entity.Operacao;
import br.com.cetip.observer.hibernate.entity.VolumeFinanceiroDiarioVDO;

public class ConsultaOperacao {
	//@Test
	public void testaConsulta(){
		System.out.println("Entrou aqui");
		Operacao o = OperacaoDAO.getInstanceTest().getById(59156502L);
		Calendar c = Calendar.getInstance();
		c.set(2016, Calendar.NOVEMBER, 22);
		DateFormat df = DateFormat.getDateInstance();
		List<Operacao> operacoes = OperacaoDAO.getInstanceTest().getByDate(c);
		System.out.println("Operacao > "+o.getCodContaParte());
		System.out.println("Calendar > "+c.getTime());
		System.out.println("Calendar Format > "+df.format(c.getTime()));
		System.out.println("Tamanho array > "+operacoes.size());
		System.out.println("Saiu aqui");
		Calendar c2 = Calendar.getInstance();
		c2.setTimeInMillis(1480039200000L);
		System.out.println(c2.getTime());
		System.out.println("total> "+OperacaoDAO.getInstanceTest().getTotalByDate(Operacao.class,c));
//		OperacaoDAO.getInstance().close();
		
	}
	
	@Test
	public void testaConsultaDash() throws Exception{
		System.out.println("Entrou aqui");
		Calendar c = Calendar.getInstance();
		c.set(2016, Calendar.DECEMBER, 23);
		List<VolumeFinanceiroDiarioVDO> list= OperacaoDAO.getInstanceTest().getVolFinanceiroDiarioComStatus(43,c);
		System.out.println("total> "+list.size());
		System.out.println(list);
		
//		OperacaoDAO.getInstanceTest().close();
		
		
	}
}
