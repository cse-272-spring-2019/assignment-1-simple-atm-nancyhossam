package application;
import java.util.Scanner;

public class user {
	
	private static  String CardNumber = "441999";
	Scanner scan=new Scanner(System.in);
	 private static String name="nancy";
	 private String balance="0";
	private String history[]=new String[5];
	 public String getName() {
		return name;
	}public int i=0;
	int j=i;
	 public String getHistory() {
			return history[i];
		}
	 public String get2History(){
		 return history[j];
	 }
		public void setHistory(String history) {
			this.history[i] = history;
		}
	
	public String getCardNumber() {
		return CardNumber;
	}
	public String getBalance() {
		
		return balance;
	}

	 public void setBalance(String balance) {
			this.balance = balance;
			
		}public String get2Balance() {
			
			String balance=getBalance();
			if((i<4)||(history[4]==null))
			{
				setHistory("balance:"+balance);
			i++;	
			j=i;
			}
			else
			{   int k;
			i=0;
				for(k=1;k<=4;k++)
				{   
					setHistory(history[k]);
					i++;
				}setHistory("balance:"+balance);
				j=i;
				}
			
		
			return balance;
		}

	 
	public void deposit(String value){
		
		int n1 = Integer.parseInt(value);
		int n2 = Integer.parseInt(balance);
		n2=n2+n1;
		setBalance(String.valueOf(n2));
		if((i<4)||(history[4]==null))
		{setHistory("deposit:"+value);
		j=i;
		i++;	
		}
		else
		{   int k;
		i=0;
			for(k=1;k<=4;k++)
			{   
			setHistory(history[k]);
			i++;
			}setHistory("deposit:"+value);
			j=i;
			}
		
	}
	
	public String previous(){
		
		if((j>=0)&&(j<=4)&&(j<=i))
		{
			
		String prev=get2History();
		j--;
		return prev;}
		else
		{j++;
			return "error";
		}
		}
	       
	public String next(){
		
		if((j<4)&&(j>=0)&&(j<=i)){
			j++;
		String prev=get2History();
		
	return prev;}
		else{
			return "error";}
		}
	
public void withdraw(String value){
	int n1 = Integer.parseInt(value);
	int n2 = Integer.parseInt(balance);
	n2=n2-n1;
	setBalance(String.valueOf(n2));
	 
	    if((i<4)||(history[4]==null))
		{setHistory("withdraw:"+value);
		j=i;
		i++;
		
		}
		else
		{   int k;
		i=0;
			for(k=1;k<=4;k++)
			{   
				setHistory(history[k]);
				i++;
			}setHistory("withdraw"+value);
			j=i;
			}
}

public Boolean validate(String name,String password)
{if(name.compareToIgnoreCase(user.name)!=0)
	return false;
if(password.compareToIgnoreCase(user.CardNumber)!=0)
	return false;
else 
	return true;
}

}
