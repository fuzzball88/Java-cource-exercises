public class ClientRegister {
    public static void main(String args[]) {
        CashClient client1 = new CashClient("Lisa", "101070-1111");
        AccountClient client2 = new AccountClient("Benny", "101070-1111");
        AccountClient client3 = new AccountClient("Barney", "040474-1571", "Someroad 3");
        Client client4 = new Client("Client", "111170-1111", "Road 4"); 
           
        client1.payCash(70);
        client2.deposit(100);
        client3.deposit(500);
        client2.withdraw(20);
        
        System.out.println(client2);
        System.out.println(client3);
    }
}



class Client{
	private String name,address,ID;
	
	public Client(String Name, String id, String Address){
		name = Name;
		address = Address;
		ID = id;
	}
	public Client(String Name, String id){
		name = Name;
		ID = id;
	}
	
	public String returnName(){
		return name;
	}
	public String returnID(){
		return ID;
	}
}


class CashClient extends Client{
	public CashClient(String Name, String id, String Address){
		super(Name,id,Address);
	}
	public CashClient(String Name, String id){
		super(Name,id);
	}
	
	public void payCash(double sum){
		name = returnName();
		id = returnID();
		System.out.println(name+id+": Amount paid "+sum+"euros.");
	}
}

class AccountClient extends Client{
	private double balance;
	
	public AccountClient(String Name, String id, String Address){
		super(Name,id,Address);
	}
	public AccountClient(String Name, String id){
		super(Name,id);
	}
	
	public String toString(){
		return name+ID+balance;
	}
	
	public void deposit(double amount){
		balance+=amount;
		System.out.println(name+id+" : "+amount);
	}
	public void withdraw(double amount){
		balance+=amount;
		System.out.println(name+id+" : "+amount);
	}

}

