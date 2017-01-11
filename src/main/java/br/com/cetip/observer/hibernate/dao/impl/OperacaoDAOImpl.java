package br.com.cetip.observer.hibernate.dao.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TemporalType;

import br.com.cetip.observer.dto.VolumeFinanceiroDiarioDTO;
import br.com.cetip.observer.hibernate.dao.IOperacaoDAO;
import br.com.cetip.observer.hibernate.entity.Operacao;
import br.com.cetip.observer.hibernate.listener.LocalEntityManagerFactory;
import br.com.cetip.observer.hibernate.util.HibernateUtil;

public class OperacaoDAOImpl implements IOperacaoDAO {
	private static IOperacaoDAO instance;
	
	
	protected EntityManager entityManager = Persistence.createEntityManagerFactory("prototipo").createEntityManager();
	
	/* (non-Javadoc)
	 * @see br.com.cetip.observer.hibernate.dao.impl.IOperacaoDAO#getById(java.lang.Long)
	 */
	@Override
	public Operacao getById(final Long numIdOperacao) throws Exception{
		Operacao operacao = entityManager.find(Operacao.class, numIdOperacao);
        return operacao;
	}
	
	
	/* (non-Javadoc)
	 * @see br.com.cetip.observer.hibernate.dao.impl.IOperacaoDAO#getByDate(java.util.Calendar)
	 */
	@Override
	public List<Operacao> getByDate(Calendar datOperacao) throws Exception{
		Query query = entityManager.createQuery("from " + Operacao.class.getName() +" o where o.datOperacao = :datOperacao");
		query.setParameter("datOperacao", datOperacao);
		List<Operacao> list = query.getResultList();
		
		return list;
	}
	
	/* (non-Javadoc)
	 * @see br.com.cetip.observer.hibernate.dao.impl.IOperacaoDAO#getByDatePaginated(java.util.Calendar, int)
	 */
	@Override
	public List<Operacao> getByDatePaginated(Calendar datOperacao,int page) throws Exception {
		
		Query query = entityManager.createQuery("from " + Operacao.class.getName() +" o where o.datOperacao = :datOperacao");
		query.setParameter("datOperacao", datOperacao);
		query.setFirstResult(page * 500);
		query.setMaxResults(500);
		
		List<Operacao> list = query.getResultList();
		System.out.println(list);
		
		return list;
	}
	

	private final String HQL_VOL_FINANCEIRO_DIARIO =   " SELECT new br.com.cetip.observer.dto.VolumeFinanceiroDiarioDTO (" +
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
											   
	/* (non-Javadoc)
	 * @see br.com.cetip.observer.hibernate.dao.impl.IOperacaoDAO#getVolFinanceiroDiarioComStatus(java.lang.Integer, java.util.Calendar)
	 */
	@Override
	public List<VolumeFinanceiroDiarioDTO> getVolFinanceiroDiarioComStatus(Integer codSituacaoOperacao, Calendar datOperacao) throws Exception{
		List<VolumeFinanceiroDiarioDTO> resultado = new ArrayList<>();
		
		final Query query = entityManager.createQuery(HQL_VOL_FINANCEIRO_DIARIO);
				    query.setParameter("codSituacaoOperacao", codSituacaoOperacao);
				    query.setParameter("datOperacao", datOperacao,TemporalType.DATE);
				    	 
		resultado = query.getResultList();
		System.out.println("vou fechar essa porra!");
		entityManager.clear();
		entityManager.close();
		return resultado;
	}
	
	/* (non-Javadoc)
	 * @see br.com.cetip.observer.hibernate.dao.impl.IOperacaoDAO#getTotalByDate(java.lang.Class, java.util.Calendar)
	 */
	@Override
	public int getTotalByDate(Class clazz, Calendar datOperacao) throws Exception{
		Query query = entityManager.createQuery("select count(*) from " + clazz.getName() +" o where o.datOperacao = :datOperacao");
		query.setParameter("datOperacao", datOperacao);
		
		int total = 0;
		if(query.getSingleResult() != null){
			total = Integer.valueOf(query.getSingleResult().toString());
		}	
		
		return total;
	}
}
