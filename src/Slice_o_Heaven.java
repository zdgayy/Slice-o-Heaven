import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

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
        private static final long BLACKLISTED_NUMBER = 12345678901234L;
    
        public Slice_o_Heaven() {
            this.orderID = DEF_ORDER_ID;
            this.orderTotal = DEF_ORDER_TOTAL;
            this.pizzaIngredients = DEF_PIZZA_INGREDIENTS;
            this.sides = "";
            this.drinks = "";
        }
    
        public Slice_o_Heaven(String orderID, String pizzaIngredients, double orderTotal) {
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
    
        public void takeOrder() {
           Scanner scanner = new Scanner(System.in);
           String[] ingredients = new String[3];
           boolean validIngredients = false;
    
           while (!validIngredients) {
             System.out.println("Please pick any three of the following ingredients:");
             System.out.println("1. Mushroom");
             System.out.println("2. Paprika");
             System.out.println("3. Sun-Dried Tomatoes");  
             System.out.println("4. Chicken");
             System.out.println("5. Pineapple");
             System.out.print("Enter any three choices (1, 2, 3,…) separated by spaces: ");
             String input = scanner.nextLine();
             String[] choices = input.split(" ");
    
             if (choices.length != 3) {
                System.out.println("Invalid choice(s). Please pick only from the given list:");}
                else{
                    try{
                        int choice1 = Integer.parseInt(choices[0]);
                        int choice2 = Integer.parseInt(choices[1]);
                        int choice3 = Integer.parseInt(choices[2]);
                        if(choice1 >= 1 && choice1 <= 5 && choice2 >= 1 && choice2 <= 5 && choice3 >= 1 && choice3 <= 5){;
                            ingredients[0] = convertIngredientChoice(choice1);
                            ingredients[1] = convertIngredientChoice(choice2);
                            ingredients[2] = convertIngredientChoice(choice3);
                            validIngredients = true;
                     }else{
                        System.out.println("Invalid choice. Please pick from the given list.");
                     }
                }catch (NumberFormatException e) {
                    System.out.println("Invalid choice(s). Please pick only from the given list:");
                }
             }
    
    
    
    
    
           }
           pizzaIngredients = String.join(", ", ingredients);
        
                boolean validSize = false;
                String pizzaSize = "";
                while (!validSize) {
                    System.out.println("What size should your pizza be?");
                    System.out.println("1. Large");
                    System.out.println("2. Medium");
                    System.out.println("3. Small");
                    System.out.print("Enter only one choice (1, 2, or 3):");
                    try {
                        int sizeChoice = scanner.nextInt();
                        scanner.nextLine();
                        if (sizeChoice >= 1 && sizeChoice <= 3) {
                            pizzaSize = convertSizeChoice(sizeChoice);
                            validSize = true;
                        } else {
                            System.out.println("Invalid choice. Please pick from the given list.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid choice. Please pick from the given list.");
                    }
                }
        
                System.out.print("Do you want extra cheese (Y/N):");
                String extraCheese = scanner.nextLine();
        
                boolean validSideDish = false;
                String sideDish = "";
                while (!validSideDish) {
                    System.out.println("Following are the side dish that go well with your pizza:");
                    System.out.println("1. Calzone");
                    System.out.println("2. Garlic bread");
                    System.out.println("3. Chicken puff");
                    System.out.println("4. Muffin");
                    System.out.println("5. Nothing for me");
                    System.out.print("What would you like? Pick one (1, 2, 3,…):");
                    try {
                        int sideDishChoice = scanner.nextInt();
                        scanner.nextLine();
                        if (sideDishChoice >= 1 && sideDishChoice <= 5) {
                            sideDish = convertSideDishChoice(sideDishChoice);
                            validSideDish = true;
                        } else {
                            System.out.println("Invalid choice. Please pick from the given list.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid choice. Please pick from the given list.");
                    }
                }
                sides = sideDish;
        
                boolean validDrink = false;
                String drink = "";
                while (!validDrink) {
                    System.out.println("Choose from one of the drinks below. We recommend Coca Cola:");
                    System.out.println("1. Coca Cola");
                    System.out.println("2. Cold coffee");
                    System.out.println("3. Cocoa Drink");
                    System.out.println("4. No drinks for me");
                    System.out.print("Enter your choice:");
                    try {
                        int drinkChoice = scanner.nextInt();
                        scanner.nextLine();
                        if (drinkChoice >= 1 && drinkChoice <= 4) {
                            drink = convertDrinkChoice(drinkChoice);
                            validDrink = true;
                        } else {
                            System.out.println("Invalid choice. Please pick from the given list.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid choice. Please pick from the given list.");
                    }
                }
                drinks = drink;
        
                System.out.print("Would you like the chance to pay only half for your order? (Y/N):");
                String wantDiscount = scanner.nextLine();
        
                if (wantDiscount.equals("Y")) {
                    isItYourBirthday(scanner);
                    makeCardPayment(scanner);
                } else {
                    makeCardPayment(scanner);
                }
            }   
            private String convertIngredientChoice(int choice) {
                switch (choice) {
                    case 1:
                        return "Mushroom";
                    case 2:
                        return "Paprika";
                    case 3:
                        return "Sun-dried tomatoes";
                    case 4:
                        return "Chicken";
                    case 5:
                        return "Pineapple";
                    default:
                        return "";
                }
            }
        
            private String convertSizeChoice(int choice) {
                switch (choice) {
                    case 1:
                        return "Large";
                    case 2:
                        return "Medium";
                    case 3:
                        return "Small";
                    default:
                        return "";
                }
            }
        
            private String convertSideDishChoice(int choice) {
                switch (choice) {
                    case 1:
                        return "Calzone";
                    case 2:
                        return "Garlic bread";
                    case 3:
                        return "Chicken puff";
                    case 4:
                        return "Muffin";
                    case 5:
                        return "Nothing for me";
                    default:
                        return "";
                }
            }
        
            private String convertDrinkChoice(int choice) {
                switch (choice) {
                    case 1:
                        return "Coca Cola";
                    case 2:
                        return "Cold coffee";
                    case 3:
                        return "Cocoa Drink";
                    case 4:
                        return "No drinks for me";
                    default:
                        return "";
                }
            }
        
            private boolean isItYourBirthday(Scanner scanner) {
                boolean validDate = false;
                LocalDate birthdate = null;
                while (!validDate) {
                    System.out.println("Enter your birthday (yyyy-MM-dd):");
                    String birthdateStr = scanner.nextLine();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    try {
                        birthdate = LocalDate.parse(birthdateStr, formatter);
                        LocalDate today = LocalDate.now();
                        long years = today.getYear() - birthdate.getYear();
                        if (today.getDayOfYear() < birthdate.getDayOfYear()) {
                            years--;
                        }
                        if (years >= 5 && years <= 120) {
                            validDate = true;
                        } else {
                            System.out.println("Invalid date. You are either too young or too dead to order.");
                            System.out.println("Please enter a valid date:");
                        }
                    } catch (DateTimeParseException e) {
                        System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
                    }
                }
        
                LocalDate today = LocalDate.now();
                long years = today.getYear() - birthdate.getYear();
                if (today.getDayOfYear() < birthdate.getDayOfYear()) {
                    years--;
                }
        
                if (years < 18 && today.getDayOfYear() == birthdate.getDayOfYear()) {
                    System.out.println("Congratulations! You pay only half the price for your order");
                    return true;
                } else {
                    System.out.println("Too bad! You do not meet the conditions to get our 50% discount");
                    return false;
                }
            }
        
    
            private void makeCardPayment(Scanner scanner) {
                boolean validExpiry = false;
                String expiryDate = "";
                while (!validExpiry) {
                    System.out.println("Enter expiry date (MM/YY):");
                    expiryDate = scanner.nextLine();
                    try {
                        int month = Integer.parseInt(expiryDate.split("/")[0]);
                        int year = Integer.parseInt(expiryDate.split("/")[1]) + 2000;
                        LocalDate currentDate = LocalDate.now();
                        LocalDate cardExpiry = LocalDate.of(year, month, 1);
                        if (cardExpiry.isAfter(currentDate)) {
                            validExpiry = true;
                        } else {
                            System.out.println("Invalid card expiry date. Please enter a future date.");
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid date format. Please enter the date in MM/YY format.");
                    }
                }
        
                try {
                    System.out.println("Enter your card number:");
                    long cardNumber = scanner.nextLong();
                    scanner.nextLine();
                    System.out.println("Enter cvv:");
                    int cvv = scanner.nextInt();
                    processCardPayment(cardNumber, expiryDate, cvv);
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a valid card number and CVV.");
                }
            }
        
            @SuppressWarnings("resource")
            public void processCardPayment(long cardNumber, String expiryDate, int cvv) {
                boolean validCard = false;
                while (!validCard) {
                    String cardNumberStr = Long.toString(cardNumber);
                    int cardLength = cardNumberStr.length();
                    if (cardLength == 14 && cardNumber != BLACKLISTED_NUMBER) {
                    System.out.println("Card accepted");
                    validCard = true;
                } else {
                    System.out.println("Invalid card. Please enter a 14 - digit number not on the blacklist.");
                    System.out.println("Enter your card number:");
                    cardNumber = new Scanner(System.in).nextLong();
                }
            }
    
            int firstCardDigit = Integer.parseInt(Long.toString(cardNumber).substring(0, 1));
            int lastFourDigits = Integer.parseInt(Long.toString(cardNumber).substring(10));
    
            StringBuilder sb = new StringBuilder(Long.toString(cardNumber));
            for (int i = 1; i < 10; i++) {
                sb.setCharAt(i, '*');
            }
            String cardNumberToDisplay = sb.toString();
    
            System.out.println("First card digit: " + firstCardDigit);
            System.out.println("Last four digits: " + lastFourDigits);
            System.out.println("Card number to display: " + cardNumberToDisplay);
        }
    
        public void specialOfTheDay(String pizzaOfTheDay, String sideOfTheDay, String specialPrice) {
            StringBuilder specialInfo = new StringBuilder();
            specialInfo.append("Pizza of the day: ").append(pizzaOfTheDay);
            specialInfo.append("\nSide of the day: ").append(sideOfTheDay);
            specialInfo.append("\nSpecial price: ").append(specialPrice);
            System.out.println(specialInfo.toString());
        }
    
        @Override
        public String toString() {
            StringBuilder receipt = new StringBuilder();
            receipt.append("RECEIPT\n");
            receipt.append("Order ID: ").append(orderID).append("\n");
            receipt.append("Order Total: ").append(orderTotal).append("\n");
            receipt.append("Pizza Ingredients: ").append(pizzaIngredients).append("\n");
            receipt.append("Pizza Size: ").append(pizzaIngredients.split(", ")[0]).append(" (assuming size is related to ingredients order)\n");
            receipt.append("Extra Cheese: ").append(sides).append("\n");
            receipt.append("Side Dish: ").append(sides).append("\n");
            receipt.append("Drink: ").append(drinks).append("\n");
            return receipt.toString();
        }
    

    public static void main(String[] args) {
        Slice_o_Heaven pizzeria = new Slice_o_Heaven();
        pizzeria.takeOrder();
    
    }
}