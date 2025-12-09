

// A+ level:
// Add a method: public double getRevenue()
// Return the total amount of money that has been made from this slot:
// itemsSold * price

public class SnackMachineSlot {
    private String item;
    private double initialPrice;
    private int initialQuantity;
    private int itemsSold;
    private double revenue;

    public SnackMachineSlot(String items, double prices, int quantity){
        item = items;
        if(prices < 0){
            initialPrice = 0;
        }else{
            initialPrice = prices;
        }
        
        if(quantity < 0){
            initialQuantity = 0;
        }else{
            initialQuantity = quantity;
        }
        
        itemsSold = 0;      
    }

    public void purchaseOne(){
        if(initialQuantity > 0) {
            initialQuantity = initialQuantity - 1;
            itemsSold += 1;
        }else if(initialQuantity == 0){
            initialQuantity = initialQuantity; 
        }
    }

    public double getRevenue(){
        revenue = itemsSold * initialPrice;
        return revenue;
    }

    public String toString(){
        return "Item: " + item + ", " + "Price: " + initialPrice + ", " + "In Stock: " + initialQuantity;
    }
}


