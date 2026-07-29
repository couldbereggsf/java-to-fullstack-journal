
public class Constructor {
    /*
     * // The this keyword
     * The this keyword is a reference variable in Java that points to the current
     * object-the object whose method
     * or constructor is currently being executed. It serves as a bridge to resolve
     * naming conflicts and manage object context.
     * Primary Use Cases
     * 1. Resolving Variable Shadowing (Instance vs. Local Scope): When a method or
     * constructor parameter has exact same name
     * as an instance variable, the local parameter "shadows" the instance variable.
     * Using thi. explicitly targets the class-level field.
     * 2. Constructor Chaining (this()): You can use this() inside a constructor to
     * call another constructor within the same class, reducing code
     * code duplication. This must always be the first statement in th constructor
     * block.
     * 3. Passing the Current Object: You can pass this as an arguement to other
     * methods or external classes when an object needs to hand a reference
     * to itself.
     */
    private String username;
    private String email;

    // Constructor 1: Parameterized
    public Constructor(String username, String email) {
        // 'this.username refers to the instance variable; 'username' is the local
        // variable
        this.username = username;
        this.email = email;
    }

    // Constructor 2: Chaining to Constructor 1
    public Constructor(String username) {
        this(username, "default@reggsltd.com");// Calls the two-arguement constructor
    }
    //Helper method to display the account details
    public  void printDetails(){
        System.out.println("Username: " + username + " | Email: " + email);
    }

    //The main method
    
    public static void main(String[] args) {
        // 1. Testing Constructor 1 (passing both username and email)
        Constructor user1 = new Constructor("reggs_dev", "reggs@reggsltd.com");
        
        // 2. Testing Constructor 2 (passing only username, which chains to the default email)
        Constructor user2 = new Constructor("fiam_admin");

        //Display the results
        user1.printDetails();
        //Output: Username: reggs_dev | Email: reggs@reggsltd.com

        user2.printDetails();
        //Output: Username: fiam_admin | Email : default@reggsltd.com
    }
}