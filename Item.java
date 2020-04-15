
package labfinal;

import static java.lang.Double.parseDouble;

public class Item {
    private  String itemnam;
    private double price;
    
    public Item(String itemnam,String price){
        this.itemnam=itemnam;
        this.price=parseDouble(price);
    }
    
    public void display( ){
        System.out.println("Item name " + itemnam + ".\nPrice  " + price);
        
    }
}
