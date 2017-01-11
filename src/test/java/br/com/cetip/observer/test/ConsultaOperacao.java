package br.com.cetip.observer.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.TestProperties;
import org.junit.Test;

import br.com.cetip.observer.config.ObserverResourceConfig;
import br.com.cetip.observer.hibernate.dao.IOperacaoDAO;

public class ConsultaOperacao extends JerseyTest{
	//@Test
	public void testaConsulta() throws Exception{
//		System.out.println("Entrou aqui");
//		Operacao o = OperacaoDAOImpl.getInstanceTest().getById(59156502L);
//		Calendar c = Calendar.getInstance();
//		c.set(2016, Calendar.NOVEMBER, 22);
//		DateFormat df = DateFormat.getDateInstance();
//		List<Operacao> operacoes = OperacaoDAOImpl.getInstanceTest().getByDate(c);
//		System.out.println("Operacao > "+o.getCodContaParte());
//		System.out.println("Calendar > "+c.getTime());
//		System.out.println("Calendar Format > "+df.format(c.getTime()));
//		System.out.println("Tamanho array > "+operacoes.size());
//		System.out.println("Saiu aqui");
//		Calendar c2 = Calendar.getInstance();
//		c2.setTimeInMillis(1480039200000L);
//		System.out.println(c2.getTime());
//		System.out.println("total> "+OperacaoDAOImpl.getInstanceTest().getTotalByDate(Operacao.class,c));
//		OperacaoDAO.getInstance().close();
		
	}
	@Inject
	IOperacaoDAO dao;
//	@Test
//	public void testaConsultaDash(){
//		System.out.println("Entrou aqui");
//		Calendar c = Calendar.getInstance();
//		c.set(2016, Calendar.DECEMBER, 23);
//		List<VolumeFinanceiroDiarioDTO> list = null;
//		try {
//			list = dao.getVolFinanceiroDiarioComStatus(43,c);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("total> "+list.size());
//		System.out.println(list);
		
		
		
//	}
//	@Test
//	public void getWidgets() throws Exception{
//		Calendar c = Calendar.getInstance();
//		c.setTime(Calendar.getInstance().getTime());
//		
//		Widget widget = new Widget(1, 1, 1, 2, "teste", "teste",c,1L, new Chart("options", "serviceA", "api",c));
//		Widget widget1 = new Widget(1, 1, 1, 2, "teste", "teste",c,1L, new Chart("options", "serviceB", "api",c));
//		Widget widget2 = new Widget(1, 1, 1, 2, "teste", "teste", c,2L,new Chart("options", "serviceC", "api",c));
//		
//		List<Widget> list = new ArrayList<Widget>();
//		list.add(widget);
//		list.add(widget1);
//		list.add(widget2);
//		
//		ObjectMapper objectMapper = new ObjectMapper();
//		objectMapper.configure(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS,true);
//		String stringEmp = objectMapper.writerWithDefaultPrettyPrinter().withRootName("widgets").writeValueAsString(list);
//		
//		
//		System.out.println(stringEmp);
//	}
//	
	@Override
    public Application configure() {
        enable(TestProperties.LOG_TRAFFIC);
        enable(TestProperties.DUMP_ENTITY);
        
        return new ObserverResourceConfig();
    }

    @Test
    public void testFetchBy(){
        Response output = target("/volumefinanceirodiario/2016-12-29/43").request().get();
        assertEquals("Should return status 200", 200, output.getStatus());
        assertNotNull("Should return notification", output.getEntity());
    }

    @Test
    public void testFetchByFail_DoesNotHaveDigit(){
        Response output = target("/notifications/no-id-digit").request().get();
        assertEquals("Should return status 404", 404, output.getStatus());
    }

}
