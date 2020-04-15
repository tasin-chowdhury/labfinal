
package labfinal;


public class User {
 
    protected String userid,passwd;
    
    public User( String usrid, String pass ){
        this.userid = usrid;
        this. passwd = pass;
    }
    
    void display(){
        System.out.println(" ID: " + userid + "\npassword : " + passwd);
    }
    
}
