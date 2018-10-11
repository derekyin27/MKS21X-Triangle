public class Triangle {
  private Point v1;
  private Point v2;
  private Point v3;
  
  public Triangle(Point vertex1, Point vertex2, Point vertex3) {
    v1 = vertex1;
    v2 = vertex2;
    v3 = vertex3;
  }
  
  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
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
    return "Perimeter = " (distance(v1, v2) + distance(v2, v3) + distance(v1, v3));
  }
  
  public Point getVertex(int p) {
    if (p = 0) {
      Point copy1 = new Point(v1);
      return copy1;
    }
    if (p = 1) {
      Point copy2 = new Point(v2);
      return copy2;
    }
    if (p = 2) {
      Point copy3 = new Point(v3);
      return copy3;
    }
    else return "Not in index!"
  }
  
  public String toString() {
    return "Triangle: A(" + x.v1 + "," + y.v1 + ") B(" + x.v2 + "," + y.v2 + ") C(" + x.v3 + "," + y.v3 + ")";
  }
  
  public void setVertex(int p, Point newp) {
    if (p = 0) {
      v1 = newp;
    }
    if (p = 1) {
      v2 = newp;
    }
    if (p = 2) {
      v3 = newp;
    }
    else return "Not in index!"
  }
  
  
      
