package manhattan;

public class App {
	
	public static void main(String args[]) {
		Manhattan manhattan = new Manhattan();
		
		Point a = new Point(2, 5);
		Point b = new Point(4, 9);
		
		int distance = manhattan.calculerDistanceManhattan(a, b);
		
		System.out.println("La distance de Manhattan entre les deux points est égale à : " + distance);
	}
}
