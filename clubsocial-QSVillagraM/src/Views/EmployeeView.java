package Views;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Modells.Employee;


public class EmployeeView implements IGestionViews<Employee> {
	SimpleDateFormat formato = new SimpleDateFormat ("dd/MM/yyyy");

	@Override
	public Employee ReadDatos() {
		
		Employee empleado = new Employee();
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingresar nombre completo\n>");
		empleado.setFirstName(scan.nextLine());
		
		try {
			System.out.print("Ingresar fecha de nacimiento (dd/MM/yyyy)\n>");
			empleado.setBirthdate(formato.parse(scan.nextLine()));
		}
		
		catch (ParseException ex) {
			System.out.println("Fecha incorrecta");
		}
		
		System.out.print("Ingresar Genero\n>");
		String genero = scan.nextLine();
		empleado.setGenero(genero.charAt(0)) ;
		
		System.out.print("Ingrese numero de empleado\n>");
		empleado.setEmployeeID(scan.nextInt());
		
		
		try{
			Date fecha = new Date();
			System.out.print("Fecha de ingreso del empleado\n>");
			System.out.print(formato.format(fecha));
			empleado.setFechaDeIngreso(formato.parse(formato.format(fecha)));
		}
		catch (ParseException ex) {
			System.out.print("Formato incorrecto");	
		}

		return empleado;
	}

	@Override
	public void PrintDatos(ArrayList<Employee> list) {
		for (int n = 0; n <list.size(); n++) {
			System.out.println(" "+list.get(n).FirstName+" "+formato.format(list.get(n).Birthdate)+" "+list.get(n).Genero+" "+list.get(n).Age+" "+list.get(n).EmployeeID+" "+formato.format(list.get(n).FechaDeIngreso));
		}
		
		
	}

	
}
