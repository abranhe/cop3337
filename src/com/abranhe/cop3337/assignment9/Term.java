/**
 * This is free and unencumbered software released into the public domain.
 * <p>
 * Anyone is free to copy, modify, publish, use, compile, sell, or
 * distribute this software, either in source code form or as a compiled
 * binary, for any purpose, commercial or non-commercial, and by any
 * means.
 * <p>
 * In jurisdictions that recognize copyright laws, the author or authors
 * of this software dedicate any and all copyright interest in the
 * software to the public domain. We make this dedication for the benefit
 * of the public at large and to the detriment of our heirs and
 * successors. We intend this dedication to be an overt act of
 * relinquishment in perpetuity of all present and future rights to this
 * software under copyright law.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
 * OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 * <p>
 * For more information, please refer to <http://unlicense.org>
 */

package com.abranhe.cop3337.assignment9;
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
