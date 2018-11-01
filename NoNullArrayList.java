import java.util.ArrayList;
import java.util.List;
public class NoNullArrayList<T> extends ArrayList<T>{\
	private T value;
	public NoNullArrayList(){
		super();
	}
	public NoNullArrayList(int capacity){
		super(capacity);

	}
	public T set(int index, T element){
		if(element == null){
			throw new IllegalArgumentException("not a valid arguement");
		}
		else{
			this.set(index, element);
		}
	}
	public boolean add(T element){
		if(element == null){
			throw new IllegalArgumentException("not a valid arguement");
		}
		else{
			this.add(element);
		}
	}

}
