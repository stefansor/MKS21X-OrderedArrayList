import java.util.ArrayList;
import java.util.List;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
	public OrderedArrayList(){
		super();
	}
	public OrderedArrayList(int capacity){
		super(capacity);
	}
	public boolean add(T element){
    for (int i = 0; i < this.size(); i++){
      if ((this.get(i)).compareTo(element) > 0){
        super.add(i, element);
        return true;
      }
    }
    return super.add(element);
	}
	public void add(int index, T element){
		this.add(element);
	}
	public T set(int index, T element){
		T b;
		b = this.get(index);
		this.remove(index);
		this.add(element);
		return b;
	}
}
