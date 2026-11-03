/*
 * REQ 01: answer both questions before you write any other code.
 *
 * 1. Your tester runs the three lines below. How many Point objects
 *    exist afterward, and what does line.getP1().getX() return? Why?
 *        Point start = new Point(1, 4);
 *        Line line = new Line(start, new Point(2, 7));
 *        start.setX(6);
 *    Answer: 2 points will exist. Line.getP1().getX() returns 
 *
 * 2. Two methods in this lab take a parameter that can be null.
 *    Name them, and say what each one returns for null.
 *    Answer:
 *    - isCoordinateOnLine(Point p): returns false when passed null.
 *    - isParallelTo(Line other): returns false when passed null.
 */
public class LineTester {
    public static void main(String[] args) {
        Point pA = new Point(2, 7);
        Point pB = new Point(1, 4);
        Line line = new Line(pA, pB);
        System.out.println("Slope: " + line.calculateSlope());

        Point mid = new Point(2, 4).midpointWith(new Point(8, 10));
        System.out.println("Midpoint: (" + mid.getX() + ", " + mid.getY() + ")");

        Line original = new Line(new Point(1, 1), new Point(2, 2));
        Line twin = original.copy();
        original.shift(3, 0);
        System.out.println("Twin p1 X after original shifted: " + twin.getP1().getX());
    }
}