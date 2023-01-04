//Checking class
// the checking class will have a balance(double)
public class Checking{
    protected double balance;

public Checking(){
}

public double getBalance(){
    return this.balance; 
}

public void setBalance(double balanceIn){
    this.balance = balanceIn;

}

public void deposit(double depoIn){
    this.balance = this.balance + depoIn;
}
public void withdraw(double withIn){
    if(balance<withIn){
        System.out.println("not enough in the account to withdraw");
    }
   else{
       this.balance = this.balance - withIn;
   } 
}
}   
