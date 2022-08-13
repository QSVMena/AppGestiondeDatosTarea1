package Views;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import Modells.Miembro;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.text.ParseException;

public class MiembroViews implements IGestionViews<Miembro> {
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	
	@Override
	public Miembro ReadDatos() {
		
		Miembro miembro = new Miembro();
		Scanner scan = new Scanner(System.in); 
		System.out.print("Ingresar Nombre Completo\n>");
		miembro.setFirstName(scan.nextLine());
		
		try{
			System.out.print("Ingresar Fecha de Nacimiento(dd/MM/yyyy)\n>");
			miembro.setBirthdate(formato.parse(scan.nextLine()));
		}
		
		catch (ParseException ex){
			System.out.print("Las fechas incorrectas");	
		}
		
		
		System.out.print("Ingresar Genero\n>");
		String genero = scan.nextLine();
		miembro.setGenero(genero.charAt(0));
		
		System.out.print("Ingrese numero de membresia\n>");
		miembro.setNumberdeMembresia(scan.nextInt());
		
		try {
			Date fecha = new Date();
			System.out.print("Fecha de emision de membresia\n>");
			System.out.print(formato.format(fecha));
			miembro.setFechaDeEmisionMembresia(formato.parse(formato.format(fecha)));
		}
		catch(ParseException ex){
			System.out.print("Formato incorrecto");
		}
		
		return miembro;
		
		
	}
	     
	
	

	@Override
	public void PrintDatos(ArrayList<Miembro> list) {
		for (int n = 0; n <list.size(); n++){
			
			System.out.println(" "+list.get(n).FirstName+" "+formato.format(list.get(n).Birthdate)+" "+list.get(n).Genero+" "+list.get(n).Age+" "+list.get(n).NumberdeMembresia+" "+formato.format(list.get(n).FechaDeEmisionMembresia));
			
		}
		
	}

}
