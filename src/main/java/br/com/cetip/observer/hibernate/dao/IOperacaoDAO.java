package br.com.cetip.observer.hibernate.dao;

import java.util.Calendar;
import java.util.List;

import br.com.cetip.observer.dto.VolumeFinanceiroDiarioDTO;
import br.com.cetip.observer.hibernate.entity.Operacao;

public interface IOperacaoDAO {

	Operacao getById(Long numIdOperacao) throws Exception;

	List<Operacao> getByDate(Calendar datOperacao) throws Exception;

	List<Operacao> getByDatePaginated(Calendar datOperacao, int page) throws Exception;

	List<VolumeFinanceiroDiarioDTO> getVolFinanceiroDiarioComStatus(Integer codSituacaoOperacao, Calendar datOperacao)
			throws Exception;

	int getTotalByDate(Class clazz, Calendar datOperacao) throws Exception;

}