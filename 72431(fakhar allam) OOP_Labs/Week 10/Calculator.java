class Calculator {
   Calculator() {
   }

   int add(int var1, int var2) {
      return var1 + var2;
   }

   int add(int var1, int var2, int var3) {
      return var1 + var2 + var3;
   }

   int subtract(int var1, int var2) {
      return var1 - var2;
   }

   int subtract(int var1, int var2, int var3) {
      return var1 - var2 - var3;
   }

   int product(int var1, int var2) {
      return var1 * var2;
   }

   int product(int var1, int var2, int var3) {
      return var1 * var2 * var3;
   }

   int divide(int var1, int var2) {
      return var1 / var2;
   }

   double divide(double var1, double var3) {
      return var1 / var3;
   }
}
class Testing {
   Testing() {
   }

   public static void main(String[] var0) {
      Calculator var1 = new Calculator();
      System.out.println("sum of a and b = " + var1.add(2, 3));
      System.out.println("sum of a ,b and c = " + var1.add(2, 3, 4));
      System.out.println("difference of a and b = " + var1.subtract(2, 3));
      System.out.println("difference of a ,b and c = " + var1.subtract(2, 3, 4));
      System.out.println("product of a and b = " + var1.product(2, 3));
      System.out.println("product of a ,b and c = " + var1.product(2, 3, 4));
      System.out.println("division of integer values = " + var1.divide(2, 3));
      System.out.println("division of float values = " + var1.divide((double)2.5F, (double)3.0F));
   }
}
