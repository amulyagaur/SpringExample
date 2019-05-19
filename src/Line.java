import java.util.List;

public class Line {

    private List<Point> points;

    public Line(List<Point> points) {
        this.points = points;
    }

    public Line() {
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Line{" +
                "points=" + points +
                '}';
    }

    public void showLine(){
        for(Point P : points){
            System.out.println(P.getX()+" , "+P.getY());
        }
    }
}
