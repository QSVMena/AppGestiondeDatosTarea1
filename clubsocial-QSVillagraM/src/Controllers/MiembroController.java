package Controllers;
import java.util.ArrayList;
import java.util.List;

import Modells.Miembro;

public class MiembroController implements IGestion <Miembro> {
	
	private List<Miembro> listMiembro;

	public MiembroController () {
		listMiembro = new ArrayList();
	}

	@Override
	public void Add(Miembro Obj) {
		listMiembro.add(Obj);
	}
	
	@Override
	public List<Miembro> GetList() {	
		return listMiembro;
	}
}
