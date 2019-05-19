public class Triangle {

    private String type;
    private int height;

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public Triangle() {
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Triangle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void Draw(){
        System.out.println( getType() + "Triangle Drawn");
    }
}
