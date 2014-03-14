
/**
 * The Account class holds all the information about a bank account.
 * 
 * @author (sbrandon) 
 * @version (March 2014)
 */
public class Account
{
    //Class Variables
    private String accountNumber;
    private double balance;
    private Person person;
    
    //Constructor
    public Account(String accountNumber, Person person){
        this.accountNumber = accountNumber;
        this.balance = 0; //All accounts start with a balance of €0
        this.person = person;
    }
    
    /*
     * This method adds money into the account.
     * It takes an amount as a parameter.
     * the amount taken in is added to the balance.
     * We print a line to show what has happened.
     */
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("You put €" + amount + " in your account. Your balance is now €" + balance);
    }
    
    /*
     * This method takes away money from the account.
     * It takes an amount as a parameter.
     * the amount taken away from the balance.
     * We print a line to show what has happened.
     */
    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("You took €" + amount + " out of your account. Your balance is now €" + balance);
    }
    
    /*
     * The following methods are called 'get' methods. They are used to return
     * variables in the class. Notice that our return type has changed from 'void' to 'String' in this case
     * so we are returning a String value. Test it and see what happens!
     */
    
    //Get the account number
    public String getAccountNumber(){
        return accountNumber;
    }
    
    //Get the balance
    public double getBalance(){
        return balance;
    }
    
}
