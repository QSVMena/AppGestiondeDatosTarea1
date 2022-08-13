package Modells;

import java.util.Date;

public class Employee extends PersonBase{
	public int EmployeeID;
	public Date FechaDeIngreso;
	//(Para este ejercicio el puesto será abierto)
	public String Puesto;
	
	public int getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	public Date getFechaDeIngreso() {
		return FechaDeIngreso;
	}
	public void setFechaDeIngreso(Date fechaDeIngreso) {
		FechaDeIngreso = fechaDeIngreso;
	}
	public String getPuesto() {
		return Puesto;
	}
	public void setPuesto(String puesto) {
		Puesto = puesto;
	} 

	
}
