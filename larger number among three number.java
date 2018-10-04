class Main {
  public static void main(String[] args) {
    int a,b,c;
    a=50;
    b=55;
    c=46;
    if (a > b && a > c)
         System.out.println("First number is largest.");
      else if (b > a && b > c)
         System.out.println("Second number is largest.");
      else if (c > a && c > b)
         System.out.println("Third number is largest.");
  }
}