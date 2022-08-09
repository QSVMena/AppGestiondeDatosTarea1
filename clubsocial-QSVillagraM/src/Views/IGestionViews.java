package Views;

import java.util.List;

public interface IGestionViews <T>{
	
	public T ReadDatos();
	public void PrintDatos(List<T> list);

}
