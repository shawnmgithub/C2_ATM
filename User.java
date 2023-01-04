//user class
public class User{
//The user class will have a pin(string),accountNum(String), Checking(object),and SavinG(Objet)
private String pin;
private String accountNum;
private Checking checking = new Checking() ;
private Saving saving = new Saving();
public User(String pinIn,String accountNumIn){
this.pin = pinIn;
this.accountNum = accountNumIn;
}
public String getPin(){
    return this.pin;
}
public void setPin(String pinIn){
    this.pin = pinIn;
}

public String getAccountNum(){
    return this.accountNum;
}
public void setAccountNum(String accountNumIn){
    this.accountNum = accountNumIn;
}
public double getChecking(){
    return this.checking.getBalance();
}

public void setChecking(double checkingIn){
    this.checking.setBalance(checkingIn);
}

public double getSaving(){
    return this.saving.getBalance();
}

public void setSaving(double savingIn){
    this.saving.setBalance(savingIn);
}

}

