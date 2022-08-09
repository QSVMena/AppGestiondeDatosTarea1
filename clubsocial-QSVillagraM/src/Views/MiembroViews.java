package Views;
import java.util.List;
import java.util.Scanner;
import Modells.Miembro;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class MiembroViews implements IGestionViews<Miembro> {

	@Override
	public Miembro ReadDatos() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Miembro miembro = new Miembro();
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Ingresar Nombre Completo\n>");
		miembro.FirstName= scan.nextLine();
		
		try{
			System.out.println("Ingresar Fecha de Nacimiento(dd/MM/yyyy)\n>");
			miembro.Birthdate = formato.parse(scan.nextLine());
		}
		
		catch (ParseException ex){
			System.out.println("Las fechas incorrectas");
		}
		return miembro;
		
		

	}

	@Override
	public void PrintDatos(List<Miembro> list) {
		
	}

}
