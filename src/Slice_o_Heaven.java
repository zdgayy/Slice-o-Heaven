public class Slice_o_Heaven {
    public String storemenu;
    public String storeName;
    public String storeAddress;
    public String storeEmail;
    public String storePhone;
    public String pizzaIngredients;
    public double pizzaPrice;
    public String sides;
    public String drinks;
    private String orderID;
    private double orderTotal;
 
    private static final String DEF_ORDER_ID = "DEF-SON-099";
    private static final String DEF_PIZZA_INGREDIENTS = "Mozzarella Cheese";
    private static final double DEF_ORDER_TOTAL = 15.00;
   
   
    public Slice_o_Heaven() {
    this.orderID = DEF_ORDER_ID;
    this.orderTotal = DEF_ORDER_TOTAL;
    this.pizzaIngredients = DEF_PIZZA_INGREDIENTS;
    this.sides = "";
    this.drinks = "";
    
    }

    public Slice_o_Heaven(String orderID,String pizzaIngredients,double orderTotal) {
        this.orderID = orderID;
        this.pizzaIngredients = pizzaIngredients;
        this.orderTotal = orderTotal;    
    }

    public String getStoremenu() {
        return storemenu;
    }
    public String getStoreName() {
        return storeName;
    }
    public String getStoreEmail() {
        return storeEmail;
    }
    public String getStorePhone() {
        return storePhone;
    }
    public String getStoreAddress() {
        return storeAddress; 
    }
    public String getPizzaIngredients() {
        return pizzaIngredients;
    }
    public double getPizzaPrice() {
        return pizzaPrice;
    }
    public String getSides() {
        return sides;
    }
    public String getDrinks() {
        return drinks;
    }
    public String getOrderID() {
        return orderID;
    }
    public double getOrderTotal() {
        return orderTotal;
    }
    public void setStoremenu(String storemenu) {
        this.storemenu = storemenu;
    }
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    public void setStoreEmail(String storeEmail) {
        this.storeEmail = storeEmail;
    }
    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
    }
    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }
    public void setPizzaIngredients(String pizzaIngredients) {
        this.pizzaIngredients = pizzaIngredients;
    }
    public void setPizzaPrice(double pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }
    public void setSides(String sides) {
        this.sides = sides;
    }
    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }
  

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
             Slice_o_Heaven pizzeria = new Slice_o_Heaven("12345", "Some Ingredients", 50.00);
             pizzeria.takeOrder("12345", 50.00);
         }
        }
