import java.util.Scanner;



import java.io.*;




class UnsupportedTransactionException extends Exception
{
    
    @Override
    
    
    public String getMessage()
    {
        return "Unsupported Transaction Exception";
    }
}

class QUES3


{
	void transaction(String transactionType)
	{
		
		
		
		
        String expression = transactionType;   
        
        
        switch(expression)
        
        
        
        
        {
            case "Credit": 
            System.out.println("Credit");
            break;
            
            
            
            case "Debit":
            System.out.println("Debit");
            break;
            
            
            
           case "Balanceinquiry": 
            System.out.println("Balanceinquiry");
            break;
            
            
            case "Pinchange": 
            System.out.println("Pinchange");
            break;
            
            
            default: try {
                throw new UnsupportedTransactionException();
            } catch (Exception e) {
                
                System.out.println(e.getMessage());
            }
        }
}
	
	
	
	

	public static void main(String[] args) 
	{
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter your choice: ");
		String transaction=sc.next();
		
		QUES3 q=new QUES3();
		q.transaction(transaction);

	}

}