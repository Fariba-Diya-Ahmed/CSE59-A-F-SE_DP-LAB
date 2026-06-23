import java.util.*;

interface shape{
  double calculateArea();
}

class rectangle implements shape{
  public double length;
  public double width;

  rectangle(double length, double width){
    this.length = length;
    this.width = width;
  }
  public double calculateArea(){
    return length*width;
  }
}

class circle implements shape{
  public double radius;

  circle(double radius){
    this.radius=radius;
  }
  public double calculateArea(){
    return Math.PI*radius*radius;
  }
}

class AreaCalculator{
  public double calculateTotalArea(shape[] s){
    double area = 0;
    for(shape sh:s){
      area += sh.calculateArea();
    }

    return area;
  }
}

public class Main1 {
    public static void main(String[] args) {
      shape[] s ={
        new rectangle(10,5),
        new circle(7)
      };

      AreaCalculator calc = new AreaCalculator();
      double result = calc.calculateTotalArea(s);
      System.out.println(result);
    }
}
