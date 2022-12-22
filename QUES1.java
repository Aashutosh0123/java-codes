import java.util.Scanner;

public class QUES1 {
	
	public static void main(String[] args) {
		
		
		
		
		Scanner input = new Scanner(System.in);
		
		
		String[] itemName = new String[3];
		
		int[] quantity = new int[3];
		
		
		double[] price = new double[3];
		
		double[] itemTotal = new double[3];
		
		
		double[] salesTax = new double[3];
		
		char[] type = new char[3];
		
		
		double[] subTotal = new double[3];
		
		char choice=0;
		
		int i=0;
		
		
		
		
		do {
			
			
			
			System.out.println("Enter the name of item :");
			itemName[i] = input.next();
			
			
			
			System.out.println("Enter the price of item :");
			price[i] = input.nextDouble();
			
			
			
			System.out.println("Enter the quantity of item : ");
			quantity[i] = input.nextInt();
			
			
			System.out.println("Enter the  type of item (Raw/Manu) : ");
			type[i]=input.next().charAt(0);
			
			
			
			input.nextLine();
			
			
			itemTotal[i] = quantity[i] * price[i];
			
			
			
			if(type[i]=='R')
			{
				salesTax[i] = itemTotal[i] * 0.155;
				subTotal[i] = itemTotal[i] + salesTax[i];
			}
			
			
			else if (type[i]=='M')
			{
				salesTax[i]=itemTotal[i] * 0.205;
				subTotal[i] = itemTotal[i] + salesTax[i];
			}
			
			
			i++ ;
			
			System.out.println("if you want to continue (Y/N) : ");
			choice = input.next().charAt(0);
			
		}while(choice=='Y'||choice=='y');
		
		
		input.close();
		
		
		
		
		
		System.out.println("Total bill:");
		
		
		
		
		
		System.out.printf("%-30s %-10s %-10s %-10s %-10s %-10s %-10s%n", "Item", "Price", "Quantity","Type","Totalitems","Sale Tax","SubTotal");
		
		
		for(i=0;i<3;i++)
			
			
		{
			
			
		System.out.printf("%-30s %-10.2f %-10d %-10s %-10.2f %-10.2f %-10.2f%n", itemName[i],price[i],quantity[i],type[i],itemTotal[i],salesTax[i],subTotal[i]);
		}
		
	}

}
