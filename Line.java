public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public double calculateSlope() {
        return (double) (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
    }

    public String pointSlopeForm() {
        return "(y - " + p1.getY() + ") = " + calculateSlope() + "(x - " + p1.getX() + ")";
    }

    public boolean isCoordinateOnLine(Point p) {
        if (p == null) {
            return false;
        }
        int a = -(p2.getY() - p1.getY());
        int b = p2.getX() - p1.getX();
        int c = -(a * p1.getX() + b * p1.getY());
        return (a * p.getX() + b * p.getY() + c) == 0;
    }

    public void shift(int dx, int dy) {
        p1.setX(p1.getX() + dx);
        p1.setY(p1.getY() + dy);
        p2.setX(p2.getX() + dx);
        p2.setY(p2.getY() + dy);
    }

    public boolean isParallelTo(Line other) {
        if (other == null) {
            return false;
        }
        long slope1Num = (long) (p2.getY() - p1.getY());
        long slope1Den = (long) (p2.getX() - p1.getX());
        long slope2Num = (long) (other.p2.getY() - other.p1.getY());
        long slope2Den = (long) (other.p2.getX() - other.p1.getX());
        return slope1Num * slope2Den == slope2Num * slope1Den;
    }

    public Line copy() {
        Point newP1 = new Point(p1.getX(), p1.getY());
        Point newP2 = new Point(p2.getX(), p2.getY());
        return new Line(newP1, newP2);
    }
}