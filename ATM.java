public class ATM
{
public static void main(String[] args)
{
	double balance=2000.00;
	double withdraw=1500.00; 
try
{
	if(balance<withdraw)
	{
 		throw new Exception("Insufficient balance");
	}
	balance-=withdraw;
	System.out.println(" Withdrawel successful \n Remaining Balance :"+ balance);
}catch(Exception e){
System.out.println("Error :" +e.getMessage());
		}
	}
}
