/**
 * A class to represent an algebraic term.
 */
public class Term {
   private double coefficient;
   private int power;

   /**
    * A constructor to initialize a single term with a given coefficient and power
    * 
    * @param coefficent the coefficient
    * @param power      the power
    */
   public Term(double coefficient, int power) {
      this.coefficient = coefficient;
      this.power = power;
   }

   /**
    * @return the coefficient
    */
   public double getCoefficient() {
      return coefficient;
   }

   /**
    * @return the power
    */
   public int getPower() {
      return power;
   }

   /**
    * Multiplies two coefficient together and returns the result
    * 
    * @param t the other term
    * @return this * t as a term
    */
   public Term multiply(Term t) {
      return new Term(coefficient * t.coefficient, power + t.power);
   }

   /**
    * Adds the term to this term if the powers are the same
    * 
    * @param t the term to attempt to add
    */
   public void addIfSamePower(Term t) {
      if (t.power == power) {
         coefficient += t.coefficient;
      }
   }

   /**
    * Returns a string representation of the term with a ^ representing the
    * exponent
    * 
    * @return a string representation of a term
    */
   public String toString() {
      if (power == 0) {
         return Math.abs(coefficient) + "";
      } else if (power == 1) {
         return Math.abs(coefficient) + "x";
      } else {
         return Math.abs(coefficient) + "x^" + power;
      }
   }
}
