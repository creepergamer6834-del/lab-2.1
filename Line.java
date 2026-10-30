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
        double slope = (double) ((p2.getY() - p1.getY()) / (p2.getX() - p1.getX()));
        return slope;
    }

    public String pointSlopeForm() {
        double slope = (double) ((p2.getY() - p1.getY()) / (p2.getX() - p1.getX()));
        String psf = "(y - " + p1.getY() + ") = " + slope + "(x - " + p1.getX() + ")";
        return psf;
    }

    public boolean isCoordinateOnLine(Point p){
        double a =-(p2.getY() - p1.getY());
        double b = p2.getX() - p1.getX();
        double c = -(a * p1.getX() + b * p1.getY());
        if ((a * ) + (b * ) + c == 0){
            return true;
        }else{
            return false;
        }
    }

    public void shift(int dx, int dy) {

    }
}
