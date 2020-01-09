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

package com.abranhe.cop3337.assignment10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Map;
import java.util.TreeMap;

/**
 * Class for simulating trading a single stock at varying prices.
 * 
 * @author Carlos Hernandez
 */

public class StockSimulator {
   private Map<String, Queue<Block>> blocks;
   private int profit;

   /**
    * Constructor.
    */
   public StockSimulator() {
      this.blocks = new TreeMap<>();
      this.profit = 0;
   }

   /**
    * Handle a user buying a given quantity of stock at a given price.
    *
    * @param symbol   the stock to sell
    * @param quantity how many to buy.
    * @param price    the price to buy.
    */
   public void buy(String symbol, int quantity, int price) {

      // If the stock does not exist create one.
      if (!this.containStock(symbol)) {
         Queue<Block> queue = new LinkedList<>();
         queue.add(new Block(quantity, price));
         this.blocks.put(symbol, queue);
      } else {
         // If the stock already exists add the new one
         Block block = new Block(quantity, price);
         this.blocks.get(symbol).add(block);
      }
   }

   /**
    * Handle a user selling a given quantity of stock at a given price.
    *
    * @param symbol   symbol the stock to sell
    * @param quantity how many to sell.
    * @param price    price the price to sell.
    */
   public void sell(String symbol, int quantity, int price) {

      if (this.containStock(symbol)) {
         Queue<Block> queue = this.blocks.get(symbol);

         while (quantity > 0) {
            if (queue.peek().getQuantity() > quantity) {
               this.profit += price * quantity - queue.peek().getPrice() * quantity;
               queue.peek().sell(quantity);
               quantity = 0;
            } else {
               this.profit += price * queue.peek().getQuantity() - queue.peek().getPrice() * queue.peek().getQuantity();
               quantity -= queue.poll().getQuantity();
            }
         }
      } else {
         System.out.println("You don't have " + symbol + " on your portfolio.");
      }

      this.printGain();
   }

   /**
    * Helper method to check if the symbol is in the Threemap
    * 
    * @param symbol symbol the stock to check
    * @return true if the stock is on the Treemap
    */
   private boolean containStock(String symbol) {
      return this.blocks.containsKey(symbol);
   }

   /**
    * Helper that shows the current gain in the portfolio.
    */
   private void printGain() {
      System.out.println("Gain: " + this.profit);
   }
}