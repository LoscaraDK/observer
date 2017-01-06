package br.com.cetip.observer.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ConverterUtils {
	public static final String YYYYMMDD = "yyyy-MM-dd";
	
	public static Calendar transformStringToCalendar(String data,String format) throws Exception{
		
		if("".equals(data) || data == null){
			throw new Exception("Data inválida!");
		}
		
		if("".equals(format) || format == null){
			throw new Exception("Formato de data inválido!");
		}
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date d = sdf.parse(data);		
		calendar.setTime(d);
		
		return calendar;
	}
}
