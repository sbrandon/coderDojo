
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
    public Account(Person person){
        this.accountNumber = generateAccountNumber(person); //Calling a method
        this.balance = 0; //All accounts start with a balance of €0
        this.person = person;
    }
    
    /* 
     * This method generates an account number
     * using the persons phone number and name.
     * To do this we need to take in a person object
     * as a parameter.
     * Why use the phone number?
     */
    public String generateAccountNumber(Person person){
        String name  = person.getName();
        String phoneNumber = person.getPhoneNumber();
        String newAccountNumber = phoneNumber + name.charAt(0) + name.charAt(1) + name.charAt(2);
        return newAccountNumber;
    }
    
    public void transfer(double amount, Account payeeAccount){
        if(balance - amount < 0){
            System.out.println("Sorry you don't have enough money in your account to make the transfer.");
        }
        else{
            balance = balance - amount;
            payeeAccount.deposit(amount);
            System.out.println("You transfered €" + amount + " to " + payeeAccount.person.getName() + " account. Your balance is now €" + balance);
        }
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
        if(balance - amount < 0){
            System.out.println("Sorry you don't have enough money in your account.");
        }
        else{
            balance = balance - amount;
            System.out.println("You took €" + amount + " out of your account. Your balance is now €" + balance);
        }
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
