package manhattan;

public class Manhattan {
	
	/**
	 * Permet de calculer la distance de Manhattan entre deux points passés en paramètre.
	 * 
	 * @param a
	 * @param b
	 * @return distanceManhattan
	 */
	public int calculerDistanceManhattan(Point a, Point b) {
		int distanceManhattan;
		distanceManhattan = Math.abs(a.getX() - b.getX()) + Math.abs(a.getY() - b.getY());
		return distanceManhattan;
	}
	
	/**
	 * Permet de calculer la distance de Manhattan entre deux points.
	 * La fonction prend les coordonnées x et y des deux points.
	 * 
	 * @param ax
	 * @param ay
	 * @param bx
	 * @param by
	 * @return distanceManhattan
	 */
	public int calculerDistanceManhattan(int ax, int ay, int bx, int by) {
		int distanceManhattan;
		Point a = new Point(ax, ay);
		Point b = new Point(bx, by);
		distanceManhattan = calculerDistanceManhattan(a, b);
		return distanceManhattan;
	}
}
