import java.util.ArrayList;
import java.util.List;
public class NoNullArrayList<T> extends ArrayList<T>{
	public  T value;
	public NoNullArrayList(){
		super();
	}
	public NoNullArrayList(int capacity){
		super(capacity);

	}
	public T set(int index, T element){
		T a;
		if(element == null){
			throw new IllegalArgumentException("null is not a valid arguement");
		}
		else{
			a = this.get(index);
			super.set(index, element);
		}
		return a;
	}
	public boolean add(T element){
		if(element == null){
			throw new IllegalArgumentException("null is not a valid arguement");
		}
		else{
			super.add(element);
		}
		return true;
	}
	public void add(int index, T element){
		if(element == null){
			throw new IllegalArgumentException("null is not a valid arguement");
		}
		else{
			super.add(index, element);
		}
	}

}
