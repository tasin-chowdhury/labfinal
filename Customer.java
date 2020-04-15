
package labfinal;

public class Customer extends User {
    
    private String name,email;
    
    public Customer(String usr,String pass){
        super(usr,pass);
        this.name=name;
        this.email=email;
    }
    public static void main(String[] args){
        User a = new Customer("tasin","12345678");
        a.display();
        Item b = new Item("Product","2.00");
        b.display();
    }
}
