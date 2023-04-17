package com.driver;

public class Pizza {

    private int price=0;
    private Boolean isVeg;
    private Boolean isCheeseAdded = false;
    private Boolean isToppingAdded = false;
    private Boolean isTakeaway = false;
    private String bill;

    //Prices of Products
    private int vegPizzaPrice = 300;
    private int nonVegPizzaPrice = 400;
    private int cheesePrice = 80;
    private int vegToppingPrice = 70;
    private int nonVegToppingPrice = 120;
    private int paperBagPrice = 20;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg) {
            price += vegPizzaPrice;
            bill = "Base Price Of The Pizza: "+vegPizzaPrice+"\n";
        }
        else {
            price += nonVegPizzaPrice;
            bill = "Base Price Of The Pizza: "+nonVegPizzaPrice+"\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded) {
            isCheeseAdded = true;
            price += cheesePrice;
        }
        return ;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingAdded ) {
            isToppingAdded = true;
            if(isVeg) {
                price += vegToppingPrice;
            }
            else {
                price += nonVegToppingPrice;
            }
        }
        return ;
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeaway) {
            isTakeaway = true;
            price += paperBagPrice;
        }
        return;
    }

    public String getBill(){
        // your code goes here
        if(isCheeseAdded) {
            bill += "Extra Cheese Added: "+cheesePrice+"\n";
        }
        if(isToppingAdded && isVeg) {
            bill += "Extra Toppings Added: "+vegToppingPrice+"\n";
        }
        if(isToppingAdded && !isVeg) {
            bill += "Extra Toppings Added: "+nonVegToppingPrice+"\n";
        }
        if(isTakeaway) {
            bill += "Paperbag Added: "+paperBagPrice+"\n";
        }
        bill += "Total Price: "+price+"\n";
        return this.bill;
    }
}
