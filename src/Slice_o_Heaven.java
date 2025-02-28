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

        public void processCardPayment(String cardNumber,String expiryDate,int cvv){
            int cardLength = cardNumber.length();
            if (cardLength == 14){
                System.out.println("Card accepted");
            }
            else{
                System.out.println("Invalid card");
            
        }
        int firstCardDigit = Integer.parseInt(cardNumber.substring(0,1));

        String blacklistedNumber = "12345678901234";
        if (cardNumber.equals(blacklistedNumber)){
            System.out.println("Card is blacklisted,please use another card");
        }
        int lastFourDigits = Integer.parseInt(cardNumber.substring(cardLength - 4));

        StringBuilder sb = new StringBuilder(cardNumber);
        for (int i = 1; i < cardLength - 4; i++) {
            sb.setCharAt(i, '*');
        }
        String cardNumberToDisplay = sb.toString();

        System.out.println("First card digit: " + firstCardDigit);
        System.out.println("Last four digits: " + lastFourDigits);
        System.out.println("Card number to display: " + cardNumberToDisplay);
        
            }
        public void specialOfTheDay(String pizzaOfTheDay,String sideOfTheDay,String specialPrice){
        StringBuilder specialInfo = new StringBuilder();
        specialInfo.append("Special of the day: " ).append(pizzaOfTheDay);
        specialInfo.append("\nSide of the day: " ).append(sideOfTheDay);
        specialInfo.append("\nSpecial price: " ).append(specialPrice);
        System.out.println(specialInfo.toString());
        }
        
     
         
         
         public static void main(String[]args) {
             Slice_o_Heaven pizzeria = new Slice_o_Heaven("12345", "Some Ingredients", 50.00);
             pizzeria.takeOrder("12345", 50.00);
        
             pizzeria.processCardPayment("12345678901234", "2/28", 123);

        
             pizzeria.specialOfTheDay("Margherita Pizza", "Garlic Bread", "$12.99");
      
         }
            
        }
    