public class Palindrome
 {





	public static void main (String[] args)
	{
		
     int num=1234;
		
	System.out.print("Given number "+num);	
		int i=0;
		int j=0;
		
		while (num>0)
          {
		i=num%10;
		j=(j*10)+i;
		num= num/10;	
		 }

      System.out.println(j);

           if (num==j)
			 
		   {
		     System.out.println("The given number is palindrome " + j);
		   }
			   
          else
		  {
		  System.out.println("The given number is not a palindrome "+j);
		  }
		
		

	}
}
