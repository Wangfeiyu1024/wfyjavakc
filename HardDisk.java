package computerw;

public class HardDisk {
    int amount;
    float price;       //”≤≈Ãº€∏Ò
    String brand;      //”≤≈Ã∆∑≈∆
    
    HardDisk(){
    	
    }
    
    HardDisk(int amount){
    	this.amount =  amount;
    }
    
    HardDisk(int amount,float price,String brand){
    	this.amount =  amount;
    	this.price = price;
    	this.brand = brand;
    }
    
	public int getAmount() {
		return amount;
	}

	public void setAmount(int m) {
		this.amount = m;
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
