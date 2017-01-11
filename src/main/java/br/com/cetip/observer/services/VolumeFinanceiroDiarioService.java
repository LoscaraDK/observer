package br.com.cetip.observer.services;

import java.util.Calendar;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import br.com.cetip.observer.dto.VolumeFinanceiroDiarioDTO;
import br.com.cetip.observer.hibernate.dao.IOperacaoDAO;
import br.com.cetip.observer.util.ConverterUtils;

@Path("/volumefinanceirodiario")
public class VolumeFinanceiroDiarioService {
	
	@Inject
	private IOperacaoDAO dao;

	@GET
	@Path("/{data}/{codigosituacao}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.TEXT_PLAIN})
	public Response getMsg(@PathParam("data") String data,@PathParam("codigosituacao") int codigoSituacaoOperacao){

		System.out.println(">>> VolumeFinanceiroDiarioService > Servico para informacoes sobre volume financeiro diario!");
		
		String stringEmp = "";
		try {
			Calendar dataHoje = ConverterUtils.transformStringToCalendar(data, ConverterUtils.YYYYMMDD);
			
			List<VolumeFinanceiroDiarioDTO> lista = dao.getVolFinanceiroDiarioComStatus(codigoSituacaoOperacao, dataHoje);
			
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.configure(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS, true);
			stringEmp = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(lista);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("<<< VolumeFinanceiroDiarioService <");
		
		return Response.status(200).entity(stringEmp).build();

	}

}