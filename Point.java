public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y=y;

    }

    public double distanceTo(Point other){
        return Math.sqrt((this.x - other.x)^2 + (this.y - other.y)^2);
    }
}
