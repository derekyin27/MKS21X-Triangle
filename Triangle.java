public class Triangle {
  private Point v1;
  private Point v2;
  private Point v3;
  
  public Triangle(Point vertex1, Point vertex2, Point vertex3) {
    v1 = vertex1;
    v2 = vertex2;
    v3 = vertex3;
  }
  
  public Point getV1() {
    return v1;
  }
  
  public Point getV2() {
    return v2;
  }
  
  public Point getV3() {
    return v3;
  }

  public double getPerimeter() {
    return distance(
