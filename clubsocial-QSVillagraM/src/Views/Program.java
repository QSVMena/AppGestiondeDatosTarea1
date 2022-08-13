package Views;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Controllers.EmployeeController;
import Controllers.MiembroController;
import Modells.Employee;
import Modells.Miembro;

public class Program {

	public static void main(String[] args) {
		int Opcion = 0;
		Scanner scan = new Scanner(System.in);

		// MiembroViews miembro = new MiembroViews();
		// miembro.ReadDatos();
		// EmployeeView empleado = new EmployeeView();
		// empleado.ReadDatos();
		MiembroController miembroController = new MiembroController();
		MiembroViews miembro = new MiembroViews();
		EmployeeController employeeController = new EmployeeController();
		EmployeeView employee = new EmployeeView();

		do {
			Opcion = 0;
			System.out.print("================================================================\n");
			System.out.println("Bienvenidos al club social\n");
			System.out.print("================================================================\n");
			System.out.println("1:Miembro");
			System.out.println("2:Empleado");
			System.out.println("3:Salir\n");

			System.out.print("Ingresar Opcion>");
			Opcion = scan.nextInt();

			switch (Opcion) {
			case 1:

				do {
					System.out.print("================================================================\n");
					System.out.println("\nGestion del Miembro");
					System.out.print("================================================================\n");
					System.out.println("1: Agregar miembro");
					System.out.println("2: Mostrar lista de miembro");
					System.out.println("3: Volver\n");
					System.out.print("Ingresar Opcion>");
					Opcion = scan.nextInt();

					switch (Opcion) {
					case 1:
						System.out.print("\nIngresar datos del miembro\n");
						miembroController.Add(miembro.ReadDatos());
						System.out.print("\nDatos del miembro guardado correctamente\n");
						break;
					case 2:
						System.out.print("listas de todos los miembros\n");
						ArrayList<Miembro> list = miembroController.GetList();

						if (list.size() > 0) {
							miembro.PrintDatos(list);
						} else {
							System.out.print("\nla lista no contiene ningun elemento\n");
						}
						break;
					case 3:
						
						break;
					}

				} while (Opcion != 3);
				         Opcion = 0;

				break;

			case 2:
				do {
					System.out.print("=================================================================\n");
					System.out.println("\nGestion del Empleado");
					System.out.print("=================================================================\n");
					System.out.println("1: Agregar Empleado");
					System.out.println("2: Mostrar lista de empleado");
					System.out.println("3: Volver\n");
					System.out.print("Ingrese Opcion>");
					Opcion = scan.nextInt();

					switch (Opcion) {
					case 1:
						System.out.print("\nIngresar datos del empleado\n");
						employeeController.Add(employee.ReadDatos());
						System.out.print("\nDatos del empleado guardado correctamente\n");

						break;
					case 2:
						System.out.print("Lista de todos los empleado\n");
						ArrayList<Employee> list = employeeController.GetList();
						if (list.size() > 0) {
							employee.PrintDatos(list);
						} else
							System.out.print("\nLa lista no contiene empleado\n");

						break;
					case 3:
						
						
						break;
					}
				} while (Opcion != 3);
				        Opcion= 0;
				break;
			case 3:
				
				break;

			}
		} while (Opcion != 3);
		System.out.print("Programa finalizado");

	}

}
