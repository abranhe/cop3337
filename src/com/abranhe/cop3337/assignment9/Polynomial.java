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

import java.util.LinkedList;
import java.util.*;

/**
 * A class to represent a polynomial.
 * 
 * @author Carlos Hernandez
 */

public class Polynomial {
   Term term;
   LinkedList<Polynomial> polynomial;

   /**
    * Constructs an empty polynomial.
    */
   public Polynomial() {
      this.polynomial = new LinkedList<Polynomial>();
   }

   /**
    * Constructs a new polynomial with the given term.
    * 
    * @param term the term to initialize the polynomial with
    */
   public Polynomial(Term term) {
      this.polynomial = new LinkedList<Polynomial>();
      this.term = term;
      this.polynomial.add(this);
   }

   /**
    * Adds the polynomial such that the terms are in sorted order from highest
    * power to lowest.
    * 
    * @param polynomial the polynomial to add
    */
   public void add(Polynomial polynomial) {
      this.polynomial.add(polynomial);

      Collections.sort(this.polynomial, new Comparator<Polynomial>() {
         @Override
         public int compare(Polynomial p1, Polynomial p2) {
            return p2.term.getPower() - p1.term.getPower();
         }
      });
   }

   /**
    * Multiplies the given polynomial with this one and returns the result.
    * 
    * @param p the polynomial to multiply
    * @return this ^p
    */
   public Polynomial multiply(Polynomial p) {
      Polynomial q = new Polynomial();

      for (Polynomial p1 : this.polynomial) {
         for (Polynomial p2 : this.polynomial) {
            // The degree of the polynomial.
            int polynomialDegree = p1.term.getPower() + p2.term.getPower();

            // The coefficient of the polynomial.
            double coefficientDegree = p1.term.getCoefficient() * p2.term.getCoefficient();
            
            q.polynomial.add(new Polynomial(new Term(coefficientDegree, polynomialDegree)));
         }
      }

      // Adds the term to this term if the powers are the same.
      for (int i = 0; i < q.polynomial.size(); i++) {
         for (int j = i + 1; j < q.polynomial.size(); j++) {

            double tmp = q.polynomial.get(i).term.getCoefficient();
            q.polynomial.get(i).term.addIfSamePower(q.polynomial.get(j).term);
            
            if (tmp != q.polynomial.get(i).term.getCoefficient()) {
               q.polynomial.remove(j);
            }
         }
      }

      return q;
   }

   /**
    * Prints the polynomial "nicely" so that it reads from highest term to lowest
    * and doesn't have a leading "+" if the first term is positive.
    */
   public void print() {
      int counter = 0;

      for (Polynomial polynomial : this.polynomial) {
         String sign = "";

         if (counter++ != 0 && polynomial.term.getCoefficient() >= 0) {
            sign = "+";
         } else if (polynomial.term.getCoefficient() < 0) {
            sign = "-";
         }

         System.out.print(sign + " " + polynomial.term.toString() + " ");
         counter++;
      }
   }
}