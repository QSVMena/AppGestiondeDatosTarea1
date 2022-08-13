package Controllers;
import java.util.ArrayList;
import java.util.List;

import Modells.Miembro;

public class MiembroController implements IGestion <Miembro> {
	
	private ArrayList<Miembro> listMiembro;

	public MiembroController () {
		listMiembro = new ArrayList();
	}

	@Override
	public void Add(Miembro Obj) {
		listMiembro.add(Obj);
	}
	
	@Override
	public ArrayList<Miembro> GetList() {	
		return listMiembro;
	}
}
