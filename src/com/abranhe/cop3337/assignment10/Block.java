/**
 * A quantity and price of a block of stocks.
 */
public class Block {
   private final int price;
   private int quantity;

   /**
    * Constructor.
    * 
    * @param quantity the quantity of this block.
    * @param price    the price of this block.
    */
   public Block(int quantity, int price) {
      this.price = price;
      this.quantity = quantity;
   }

   public int getQuantity() {
      return quantity;
   }

   public int getPrice() {
      return price;
   }

   public void sell(int shares) {
      quantity -= shares;
   }
}