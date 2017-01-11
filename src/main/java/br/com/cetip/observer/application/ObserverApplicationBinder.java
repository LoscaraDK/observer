package br.com.cetip.observer.application;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

import br.com.cetip.observer.hibernate.dao.IOperacaoDAO;
import br.com.cetip.observer.hibernate.dao.impl.OperacaoDAOImpl;

public class ObserverApplicationBinder extends AbstractBinder {

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		bind(OperacaoDAOImpl.class).to(IOperacaoDAO.class);
	}

}
