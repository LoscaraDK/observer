package br.com.cetip.observer.services;

import java.io.StringWriter;
import java.util.Calendar;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import br.com.cetip.observer.hibernate.dao.OperacaoDAO;
import br.com.cetip.observer.util.ConverterUtils;

@Path("/volumefinanceirodiario")
public class VolumeFinanceiroDiarioService {

	@GET
	@Path("/{data}/{codigosituacao}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.TEXT_PLAIN})
	public Response getMsg(@PathParam("data") String data,@PathParam("codigosituacao") int codigoSituacaoOperacao) throws Exception{

		System.out.println(">>> VolumeFinanceiroDiarioService > Servico para informacoes sobre volume financeiro diario!");
		
		Calendar dataHoje = ConverterUtils.transformStringToCalendar(data, ConverterUtils.YYYYMMDD);
		
		List lista = OperacaoDAO.getInstance().getVolFinanceiroDiarioComStatus(codigoSituacaoOperacao, dataHoje);
				
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS, true);
		StringWriter stringEmp = new StringWriter();
		objectMapper.writeValue(stringEmp, lista);
		
		System.out.println("<<< VolumeFinanceiroDiarioService <");
		
		return Response.status(200).entity(stringEmp.toString()).build();

	}

}