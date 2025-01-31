public class Circle {  
   private double radius;
   private String color;
   
   public Circle() { 
      radius = 1.0;
      color = "red";
   }
   
   public void setRadius(double radius) {
	    this.radius = radius;
	}

   public double getCircumference() {
	    return 2 * Math.PI * radius;
	}

   public Circle(double r) {  
      radius = r;
      color = "red";
   }
   
   public double getRadius() {
     return radius; 
   }
   
   public double getArea() {
      return radius*radius*Math.PI;
   }
}