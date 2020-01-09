/**
 * A class to to test the Polynomial class.
 */
public class PolynomialTester {
   public static void main(String[] args) {
      Polynomial p = new Polynomial(new Term(-10, 0));
      p.print();
      System.out.println("\nExpected: - 10.0");
      p.add(new Polynomial(new Term(-1, 1)));
      p.print();
      System.out.println("\nExpected: - 1.0x - 10.0");
      p.add(new Polynomial(new Term(9, 7)));
      p.print();
      System.out.println("\nExpected: 9.0x^7 - 1.0x - 10.0");
      p.add(new Polynomial(new Term(5, 10)));
      p.print();
      System.out.println("\nExpected: 5.0x^10 + 9.0x^7 - 1.0x - 10.0");

      Polynomial q = p.multiply(p);
      q.print();
      System.out.println("\nExpected: 25.0x^20 + 90.0x^17 + 81.0x^14 - 10.0x^11 - 100.0x^10 - 18.0x^8 - 180.0x^7 + 1.0x^2 + 20.0x + 100.0");
   }
}

// 25.0x^20 + 90.0x^17 - 10.0x^11 - 100.0x^10 + 81.0x^14 - 18.0x^8 - 180.0x^7 + 1.0x^2 + 20.0x + 100.0 -> Expected.
// 25.0x^20 + 90.0x^17 + 81.0x^14 - 10.0x^11 - 100.0x^10 - 18.0x^8 - 180.0x^7 + 1.0x^2 + 20.0x + 100.0