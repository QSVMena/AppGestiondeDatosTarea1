package Commons;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateOperation {
	
	public static Date SumYear() {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.YEAR, 2);
		Date d = new Date();
		try {
			String result = dateFormat.format(c.getTime());	
			d = dateFormat.parse(result);
		}
		catch (Exception ex){	
			System.out.print("Formato incorrecto");
		}
		
		return d;
	}
	
	public static String DateFormat(Date fecha) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String result = dateFormat.format(fecha);
		
		return result;
	}

}
