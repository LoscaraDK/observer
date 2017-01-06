package br.com.cetip.observer.hibernate.listener;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import br.com.cetip.observer.hibernate.util.HibernateUtil;

public class LocalEntityManagerFactory implements ServletContextListener{
	private static EntityManagerFactory emf;
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		HibernateUtil.getEntityManagerFactory().close();
		System.out.println(">>> LocalEntityManagerFactory.contextDestroyed - Fechando a sessão!");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		emf = HibernateUtil.getEntityManagerFactory();
		System.out.println(">>> LocalEntityManagerFactory.contextInitialized - Criando a sessão!");
	}
	
	public static EntityManager createEntityManager(){
		if(emf == null){
			throw new IllegalStateException("Contexto não inicializado!");
		}
		
		return emf.createEntityManager();		
	}

}
