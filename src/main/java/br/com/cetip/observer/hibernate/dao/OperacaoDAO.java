package br.com.cetip.observer.hibernate.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TemporalType;

import br.com.cetip.observer.hibernate.entity.Operacao;
import br.com.cetip.observer.hibernate.entity.VolumeFinanceiroDiarioVDO;
import br.com.cetip.observer.hibernate.listener.LocalEntityManagerFactory;
import br.com.cetip.observer.hibernate.util.HibernateUtil;

public class OperacaoDAO {
	private static OperacaoDAO instance;
	protected EntityManager entityManager;
	
	public static OperacaoDAO getInstance(){
		instance = new OperacaoDAO();
		
		return instance;
	}
	
	public static OperacaoDAO getInstanceTest(){
		instance = new OperacaoDAO(true);
		
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
	
	private OperacaoDAO(){
		entityManager = getEntityManager();
	}
	
	private OperacaoDAO(boolean test){
		entityManager = getEntityManagerTest();
	}
	
	public Operacao getById(final Long numIdOperacao) {
        return entityManager.find(Operacao.class, numIdOperacao);
	}
	
	
	public List<Operacao> getByDate(Calendar datOperacao) {
		Query query = entityManager.createQuery("from " + Operacao.class.getName() +" o where o.datOperacao = :datOperacao");
		query.setParameter("datOperacao", datOperacao);
		
		return query.getResultList();
	}
	
	public List<Operacao> getByDatePaginated(Calendar datOperacao,int page) {
		Query query = entityManager.createQuery("from " + Operacao.class.getName() +" o where o.datOperacao = :datOperacao");
		query.setParameter("datOperacao", datOperacao);
		query.setFirstResult(page * 500);
		query.setMaxResults(500);
		
		List<Operacao> list = query.getResultList(); 
		
		System.out.println(list);
		
		return list;
	}
	

	private final String HQL_VOL_FINANCEIRO_DIARIO =   " SELECT new br.com.cetip.observer.hibernate.entity.VolumeFinanceiroDiarioVDO (" +
													   "	count(O.numIdOperacao), " +
													   " 		sum(O.valFinanceiro), " +
													   " 		SOP.desSituacaoOperacao, " +
													   " 		TIF.codTipoIf )" +
													   " FROM VmContasInfohub V, " +
													   "  	  Operacao O, " +
													   "  	  TipoOperObjetoServ TOOS, " +
													   "  	  TipoIf TIF, " +
													   "  	  RelGrpTpOpObjServ RG, " +
													   "  	  SituacaoOperacao SOP " +
													   " WHERE ( O.numContaParticipanteP1 = V.numContaParticipante OR " +
													   "		O.numContaParticipanteP2 = V.numContaParticipante ) " +
													   " AND TOOS.numIdObjetoServico = TIF.numIdObjetoServico " +
													   " AND O.numIdTipoOperObjetoServ = TOOS.numIdTipoOperObjetoServ " +
													   " AND RG.numIdTipoOperObjetoServ = TOOS.numIdTipoOperObjetoServ " +
													   " AND SOP.codSituacaoOperacao = O.codSituacaoOperacao " +
													   " AND SOP.codSituacaoOperacao = :codSituacaoOperacao " +
													   " AND O.datOperacao = :datOperacao " +
													   " AND O.valFinanceiro IS NOT NULL " +
													   " AND O.valFinanceiro > 0 " +
													   " GROUP BY TIF.codTipoIf, " +
													   "          SOP.desSituacaoOperacao " +
													   " ORDER BY 2 desc ";
											   
	public List<VolumeFinanceiroDiarioVDO> getVolFinanceiroDiarioComStatus(Integer codSituacaoOperacao, Calendar datOperacao) throws Exception{
		List<VolumeFinanceiroDiarioVDO> resultado = new ArrayList<>();
		
		final Query query = entityManager.createQuery(HQL_VOL_FINANCEIRO_DIARIO);
				    query.setParameter("codSituacaoOperacao", codSituacaoOperacao);
				    query.setParameter("datOperacao", datOperacao,TemporalType.DATE);
				    	 
		resultado = query.getResultList();
				    
		return resultado;
	}
	
	public int getTotalByDate(Class clazz, Calendar datOperacao) {
		Query query = entityManager.createQuery("select count(*) from " + clazz.getName() +" o where o.datOperacao = :datOperacao");
		query.setParameter("datOperacao", datOperacao);
		
		int total = 0;
		if(query.getSingleResult() != null){
			total = Integer.valueOf(query.getSingleResult().toString());
		}	
		
		return total;
	}
}
