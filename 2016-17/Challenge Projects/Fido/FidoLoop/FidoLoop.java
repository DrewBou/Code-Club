// Max Omdal
// Code Club 2016

public class FidoLoop {
  public static void main(String[] args) {
    int count = 1;
    while (count <= 100) {
      System.out.println(count);
      count = count + 1;
    }
    System.out.println("Ready or not, here I come!!!");

    double x = Math.random();
    if (x <= 0.5) {
      System.out.println("Fido found Rex and Spot!");
    }
    else {
      System.out.println("Fido did not find his friends :(");
    }
  }
}