import java.util.LinkedList;
import java.util.Queue;
import java.util.Map;
import java.util.TreeMap;

/**
 * Title: Assignment10 
 * Semester: COP3337 – Fall 2019
 * 
 * @author Carlos Hernandez
 *
 *  I affirm that this program is entirely my own work and none of it is
 *  the work of any other person.
 *
 *  Class for simulating trading a single stock at varying prices.
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