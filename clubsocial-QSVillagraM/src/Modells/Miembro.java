package Modells;

import java.util.Date;

public class Miembro extends PersonBase {
	public int NumberdeMembresia;
	public Date FechaDeEmisionMembresia;
	//(la fecha de vencimiento de la membresía es 
	//de 2 años exactos a partir de la fecha de emisión).
	public Date FechaVencimientoMembresia; 

}
