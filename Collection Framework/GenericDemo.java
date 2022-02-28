//advantages 1-type safety 2-eleminating the need for type-casting 
//3-reusability

package CollectionFramework;

import java.util.*;

class Container<T>
{
	 T value;
	 
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void show()
	 {
		 System.out.println(value);
		 System.out.println(value.getClass().getName());
	 }
}

public class GenericDemo{

	public static void main(String[] args) {

		Container<String> obj = new Container();
		//obj.value="hello";
		obj.setValue("hello");
		obj.show();
	}

}
