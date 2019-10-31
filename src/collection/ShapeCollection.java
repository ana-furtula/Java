package collection;

import shape.Circle;
import shape.Shape;
import shape.Square;

public class ShapeCollection {
	private Cvor first;
	private Cvor last;

	public void addLast(Shape s) {
		Cvor cvor = new Cvor();
		cvor.setInfo(s);
		if (first == null) {
			first = cvor;
			last = cvor;
		} else {
			last.setNext(cvor);
			last = cvor;
		}
	}

	public void print() {
		System.out.println();
		Cvor tek = first;
		while (tek != null) {
			tek.getInfo().print();
			tek = tek.getNext();
		}
	}

	public void printSquares() {
		System.out.println();
		Cvor tek = first;
		while (tek != null) {
			if (tek.getInfo() instanceof Square)
				tek.getInfo().print();
			tek = tek.getNext();
		}
	}
	public void printCircles() {
		System.out.println();
		Cvor tek = first;
		while (tek != null) {
			if (tek.getInfo() instanceof Circle)
				tek.getInfo().print();
			tek = tek.getNext();
		}
	}
}
