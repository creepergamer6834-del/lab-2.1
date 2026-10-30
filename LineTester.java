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
 */
public class LineTester {
    public static void main(String[] args) {
        Point start = new Point(2, 7);
        Point end = new Point(1, 4);
        Line pointLine = new Line(start, end);
        System.out.println("Slope: " + pointLine.calculateSlope());
    }
}
