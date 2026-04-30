//Syed Fakhar Alam Bukhari
//sap id 72431
class AreaCalculator {
   AreaCalculator() {
   }

   int area(int var1) {
      return var1 * var1;
   }

   int area(int var1, int var2) {
      return var1 * var2;
   }

   double area(double var1) {
      return 3.14 * var1 * var1;
   }

   double area(int var1, int var2, int var3) {
      double var4 = (double)(var1 + var2 + var3) / 2.0;
      return Math.sqrt(var4 * (var4 - (double)var1) * (var4 - (double)var2) * (var4 - (double)var3));
   }
}
class test {
   public static void main(String[] var0) {
      AreaCalculator var1 = new AreaCalculator();
      System.out.println(var1.area(5));
      System.out.println(var1.area(3, 4));
      System.out.println(var1.area(2.5));
      System.out.println(var1.area(2, 3, 4));
   }
}
