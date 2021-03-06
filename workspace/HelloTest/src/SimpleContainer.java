
public class SimpleContainer {

	private Object[] objArr;
	private int index = 0;

	public SimpleContainer() {

	}

	public SimpleContainer(int capacity) {
		this.objArr = new Object[capacity];
	}

	public void Add(Object o) {
		ContainerListener listener = (ContainerListener) o;

		listener.Hello();
		objArr[index] = o;
		index++;
	}

	public void Remove(int i) {
		ContainerListener listener = (ContainerListener)this.objArr[i];
		listener.GoodBye();
		this.objArr[i] = null;

		listener.GoodBye();
	}
}
