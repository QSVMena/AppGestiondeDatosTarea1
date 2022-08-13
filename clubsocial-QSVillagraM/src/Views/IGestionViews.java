package Views;

import java.util.ArrayList;
import java.util.List;

public interface IGestionViews <T>{
	
	public T ReadDatos();
	public void PrintDatos(ArrayList<T> list);

}
