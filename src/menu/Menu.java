package menu;

import java.util.Scanner;

import collection.ShapeCollection;
import shape.Circle;
import shape.Shape;
import shape.Square;

public class Menu {
	public static void main(String[] args) {
		ShapeCollection shapeCollection = new ShapeCollection();
		int signal = 0;
		Scanner scan = new Scanner(System.in);
		while (signal == 0) {
			System.out.println("\n1.Enter a circle\n2.Enter a square\n3.Show the shape collection\n4.Show only circles\n5.Show only squares\n6.The END\n");
			int izbor=scan.nextInt();
			switch(izbor) {
			case 1: 
				System.out.println("\nEnter r: ");
				double r=scan.nextDouble();
				Shape s1 = new Circle(r);
				shapeCollection.addLast(s1);
				break;
			case 2:
				System.out.println("\nEnter a: ");
				double a = scan.nextDouble();
				Shape s2 = new Square(a);
				shapeCollection.addLast(s2);
				break;
			case 3:
				shapeCollection.print();
				break;
			case 4:
				shapeCollection.printCircles();
				break;
			case 5: 
				shapeCollection.printSquares();
				break;
			case 6: 
				System.out.println("\nTHE END!\n");
				signal=1;
				break;
			default: System.out.println("\nWrong choice\n");
			}
		}
		scan.close();
	}
}
