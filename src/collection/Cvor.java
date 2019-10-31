package collection;

import shape.Shape;

public class Cvor {
	private Shape info;
	private Cvor next;
	public Shape getInfo() {
		return info;
	}
	public void setInfo(Shape info) {
		this.info = info;
	}
	public Cvor getNext() {
		return next;
	}
	public void setNext(Cvor next) {
		this.next = next;
	}
}
