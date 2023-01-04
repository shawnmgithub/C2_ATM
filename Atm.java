// the atm class will serve kind of as a main. it is where all of the other classes will come together to open and save user data
public class Atm{
public static void main(String[] args) {
    Atm atm = new Atm();

  }
// this is just my big test to make sure everything works together. will implement my idea from my alogrithm
public Atm(){
    System.out.println("test for checking::::");
    Checking account = new Checking();
    account.setBalance(1000);
    account.deposit(7);
    account.withdraw(7);
    System.out.println(account.getBalance());
    account.withdraw(2000);
    System.out.println("test for Saving....");
    Saving accounts = new Saving();
    accounts.setBalance(2000);
    accounts.withdraw(1000);
    System.out.println(accounts.getBalance());
    accounts.deposit(2000);
    System.out.println(accounts.getBalance());
    System.out.println("for the userclass");
    User user = new User("1333","000000");
    System.out.println(user.getPin());
    System.out.println(user.getAccountNum());
    user.setChecking(2000);
    user.setAccountNum("7355608");
    user.setPin("12345");
    user.setSaving(1000);
    System.out.println(user.getChecking());
    System.out.println(user.getPin());
    System.out.println(user.getAccountNum());
    System.out.println(user.getSaving());
}


}
