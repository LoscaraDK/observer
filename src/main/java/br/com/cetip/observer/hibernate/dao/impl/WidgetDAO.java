package br.com.cetip.observer.hibernate.dao.impl;

import javax.persistence.EntityManager;

import br.com.cetip.observer.hibernate.entity.Operacao;
import br.com.cetip.observer.hibernate.entity.Widget;
import br.com.cetip.observer.hibernate.listener.LocalEntityManagerFactory;
import br.com.cetip.observer.hibernate.util.HibernateUtil;

public class WidgetDAO {
	private static WidgetDAO instance;
	protected EntityManager entityManager;
	
	public static WidgetDAO getInstance(){
		if(instance == null){
			instance = new WidgetDAO();
		}
		return instance;
	}
	
	public static WidgetDAO getInstanceTest(){
		instance = new WidgetDAO(true);
		
		return instance;
	}
	
	private EntityManager getEntityManager() {
		return LocalEntityManagerFactory.createEntityManager();
	}
	
	private EntityManager getEntityManagerTest() {
		return HibernateUtil.getEntityManagerFactory().createEntityManager();
	}
	
	public void close() {
		HibernateUtil.getEntityManagerFactory().close();
	}
	
	private WidgetDAO(){
		entityManager = getEntityManager();
	}
	
	private WidgetDAO(boolean test){
		entityManager = getEntityManagerTest();
	}
	
	public Widget getById(final Long id) {
		entityManager.getTransaction().begin(); 
		Widget widget = entityManager.find(Widget.class, id);
		entityManager.getTransaction().commit();
		entityManager.close();
		
        return widget;
	}
	
	public void save(Widget widget) throws Exception{
		entityManager.getTransaction().begin(); 
		entityManager.persist(widget);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	public void delete(Widget widget) throws Exception{
		entityManager.getTransaction().begin(); 
		entityManager.remove(widget);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	public void update(Widget widget) throws Exception{
		entityManager.getTransaction().begin(); 
		entityManager.merge(widget);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	
}
