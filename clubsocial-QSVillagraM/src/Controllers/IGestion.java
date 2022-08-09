package Controllers;

import java.util.List;

public interface IGestion <T>{
	
	public void Add(T Obj);
	public List<T> GetList();

}
