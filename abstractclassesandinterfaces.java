public class GeometricObjectComparable implements Comparable{

    int radius;
    int breadth;
    int length;
    String shapeId;
   
    double area;
   
    public GeometricObjectComparable(int radius, int breadth, int length, String shapeId) {
        super();
        this.radius = radius;
        this.breadth = breadth;
        this.length = length;
        this.shapeId = shapeId;
        if(radius > 0) {
            area = Math.PI * radius * radius;
        }
        else {
            area = breadth * length;
        }
    }

    public static void MAX(GeometricObjectComparable o1, GeometricObjectComparable o2) {
        if( o1.compareTo(o2) > 0) {
            System.out.println(o1.shapeId + " is larger than " + o2.shapeId);
        }
        else if( o1.compareTo(o2) < 0) {
            System.out.println(o2.shapeId + " is larger than " + o1.shapeId);
        }
        else {
            System.out.println(o1.shapeId + " is equal to " + o1.shapeId);
        }
    }
   
    @Override
    public int compareTo(Object o) {
        if(this.area > ((GeometricObjectComparable)o).area) {
            return 1;
        }
        else if(this.area < ((GeometricObjectComparable)o).area) {
            return -1;
        }
        else {
            return 0;
        }
       
    }
    public static void main(String args[]) {
        GeometricObjectComparable circle1 = new GeometricObjectComparable(10, -1, -1, "circle 1");
        GeometricObjectComparable circle2 = new GeometricObjectComparable(20, -1, -1, "circle 2");
       
        GeometricObjectComparable rectangle1 = new GeometricObjectComparable(-1, 10, 30, "rectangle 1");
        GeometricObjectComparable rectangle2 = new GeometricObjectComparable(-1, 5, 20, "rectangle 2");
       
        GeometricObjectComparable.MAX(circle1, circle2);
        GeometricObjectComparable.MAX(rectangle1, rectangle2);
    }

}

/*

   public static GeometricObjectComparable max(Comparable o1, Comparable o2) {
      if (o1.compareTo(o2) > 0)
         return o1;
      else
         return o2;
   }



class Max1 {

   public static <E extends Comparable<E>> E max(E o1, E o2) {
      if (o1.compareTo(o2) > 0)
         return o1;
      else
         return o2;
   }
}
