public class Slice_o_Heaven {
    private String storemenu;
    public String storeName;
    public String storeEmail;
    public long storePhone;
    public String pizzaIngredients;
    public double pizzaPrice;
    public String sides;
    public String drinks;
    private String orderID;
    private double orderTotal;
 
    public void takeOrder(String id,double total) {
     orderID = id;
     orderTotal = total;
 
     System.out.println("Order accepted!");
 
     System.out.println("Order is being prepared");
     makepizza();
         System.out.println("Your order is ready");
         printReceipt();
    }
         private void makepizza() {
         try{
             Thread.sleep(5000);
         } catch (InterruptedException e){
             System.out.println("Order is ready for pickup");
         }
     
     
     }
     
     
             private void printReceipt(){
             System.out.println("RECEIPT");
 
             System.out.println("Order ID: " + orderID);
             System.out.println("Order Total: " + orderTotal);
 
         }
 
         public static void main(String[]args) {
             Slice_o_Heaven pizzeria = new Slice_o_Heaven();
             pizzeria.takeOrder("12345", 50.00);
         }
        }
