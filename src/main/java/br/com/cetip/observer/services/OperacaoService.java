package br.com.cetip.observer.services;

import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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

import br.com.cetip.observer.hibernate.dao.IOperacaoDAO;
import br.com.cetip.observer.hibernate.entity.Operacao;

@Path("/operacao")
public class OperacaoService {
	
	@Inject
	private IOperacaoDAO dao;
	
	@GET
	@Path("/{data}/{page}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.TEXT_PLAIN})
	public Response getMsg(@PathParam("data") String msg,@PathParam("page") int page) throws Exception{

		String output = "Jersey say : " + msg;
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>ERRO>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+Response.status(200).entity(output).build().getMetadata().toString());
		System.out.println("Valor do parametro > "+msg);
		
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.parse(msg).toString());
		Date d = sdf.parse(msg);		
		c.setTime(d);
		
		List<Operacao> lista = dao.getByDatePaginated(c,page);
		
		System.out.println("tamanho da lista > "+lista.size());
				
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS, true);
		StringWriter stringEmp = new StringWriter();
		objectMapper.writeValue(stringEmp, lista);
		
		return Response.status(200).entity(stringEmp.toString()).build();

	}

}