// saving will inherit from Checking.
 public class Saving extends Checking{


// the intrest will be applied by using a formula given to us. 
    public void applyIntrest(float rateIn, int monthIn){
        this.balance = this.balance*(1+rateIn*monthIn);
    }
}

