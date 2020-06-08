package day10assignment;





public class BankAccountDetails {
	
	   public int id,id1;
	    public String name,number,type;
	    public float balance;

	    public BankAccountDetails(){
	    	id=101;
	    	number = "9000";
	    	name="Keerte";
	    	type="savings";
	    	balance = (float)22200.2;
	    
	    	
	    }
	    public BankAccountDetails(int id,String number, String name, String type, float balance){
	       this.id =id;
	    	this.name = name;
	        this.number = number;
	        this.type = type;
	        this.balance = balance;
	       
	    }
	    @Override
	    public boolean equals(Object obj) {
			if(this.toString().equals(obj.toString()))
				return true;
			else
				return false;
		}

	  @Override
	  public String toString() {
			String data = "id is :"+id+
					"\nNumber is : "+number+
					"\nName is : "+name+
					"\nType is : "+type+
					"\nbalance is "+balance;
			return data;
		}
	  
	  
	
public static void main(String args[]) {
	BankAccountDetails details1 = new BankAccountDetails(1,"9000","Keerte","savings",(float)4000.2);
	BankAccountDetails details2 = new BankAccountDetails(2,"9001","Prabhu","current",(float)3500.3);
	System.out.println(details1);
	System.out.println(details2);
	if(details1.equals(details2))
		System.out.println("Both have same details");
	else
		System.out.println("Both have different data");
	
}
}
